package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test06 {
	JFrame f;
	JPanel pan, sub;
	JButton btn1, btn2;
	
	public Test06() {
		f = new JFrame("*** 색 변경 ***");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setLayout(new BorderLayout());
		// 색상이 표현될 메인 판 만들고
		pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		
		// 버튼이 위치할 판 만들고
		sub = new JPanel(new BorderLayout());
		sub.setPreferredSize(new Dimension(300, 30));
		
		// 버튼 만들고
		btn1 = new JButton("색 변경");
		btn2 = new JButton("닫   기");
		
		btn1.setPreferredSize(new Dimension(143, 30));
		btn2.setPreferredSize(new Dimension(143, 30));
		
		// sub에 버튼 추가하고
		sub.add(btn1, BorderLayout.WEST);
		sub.add(btn2, BorderLayout.EAST);
		
		f.add(pan, BorderLayout.CENTER);
		f.add(sub, BorderLayout.SOUTH);
		f.setSize(300, 350);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
