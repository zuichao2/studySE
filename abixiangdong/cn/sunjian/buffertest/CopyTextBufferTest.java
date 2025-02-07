package cn.sunjian.buffertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyTextBufferTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"/files/bixiangdong/others/";
		
		FileReader fr = new FileReader(path +"buf.txt");
		BufferedReader bufr = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(path+"buf_copy.txt");
		BufferedWriter bufw = new BufferedWriter(fw);
		
		String line = null;
		while((line=bufr.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		/*int ch = 0 ;
		while((ch=bufr.read())!=-1){
			bufw.write(ch);
		}*/
		bufw.close();
	}

}
