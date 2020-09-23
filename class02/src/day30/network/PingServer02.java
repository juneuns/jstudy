package day30.network;

import java.io.*;
import java.net.*;
/*
	여러 클라이언트의 접속을 받아서 
	응답 해줄 수 있는 서버를 만들어 보자.
 */
public class PingServer02 {
	ServerSocket server;
	
	public PingServer02() {
		try {
			server = new ServerSocket(7777);
		} catch(Exception e) {
			e.printStackTrace();
			// 이 부분이 실행되는 경우는 서버소켓을 만들다 오류가 나는 경우이다.
			// 따라서 서버로서의 기능을 상실한 경우에 해당한다.
			// 고로 이 프로그램의 실행의 의미가 없다.
			System.exit(0);
		}
		
		System.out.println("*** 서버 준비 완료 ***");
		while(true) {
			try {
				// 누군가 접속하다가 문제가 생기는 경우더라도
				// 반복문을 유지하므로 다음 접속자 처리가 가능해진다.
				Socket socket = server.accept();
				
				InetAddress inet = socket.getInetAddress();
				// IP 꺼내오고
				String ip = inet.getHostAddress();
				System.out.println("[ " + ip + " ] 님 접속");
				
				// Stream 준비하고
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				// 데이터 꺼내고
				byte[] buff = new byte[1024];
				int len = in.read(buff);
				// 배열을 문자열로 변환하고
				String msg = new String(buff, 0, len);
				System.out.println(ip + " ] " + msg);
				
				// 응답 내용 만들어서 전송하고
				msg = "server ] 데이터 잘 받았음!";
				buff = msg.getBytes();
				out.write(buff);
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PingServer02();
	}

}
