package day30;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

import day30.thread.*;
public class Test03 {
	public JFrame fr;
	public JPanel bPan, timeP;
	public JLabel timelbl;
	public JTextArea area;
	public JButton read, exit;
	
	/*
		회원가입 창의 경우
			
			아이디 : 박스
			비번   : 박스
			이름	: 박스
			...
			
			이 경우 박스 - JTextField
			각 타이틀  - JLabel
			
			
	날짜 객체의 경우
			Date date = new Date();
			
			SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd\tHH:mm:ss");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			
			Date date1 = new Date();
			
			String stime1 = form.format(date);
			String stime2 = form.format(date1);
			
			System.out.println(stime1);
			System.out.println(stime2);
	 */
	public Test03() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 시간 출력 패널
		timeP = new JPanel();
		timeP.setPreferredSize(new Dimension(280, 30));
		
		timelbl = new JLabel("9999/99/99  00:00:00");
		timelbl.setPreferredSize(new Dimension(275, 28));
		timelbl.setHorizontalAlignment(JLabel.CENTER); // 텍스트 가운데 정렬
		
		// 시간스레드
		TimeThread t1 = new TimeThread(this); // New Born
		t1.start();
		
		timeP.add(timelbl);
		
		// 텍스트 입력 패널
		area = new JTextArea();
		area.setPreferredSize(new Dimension(260, 80));
		
		JScrollPane span = new JScrollPane(area);
		span.setPreferredSize(new Dimension(275, 155));
		
		// 버튼 패널
		bPan = new JPanel(new GridLayout(1, 2));
		bPan.setPreferredSize(new Dimension(300, 20));
		
		// 버튼
		read = new JButton("내용읽기");
		exit = new JButton("종료하기");
		
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 데이터 읽어오고
				String msg = area.getText();
				// 메시지창에 데이터 출력하고
				JOptionPane.showMessageDialog(fr, msg);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 스레드 먼저 멈춰준다.
				t1.isStart = false;
				
				// 메일 프로세스 종료
				System.exit(0);
			}
		});
		
		
		
		bPan.add(read);
		bPan.add(exit);
		
		// 프레임에 추가
		fr.add(timeP, BorderLayout.NORTH);
		fr.add(span, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setSize(300, 200);
		fr.setResizable(false);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
