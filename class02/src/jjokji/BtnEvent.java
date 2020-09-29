package jjokji;

import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class BtnEvent implements ActionListener {
	SendFrame sFr;
	
	public BtnEvent(SendFrame sFr) {
		this.sFr = sFr;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 할일
		// 어떤 버튼이 눌려졌는지 알아낸다.
		JButton tmp = (JButton) e.getSource();
		if(tmp == sFr.sendB) {
			sendProc();
		} else if(tmp == sFr.resetB) {
			resetProc();
		} else if(tmp == sFr.exitB) {
			exitProc();
		}
	}
	
	public void sendProc() {
		// 할일
		// 1. 보낼 내용 알아내고
		String msg = sFr.area.getText();
		byte[] buff = msg.getBytes();
		// 2. 받는 사람 주소 알아내고
		String ip = (String) sFr.main.idToIp.get(sFr.field.getText());
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		} catch(Exception e) {}
		// 3. 패킷을 만들고
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff, buff.length, inet, 9999);
			/*
				DatagramPacket 생성방법
					
					DatagramPacket(byte배열, 배열길이, 받는사람 주소(InetAddress), 포트번호) 
			 */
			
			// 4. 네트워크에 흘려보낸다.
			sFr.main.sSocket.send(pack);
		} catch(Exception e) {}
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
		sFr.wframe.dispose();
	}
	
	public void resetProc() {
		// area의 내용을 모두 지운다.
		sFr.area.setText("");
	}
	
	public void exitProc() {
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
	}
}
