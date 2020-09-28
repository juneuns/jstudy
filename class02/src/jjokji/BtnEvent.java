package jjokji;

import java.awt.event.*;
import javax.swing.*;
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
		
	}
	
	public void resetProc() {
		
	}
	
	public void exitProc() {
		sFr.wframe.setVisible(false);
		sFr.main.fr.setVisible(true);
	}
}
