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
		// 색상변경 이벤트 추가
		
//		btn1.addActionListener(new BtnEvent02());
		btn1.addActionListener(setBg());
		
		
		
		btn2 = new JButton("닫   기");
		
		// 버튼에 이벤트 추가하기
		BtnEvent01 evt01 = new BtnEvent01(); 
		ActionListener evt1 = evt01; // 자동형변환
		btn2.addActionListener(evt1);
		
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
	
	// 전역 내부 클래스-일반적으로 부르는 내부클래스
	class BtnEvent02 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 필요한 rgb 값을 만들고
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			
			// Color 객체를 만들고
			Color color = new Color(red, green, blue);
			pan.setBackground(color);
		}
	}
	
	public ActionListener setBg() {
		class BtnEvent03 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 필요한 rgb 값을 만들고
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// Color 객체를 만들고
				Color color = new Color(red, green, blue);
				pan.setBackground(color);
			}
		}
		
		return new BtnEvent03(); // ActionListener 타입으로 자동 형변환이 된다.
	}
}

class BtnEvent01 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
