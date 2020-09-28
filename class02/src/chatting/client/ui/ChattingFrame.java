package chatting.client.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatting.client.*;
import chatting.client.event.*;

public class ChattingFrame extends JFrame {
	public ClientController main;
	
	// 화면 관련 변수
	public JTextArea area;
	public JTextField input;
	public JScrollPane span;
	public JButton sendB;
	
	public ChattingFrame(ClientController main) {
		this.main = main;
		
		// 이 클래스는 JFrame을 상속받은 클래스이기 때문에 JFrame의 기능을 가지고 있다.
		this.setTitle("*** cls2 Chatting ***");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 채팅 목록
		area = new JTextArea();
		area.setEditable(false);
		area.setFont(new Font("gulim", Font.BOLD, 16));
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));
		
		// 입력패널
		JPanel inPan = new JPanel(new BorderLayout());
		
		// 입력창
		input = new JTextField();
		input.setPreferredSize(new Dimension(350, 30));
		
		// 이벤트 추가
		input.addKeyListener(new EnterEvent(main));
		
		// 버튼
		sendB = new JButton("send");
		sendB.setPreferredSize(new Dimension(100, 30));
		
		// event 처리
		sendB.addActionListener(main.evt);
		
		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);
		
		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);
		
		this.setSize(450, 500);
		this.setResizable(false);
		this.setVisible(false);
	}

}
