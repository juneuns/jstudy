package chat.client;

/*
채팅을 할 수 있는 폼을 제공하고
채팅프로그램을 제작해보자.

순서 ]
	1. 폼(UI) 만든다.
	2. 서버에 접속
	3. 통신을 한다.
		1. 서버에 데이터를 보낸다.
		2. 서버에서 준 데이터를 받아본다.
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.*;

import chat.client.thread.*;
public class ChatClient01 extends JFrame {
	public JTextArea area;
	public JTextField input;
	public JScrollPane span;
	
	public JFrame loginFr;
	public JButton loginB, exitB, sendB;
	public JTextField inId;
	public JPasswordField inPw;
	
	public ChatClient01() {
		setUI();
		setLoginFr();
		
		// 버튼 이벤트 추가
		addEvt(this);
	}
	
	// 메인창 셋팅
	public void setUI() {
		// 이 클래스는 JFrame을 상속받은 클래스이기 때문에 JFrame의 기능을 가지고 있다.
		this.setTitle("*** cls2 Chat client01 ***");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 채팅 목록
		area = new JTextArea();
		area.setEditable(false);
		span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(420, 460));
		
		// 입력패널
		JPanel inPan = new JPanel(new BorderLayout());
		
		// 입력창
		input = new JTextField();
		input.setPreferredSize(new Dimension(350, 30));
		
		// 버튼
		sendB = new JButton("send");
		sendB.setPreferredSize(new Dimension(100, 30));
		
		inPan.add(input, BorderLayout.CENTER);
		inPan.add(sendB, BorderLayout.EAST);
		
		
		this.add(span, BorderLayout.CENTER);
		this.add(inPan, BorderLayout.SOUTH);
		
		this.setSize(450, 500);
		this.setResizable(false);
		this.setVisible(false);
	}
	
	// 로그인창 셋팅 함수
	public void setLoginFr() {
		ChatClient01 chat = this;
		loginFr = new JFrame("** Login **");
		loginFr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 입력창 만들기
		JLabel lid = new JLabel("I D : ");
		JLabel lpw = new JLabel("P W : ");
		
		// dimension
		Dimension ldim = new Dimension(35, 11);
		Dimension cdim = new Dimension(150, 32);
		
		// 라벨사이즈지정
		lid.setPreferredSize(ldim);
		lpw.setPreferredSize(ldim);
		
		// 라벨 텍스트 정렬
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setHorizontalAlignment(JLabel.RIGHT);
		
		// 입력창 만들기
		inId = new JTextField();
		inPw = new JPasswordField();
		
		// 입력창 사이즈
		inId.setPreferredSize(cdim);
		inPw.setPreferredSize(cdim);
		
		// 감싸는 패널 만들기
		JPanel idP = new JPanel(new BorderLayout());
		JPanel pwP = new JPanel(new BorderLayout());
		
		// 패널에 내용추가하기
		idP.add(lid, BorderLayout.WEST);
		idP.add(inId, BorderLayout.CENTER);
		pwP.add(lpw, BorderLayout.WEST);
		pwP.add(inPw, BorderLayout.CENTER);
		
		// 입력내용 모두 감쌀 패널
		JPanel loginPan = new JPanel();
		loginPan.setPreferredSize(new Dimension(245, 100));
		loginPan.add(idP);
		loginPan.add(pwP);
		
		// 버튼 추가
		loginB = new JButton("로그인");
		exitB = new JButton("종료");
		
		// 버튼 패널
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(250, 30));
		bPan.add(loginB);
		bPan.add(exitB);
		
		loginFr.add(loginPan, BorderLayout.CENTER);
		loginFr.add(bPan, BorderLayout.SOUTH);
		
		loginFr.setSize(250, 150);
		loginFr.setResizable(false);
		loginFr.setVisible(true);
	}
	
	public void addEvt(ChatClient01 chat) {
		loginB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginFr.setVisible(false);
				chat.setVisible(true);
			}
		});
		
		exitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new ChatClient01();
	}
}
