package chatting.client.thread;

import chatting.client.*;
import javax.swing.*;
import java.io.*;
public class ClientTrd01 extends Thread {
	ChatClient01 main;
	
	public ClientTrd01(ChatClient01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		// 할일
		// 데이터를 계속 받아본다.
		try {
			// 서버가 데이터를 몇번을 줄지 알수 없으므로 반복해서 처리한다.
			while(true) {
				// 이제 데이터를 받자
				// 스트림을 통해서 받아야 한다.
				String msg = main.br.readLine();
				if(msg == null) {
					break;
				}
				
				// 받은 데이터를 출력한다.
//				String old = main.area.getText();
//				msg = old + msg + "\n";
//				main.area.setText(msg);
				main.area.append(msg + "\n");
				// 스크롤바 처리
				main.span.getVerticalScrollBar().setValue(main.span.getVerticalScrollBar().getMaximum());
			}
		} catch(Exception e) {
			// 받는쪽에서 문제가 생기면 이 프로그램도 못쓰는 프로그램이다.
			main.close();
		}
	}
}
