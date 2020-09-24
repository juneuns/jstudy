package chat.server.thread;

/*
	각각의 접속한 클라이언트와 대화를 나눌 프로그램을 독립적으로 제작해서 사용할 예정이다.
	
	이 프로그램은 클라이언트와 대화를 할 목적으로 만든것이다.
	따라서 서버의 메인 프로그램과 연결이 되어 있어야 한다.
 */

import chat.server.*;
import java.io.*;
import java.net.*;
import java.util.*;
public class ServerTrd01 extends Thread {
	ChatServer01 main;
	
	// 통신 변수
	Socket socket;
	public PrintWriter prw ;
	public BufferedReader br;
	String ip, id;
	
	
	public ServerTrd01(ChatServer01 main, Socket socket, String id) throws Exception {
		this.main = main;
		this.socket = socket;
		this.id = id;
		
		/*
			아래부분은 원칙적으로 예외처리를 해줘야 하는 부분이다.
			그런데
			이 클래스의 목적은 해당 클라이언트와 통신할 목적이다.
			그런데 
			만약 스트림을 만들지 못한다면 대화를 못할 것이다.
			따라서 이 프로그램의 존재의 이유가 없어진다.
		 */
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
//		prw = new PrintWriter(out);
		
		InputStreamReader tmp = new InputStreamReader(in);
//		br = new BufferedReader(tmp);
		
		// 아이피 얻어내고
		InetAddress inet = socket.getInetAddress();
		ip = inet.getHostAddress();
		
//		main.map.put(id, ip);
	}
	
	public void sendMsg(String msg) {
		/*
			msg 안에는 클라이언트가 준 대화내용이 기억되어 있다.
			우리는 응답을 
				
				jiwoo ] xxxxxxxx
				
			따라서 응답내용을 꾸며준다.
		 */
		msg = id + " ] - " + msg;
		
//		System.out.println("*** server msg : " + msg);
		
		// 이제 메세지는 준비되었고 준비된 메세지를 모든 접속한 클라이언트에게 뿌려주면 된다.
		int size = 0; // 전송될 클라이언트의 명수를 기억할 변수
		
		/*
			참고 ]
				응답은 동시에 처리하지 못하고 한사람씩 반복해서 처리해줘야 한다.
				그런데 클라이언트의 정보는 clientList 에 기억해서 처리할 예정이다.
				그렇다면 응답은 clientList에 등록된 사람에 한해서 처리해줘야 한다.
				그런데 응답을 하는 도중 새로운 접속자가 발생하면
				프로그램이 오류가 발생할 수 있다.
				따라서 응답을 도중에는 리스트를 수정하지 못하도록 처리한다.
		 */
		synchronized(main.clientList) {
			size = main.clientList.size();
			
			for(int i = 0 ; i < size ; i++ ) {
				// 클라이언트 정보를 꺼낸다.
				ServerTrd01 tmp = main.clientList.get(i);
				
				tmp.prw.println(msg);
				tmp.prw.flush();
			}
		}
		
	}
	
	@Override
	public void run() {
		// 할일
		try {
			while(true){
				// 요청 받고
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				// 응답하고
				sendMsg(msg);
			}
		} catch(Exception e) {
			// 이 경우는 이 스레드는 사용할 수 없는 스레드이다.
			// 따라서 자신이 사용하던 모든 자원을 반환해줘야 한다.
			try {
				prw.close();
				br.close();
				socket.close();
			} catch(Exception e1) {}
			
			// 이 클라이언트는 접속이 끊어진 상태이므로
			// 접속자 리스트에서 제거해줘야 한다.
			main.clientList.remove(this);
//			main.map.remove(id);
		}
	}
}
