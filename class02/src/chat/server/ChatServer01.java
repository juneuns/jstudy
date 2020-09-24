package chat.server;

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

import chat.server.thread.*;
public class ChatServer01{
	ServerSocket server;
	/*
		내가 준 데이터는 다른 클라이언트에게도 전달해야 한다.
		따라서 서버 입장에서는
		자신에게 접속한 클라이언트의 정보를 알고 있어야 한다.
		
		따라서 서버에 접속한 클라이언트의 정보를 기억할 변수를 준비한다.
	 */
	public ArrayList<ServerTrd01> clientList;
//	public HashMap<String, String> map; // id = ip
	
	public ChatServer01() {
		// 접속 대기 소켓을 준비한다.
		try {
			server = new ServerSocket(7788);
			clientList = new ArrayList<ServerTrd01>();
//			map = new HashMap<String, String>();
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println("### 서버 준비 완료 ###");
		
		/*
			이제 접속을 계속 받으면 된다.
			==> 반복 처리한다.
		 */
		while(true) {
			try {
				Socket socket = server.accept();
				
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				PrintWriter prw = new PrintWriter(out);
				
				InputStreamReader tmp = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(tmp);
				
				// 먼저 로그인 처리
				String str = br.readLine(); // id=euns ==> euns
				String id = str.substring(str.indexOf('=') + 1);
				if(id.equals(" ") || id == null) {
					id = "못난이";
				}
				// 응답 메세지 전송
				prw.println("OK");
				prw.flush();
				System.out.println("######### server id : " + id);
				
				/*
					어제는 지금 만들어진 접속을 가지고 여기서 처리를 했다.
					지금은 각각의 클라이언트와 대화하는 프로그램을 독립적으로 만들 예정이다.
				 */
				ServerTrd01 t = new ServerTrd01(this, socket, id);
				clientList.add(t);
				/*
					t 안에는 그 클라이언트에 대한 모든 정보를 변수로 준비하고 있고
					t를 통째로 넣어주면 필요할 때 저어보를 꺼내서 사용할 수 있게된다.
				 */
				t.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatServer01();
	}

}
