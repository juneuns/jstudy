package chatting.server.thread;

/*
	각각의 접속한 클라이언트와 대화를 나눌 프로그램을 독립적으로 제작해서 사용할 예정이다.
	
	이 프로그램은 클라이언트와 대화를 할 목적으로 만든것이다.
	따라서 서버의 메인 프로그램과 연결이 되어 있어야 한다.
 */

import java.io.*;
import java.net.*;
import java.util.*;

import chatting.server.*;
import chatting.server.dao.*;

public class ServerTrd01 extends Thread {
	ChatServer01 main;
	
	// 필수 통신 변수
	Socket socket;
	
	public PrintWriter prw ;
	public BufferedReader br;
	String id;
	
	public ServerTrd01(ChatServer01 main, Socket socket) throws Exception {
		this.main = main;
		this.socket = socket;
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		prw = new PrintWriter(out);
		
		InputStreamReader tmp = new InputStreamReader(in);
		br = new BufferedReader(tmp);
		
	}
	
	// euns|12345 로 넘어오는 로그인 요청 처리함수
	public void loginProc(String msg) {
		MemberDao mDao = new MemberDao();
		// 아이디와 비밀번호를 뽑는다.
		id = msg.substring(0, msg.indexOf('|'));
		String pw = msg.substring(msg.indexOf('|') + 1);
		int cnt = mDao.getLogin(id, pw);
		
		if(cnt == 1) {
			synchronized(main.clientList) {
				main.clientList.add(this);
			}
			msg = "110Y";
		} else {
			msg = "110N";
		}
		
		prw.println(msg);
		prw.flush();
	}
	
	// 채팅 메세지 전담 처리함수
	public void chatProc(String msg) {
		// 할일
		// 모든 채팅 참여자에게 한번씩 데이터를 보내주면 된다.
		// 대신 앞에 '130아이디 ] 메세지'
		// 의 형태로 만들어서 보낸다.
		msg = 130 + id + " ] " + msg;
		
		synchronized(main.clientList) {
			// 접속한 클라이언트가 몇명인지 알아내고
			int cnt = main.clientList.size();
			
			for(int i = 0 ; i < cnt ; i++ ) {
				// 한사람씩 정보를 꺼내고
				ServerTrd01 tmp = main.clientList.get(i);
				
				tmp.prw.println(msg);
				tmp.prw.flush();
			}
		}
	}
	
	@Override
	public void run() {
		try {
			// 클라이언트와 통신을 한다.
			while(true) {
				String msg = br.readLine();
				System.out.println(main.clientList.size() + " | " + msg);
				if(msg == null) {
					break;
				}
				System.out.println("*** thread msg : " + msg.substring(0, 3));
				int code = Integer.parseInt(msg.substring(0, 3));
				msg = msg.substring(3);
				
				switch(code) {
				case 210:
					loginProc(msg);
					break;
				case 230:
					chatProc(msg);
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			main.clientList.remove(this);
			try {
				prw.close();
				br.close();
				socket.close();
			} catch(Exception e) {}
		}
	}
}
