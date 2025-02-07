package cn.sunjian.net_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP传输：接收端
 * 
 * @author jack
 *
 */

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("接收端启动。。。。。");

		/*
		 * 建立UDP接收端的思路。
		 * 
		 * 思路：
		 * 	1.建立UDP Socket服务；因为是要接收数据，必须要明确一个端口号。
		 * 	2.创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据。
		 * 	3.使用Socket服务的receive方法将接收的数据存储到数据包中。
		 * 	4.通过数据包的方法解析数据包中的数据。
		 * 	5.关闭资源。
		 */
		
		//1.建立UDP Socket服务，并绑定一个与发送端一致的端口
		DatagramSocket ds = new DatagramSocket(10000);
		
		//2.创建数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//3.使用接收方法将数据存储到数据包中
		ds.receive(dp);//阻塞式的。如果没有收到数据时，就会一直等。
		
		//4.通过数据包对象的方法，解析其中的数据，比如：地址、端口、数据内容。
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();//发送端的端口
		String text = new String(dp.getData(),0,dp.getLength());//取数据包中的有效数据
		
		System.out.print(ip+":");
		System.out.print(port+":");
		System.out.println(text);
		
		//5.关闭资源
		ds.close();
	}

}
