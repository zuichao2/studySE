package cn.sunjian.net_tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	/*客户端发数据到服务端
	 * 
	 * TCP传输，客户端建立的过程
	 * 1.创建TCP客户端Socket服务，使用的是Socket对象。
	 * 		建议该对象一创建就明确目的地。要连接的主机。
	 * 2.如果连接建立成功，说明数据传输通道已建立。
	 * 		该通道就是Socket流，是底层建立好的，既然是流，说明这里既有输入又有输出。
	 * 		想要输入或者输出流对象，可以找Socket来获取。
	 * 		可以通过getOutputStream()和getInputStream()来获取两个字节流。
	 * 3.使用输出流，将数据写出。（写到网络中指定的主机上）
	 * 4.关闭资源。
	 * 		
	 */
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//创建客户端Socket服务
		Socket socket = new Socket("10.2.1.96", 10002);
		
		//获取Socket流中的输出流
		OutputStream out = socket.getOutputStream();//（此流不用关，因为是Socket流中的输出流，所以关闭Socket流后就不用关了）
		
		//使用输出流将指定的数据写出去
		out.write(":tcp 演示：哥们又来了！".getBytes());//因为是字节流所以使用getBytes()方法
		
		//关闭资源(其实就是将连接断开)
		socket.close();
	}

}
