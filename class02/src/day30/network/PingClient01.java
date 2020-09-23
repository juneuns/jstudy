package day30.network;

/*
	서버에 접속한 후
	특정 데이터를 서버에 보내고
	서버가 다시 응답하는 데이터를 받는 프로그램
 */
import java.net.*;
import java.io.*;
import javax.swing.*;
public class PingClient01 {

	public PingClient01() {
		// 상대방과 통신을 하기위해서는 통신 도구가 필요하다.
		// 이 통신 도구의 역할을 하는 클래스가 Socket 이다.
		Socket socket = null;
		try {
			// 소켓을 만들면 상대방과 자동적으로 접속이 이루어 진다.
			socket = new Socket("192.168.0.21", 7777);
			// 포트 번호는 접속받은 프로그램(서버프로그램)에서 지정한 번호여야 한다.
			// 이제 접속이 되었다는 것이고....
			
			// 상대방과 통신을 하면 된다.
			// 통신 방법은 스트림을 이용해서 처리한다.
			// 1. 타겟스트림
			// 		getInputStrea() | getOutputStream()
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			// 먼저 데이터를 서버에 보내자.
			String str = "첫번째 네트워크 프로그램 핑(전은석)";
			byte[] buff = str.getBytes();
			// 이제 내보내면 된다.
			out.write(buff);
			
			// 서버가 응답해준 데이터를 받아보자.
			buff = new byte[1024];
			int len = in.read(buff);
			str = new String(buff, 0, len);
//			System.out.println("받은 내용 : " + str);
			JOptionPane.showMessageDialog(null, "받은 내용 : " + str );
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new PingClient01();
	}

}
