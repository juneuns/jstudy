package day30.network;

/*
	클라이언트가 접속하면 접속을 받고
	클라이언트가 준 데이터를 받고
	적당한 내용을 응답하는 
	서버를 만들어보자.
 */

import java.net.*;
import java.io.*;
public class PingServer01 {

	public PingServer01() {
		// 대표전화(접속만 받는 전화기)를 만들어 놓는다.
		ServerSocket server = null;
		try {
			// 7777번 으로 접속을 요청하는 것을 받을 준비를 한다.
			server = new ServerSocket(7777);
			System.out.println("*** 서버 접속 대기 ***");
			
			Socket socket = server.accept();
			/*
				이 함수는 Blocking 함수이다.
				즉, 특정한 요건이 만족되지 않으면 실행되지 않는 함수이다.
				
				참고 ]
					우리가 사용했던 함수중에서
						System.in.read() 
					도 블럭킹함수이다.
					
				accept()는 누군가 접속을 해야만 실행되는 함수이다.
				이 함수가 실행되었다는 것은 
				누군가 접속했다는 것이고
				그러면 담당자 전화기를 배정해 줘야 한다.
				
				즉, 반환값으로 실제로 통신할 전화기를 배정한다.
			 */
			System.out.println("### 서버 접속 완료 ###");
			/*
				이 곳을 실행하는 경우는
				누군가 접속을 했다는 것을 의미하고
				그 사람하고 통신할 전화기도 배정받았다는 것을 의미한다.
				
				따라서 그 전화기를 이용해서 상대방과 통신을 할 수 있게 됬고
				자바 답게 스트림방식으로 통신을 해야 한다.
			 */
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
//			위의 두 스트림은 byte 단위 스트림이므로
			byte[] buff = new byte[1024];
			int len = in.read(buff);
			String str = new String(buff, 0, len);
			System.out.println("서버가 받은 데이터 : " + str);
			
			// 적당한 내용을 보낸다.(응답한다.)
			str = str + " - 잘 받았음 -";
			buff = str.getBytes(); // 응답할 byte[] 준비...
			out.write(buff);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingServer01();
	}

}
