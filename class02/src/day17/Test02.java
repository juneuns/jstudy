package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test02 {
	
	public Test02() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel bPanel = new JPanel(new GridLayout(1, 5));
		bPanel.setPreferredSize(new Dimension(500, 30));
		/*
		JButton btn1 = new JButton("01");
		JButton btn2 = new JButton("02");
		JButton btn3 = new JButton("03");
		JButton btn4 = new JButton("04");
		JButton btn5 = new JButton("05");
		*/
		String[] sArr = {"red", "green", "blue", "Set", "Close"};
		JButton[] btn = new JButton[5];
		for(int i = 0 ; i < 5 ; i++ ) {
			btn[i] = new JButton(sArr[i]);
			btn[i].addActionListener(new BtnEvt());
			bPanel.add(btn[i]);
//			bPanel.add(new JButton("0" + (i+1)));
		}
		
//		JButton btn1 = (JButton) bPanel.getComponent(0);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel, BorderLayout.SOUTH);
		
		frame.setSize(500, 250);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		new Test02();
	}
}

class BtnEvt implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		switch(str) {
		case "red":
			System.out.println("빨강");
			break;
		case "green":
			System.out.println("초록");
			break;
		case "blue":
			System.out.println("파랑");
			break;
		case "Set":
			System.out.println("적용");
			break;
		case "Close":
			System.out.println("닫기");
			break;
		}
	}
}
