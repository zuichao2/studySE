package cn.sunjian.io.showmenu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 练习：单人信息管理程序：
 * 
 * 		写入、读取对象
 * 
 * @author sunjian
 *
 */
public class FileOperate {

	private File file = null;
	
	public FileOperate(String str){//构造传递文件路径
		this.file = new File(str);
	}
	
	//对象序列化（就是使用对象输出流写入对象）
	public boolean save(Object obj) throws Exception{//保存对象
		
		ObjectOutputStream oos = null;//对象输出流
		boolean flag = false;//定义操作标志位
		
		try{
			oos = new ObjectOutputStream(new FileOutputStream(this.file));
			oos.writeObject(obj);//写入对象
			flag = true;
		}catch(Exception e){
			throw e;//有异常交给被调用处处理
		}finally {
			oos.close();//关闭对象输出流
		}
		
		return flag;
	}
	
	//对象反序列化（就是使用对象输入流读取对象）
	public Object load() throws Exception{
		Object obj = null;//接收读取的内容
		ObjectInputStream ois = null;//对象输入流
		
		try {
			ois = new ObjectInputStream(new FileInputStream(this.file));
			obj = ois.readObject();//读取对象
		} catch(Exception e){
			throw e;
		}finally {
			ois.close();
		}
		
		return obj;
	}
}
