package chatting.client.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

import chatting.client.*;
import chatting.client.ui.*;
import chatting.client.thread.*;

public class ButtonEvent implements ActionListener {
	public ClientController main;
	
	public ButtonEvent(ClientController main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤버튼이 눌려졌는지 먼저 알아낸다.
		String str = e.getActionCommand();
		
		switch(str) {
		case "로그인":
			loginProc();
			break;
		case "종료":
			exitProc();
			break;
		case "send":
			sendProc();
			break;
		}
	}
	
	// 로그인처리함수
	public void loginProc() {
		String sid = main.loginFr.inId.getText(); // 아이디 읽어오고
		String spw = new String(main.loginFr.inPw.getPassword()); // 비밀 번호 읽어오고
		// 소켓 준비하고
		try {
			main.socket = new Socket("192.168.0.21", 7788);
			
			// 스트림 준비
			InputStream in = main.socket.getInputStream();
			OutputStream out = main.socket.getOutputStream();
			
			InputStreamReader tmp = new InputStreamReader(in);
			main.br = new BufferedReader(tmp);
			
			main.prw = new PrintWriter(out);
			
			String str = "210" + sid + "|" + spw;
			main.prw.println(str);
			main.prw.flush();
			
			String msg = main.br.readLine();
			
			if(msg.substring(0, 3).equals("110")) {
				if(msg.charAt(3) == 'Y') {
					main.loginFr.setVisible(false);
					main.frame.setVisible(true);
					
					ReceiveThread t = new ReceiveThread(main); // New Born 상태
					t.start(); // Runnable 상태로 전위
				} else {
					// 먼저 입력내용 모두 지우고
					main.loginFr.inId.setText("");
					main.loginFr.inPw.setText("");
				}
			} else if(msg == null) {
				// 이 경우는 서버가 보낸 메세지를 제대로 받을 수 없는 경우이므로 즉시 종료한다.
				main.close();
			}
		} catch(Exception e) {
			// 이상황은 통신에 문제가 있는 경우이므로 즉시 프로그램을 종료시킨다.
			e.printStackTrace();
			main.close();
		}
		
	}
	
	// 종료 처리함수
	public void exitProc() {
		System.exit(0);
	}
	
	// 메세지 보내기 처리함수
	public void sendProc() {
		// 할일
		// 		입력내용 알아내고
		String msg = main.frame.input.getText();
		if(msg == null) {
			return;
		}
		msg = 230 + msg;
		main.prw.println(msg);
		main.prw.flush();
		
		// 입력창 비워주고
		main.frame.input.setText("");
	}
	
}
