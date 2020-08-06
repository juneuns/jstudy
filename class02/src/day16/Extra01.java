package day16;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Extra01 {
	int num ;
	JFrame frame;
	JPanel pan;
	JButton btn1, btn2;
	
	public Extra01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		
		pan = new JPanel(new BorderLayout());
		btn1 = new JButton("숫자 입력");
		btn1.setPreferredSize(new Dimension(123, 100));
		// 이벤트 추가
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btn2 = new JButton("숫자 출력");
		btn2.setPreferredSize(new Dimension(123, 100));
		// 출력이벤트 등록
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "입력된 숫자 : " + num);
			}
		});
		
		pan.add(btn1, BorderLayout.WEST);
		pan.add(btn2, BorderLayout.EAST);
		
		
		frame.add(pan);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		new Extra01();
	}

}

class AddClass {
	
}
