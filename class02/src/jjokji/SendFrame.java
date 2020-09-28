package jjokji;

import java.io.*;
import java.net.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SendFrame {
	public Jjokji main;
	
	public JTextField field;
	public JTextArea area;
	public JButton sendB, resetB, exitB;
	public JFrame wframe;
	
	public SendFrame(Jjokji main) {
		this.main = main;
		
		wframe = new JFrame("### 쪽지 쓰기 ###");
		wframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				wframe.setVisible(false);
				main.fr.setVisible(true);
			}
		});
		field = new JTextField();
		field.setEditable(false);
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼 만들기
		sendB = new JButton("보내기");
		resetB = new JButton("reset");
		exitB = new JButton("닫기");
		
		BtnEvent evt = new BtnEvent(this);
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		exitB.addActionListener(evt);
		
		JLabel label = new JLabel("받는사람 : ");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		p2.add(sendB);
		p2.add(resetB);
		p2.add(exitB);
		
		wframe.add("North", p1);
		wframe.add("Center", sp);
		wframe.add("South", p2);
		
		wframe.setSize(400, 300);
		wframe.setResizable(false);
		// 이 화면은 필요한 순간 보여야 하므로
		// 나중에 필요할 때 보이도록 설정하자.
	}

}
