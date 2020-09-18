package day27.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day27.event.*;

public class MemberUI extends JFrame {
	public JScrollPane span;
	public JButton lbtn, qbtn;
	public JTextArea area;
	
	public MemberUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbtn = new JButton("회원리스트");
		qbtn = new JButton("작업 종료");
		
		MemberEvt mEvt = new MemberEvt(this);
		lbtn.addActionListener(mEvt);
		qbtn.addActionListener(mEvt);
		
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(450, 30));
		bPan.add(lbtn);
		bPan.add(qbtn);
		
		JPanel mPan = new JPanel();
		mPan.setPreferredSize(new Dimension(450, 320));
		
		add(mPan, BorderLayout.CENTER);
		add(bPan, BorderLayout.SOUTH);
		
		this.setSize(450, 350);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new MemberUI();
	}
}
