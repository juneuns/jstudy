package chatting.server;

/*
	채팅을 관리하는 서버
		1. 접속 대기 소켓을 준비한다.
		2. 접속받는다.
		3. 접속자가 독립적으로 사용할 스레드 클래스를 만든다.
		4. 이 안에서 데이터를 주고 받도록 한다.
			데이터를 줄때는 모든 접속자에게 데이터를 주도록 처리한다.
 */

import java.io.*;
import java.net.*;
import java.util.*;

import chatting.server.thread.*;
public class ChatServer01{
	ServerSocket server;
	
	public ArrayList<ServerTrd01> clientList; // 접속자 관리할 변수
	public ChatServer01() {
		// 1. 접속 대기 소켓을 준비한다.
		try {
			server = new ServerSocket(7788);
			clientList = new ArrayList<ServerTrd01>();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println("### 서버 준비 완료 ###");
		
		
		while(true) {
			try {
				// 2. 접속 받는다.
				Socket socket = server.accept();
				
				/*
					3. 해당 클라이언트와 통신할 전담 프로그램을 만들어서 배정한다.
						이 프로그램은 독립적으로 실행되어야 하고
						스레드로 만들어야 한다.
				 */
				
				ServerTrd01 t = new ServerTrd01(this, socket);
				t.start();
				
			} catch(Exception e) {
				System.out.println("********** 3 : " + clientList.size());
				System.out.println("클라이언트 접속 종료");
//				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer01();
	}
}
