package com.sunjian.chatroom_plus;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.sunjian.chatroom.ServerThread;

/**
 * 服务器端的主类一样只是建立ServerSocket来监听来自客户端Socket的连接请求
 * 
 * @author jack
 *
 */
public class Server {

	private static final int SERVER_PORT = 30000;
	//使用CrazyitMap对象来保存每个客户名字和对应输出流之间的对应关系
	public static CrazyitMap<String, PrintStream> clients = new CrazyitMap<>();
	
	public void init(){
		try {
			//建立监听的ServerSocket
			ServerSocket ss = new ServerSocket(SERVER_PORT);
			
				//采用死循环来不断地接收来自客户端的请求
				while(true){
					Socket socket = ss.accept();
					new ServerThread(socket);
				}
			
		} catch (IOException e) {
			//如果抛出异常
			System.out.println("服务器启动失败，是否端口"+SERVER_PORT+"已被占用？");
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.init();
	}
}
