package chatting.client.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
		
	}
	
	// 종료 처리함수
	public void exitProc() {
		System.exit(0);
	}
	
	// 메세지 보내기 처리함수
	public void sendProc() {
		
	}
	
}
