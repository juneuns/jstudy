package jjokji;

import java.io.*;
import java.net.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceiveFrame {
	public Jjokji main;
	
	public JTextField field;
	public JTextArea area;
	public JButton replyB, nextB, exitB;
	public JFrame wframe;
	
	public ReceiveFrame(Jjokji main) {
		this.main = main;
		
		wframe = new JFrame("### 쪽지 읽기 ###");
		wframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				wframe.setVisible(false);
				main.fr.setVisible(true);
			}
		});
		field = new JTextField();
		field.setEditable(false);
		area = new JTextArea();
		area.setEditable(false);
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼 만들기
		replyB = new JButton("답장하기");
		exitB = new JButton("닫기");
		
		replyB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String sid = field.getText();
				SendFrame sFr = new SendFrame(main);
				sFr.field.setText(sid);
				sFr.wframe.setVisible(true);
			}
		});
		
		exitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wframe.setVisible(false);
				wframe.dispose(); // 메모리에서도 지워주세요...!
			}
		});
		
		JLabel label = new JLabel("보낸사람 : ");
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add("West", label);
		p1.add("Center", field);
		
		JPanel p2 = new JPanel(new GridLayout(1, 2));
		p2.add(replyB);
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
