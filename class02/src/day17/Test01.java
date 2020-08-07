package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test01 {
	JFrame f;
	JPanel pan, sub;
	JButton btn1, btn2;
	
	public Test01() {
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
		
		BtnEvent03 showWin = new BtnEvent03(this);
		// 색상변경 이벤트 추가
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showWin.f.setVisible(true);
			}
		});

		btn2 = new JButton("닫   기");
		
		// 버튼에 이벤트 추가하기
		BtnEvent01 evt01 = new BtnEvent01(this); 
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
		f.setResizable(false);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

// 지역 내부 클래스
class BtnEvent03 {
	Test01 main;
	
	JFrame f;
	JPanel pan, sub;
	JButton btn1, btn2, btn3;
	
	public BtnEvent03(Test01 main) {
		this.main = main;
		f = new JFrame("*** 색 변경 ***");
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 색상이 표현될 메인 판 만들고
		pan = new JPanel();
		pan.setBackground(Color.WHITE);
		
		// 버튼이 위치할 판 만들고
		sub = new JPanel(new GridLayout(1, 3));
		sub.setPreferredSize(new Dimension(360, 30));
		
		// 버튼 만들고
		btn1 = new JButton("색 변경");
		// 색상변경 이벤트 추가
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Color 선택 도구 객체 만들고
				JColorChooser cc01 = new JColorChooser();
				// Color 객체를 만들고
				Color color = cc01.showDialog(cc01, "색선택", Color.WHITE);
				pan.setBackground(color);
			}
			
		});

		btn2 = new JButton("닫   기");
		
//		BtnEvent03 cWin = this;
		// 버튼에 이벤트 추가하기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
//				cWin.f.dispose();
			}
		});
		
		btn3 = new JButton("메인 색변경");

		btn1.setPreferredSize(new Dimension(117, 30));
		btn2.setPreferredSize(new Dimension(117, 30));
		btn2.setPreferredSize(new Dimension(117, 30));
		
		// sub에 버튼 추가하고
		sub.add(btn1);
		sub.add(btn2);
		sub.add(btn3);
		
		f.add(pan, BorderLayout.CENTER);
		f.add(sub, BorderLayout.SOUTH);
		f.setSize(300, 150);
		f.setResizable(false);
		f.setVisible(false);
	}
	
}

class BtnEvent01 implements ActionListener {
	Test01 main;
	
	public BtnEvent01(Test01 main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 문제 1 ]
		// 			메세지 창이 띄워지는 위치가 Test01 의 객체의 위에 띄워지게 처리하세요.
//		JOptionPane.showMessageDialog(null, "프로그램을 종료합니다!");
		
		int cno = JOptionPane.showConfirmDialog(main.f, "프로그램은 종료할까요?", 
												"### 프로그램 종료 ###", JOptionPane.YES_NO_OPTION);
		if(cno == 0) {
			System.exit(0);
		}
	}
}
