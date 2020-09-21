package day28.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day28.evt.*;

public class Member {
	public JFrame fr;
	public MemberJoin join;
	public MemberList mList;
	
	public Member() {
		join = new MemberJoin(this);
		mList = new MemberList(this);
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel(new GridLayout(1, 3));
		
		JButton btn1 = new JButton("회원리스트");
		JButton btn2 = new JButton("회원가입");
		JButton btn3 = new JButton("닫기");
		
		// 버튼에 이벤트 추가
		MemberEvent evt = new MemberEvent(this);
		btn1.addActionListener(evt);
		btn2.addActionListener(evt);
		btn3.addActionListener(evt);
		
		pan.add(btn1);
		pan.add(btn2);
		pan.add(btn3);
		
		fr.add(pan);
		
		fr.setSize(450, 100);
		fr.setResizable(false);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Member();
	}

}
