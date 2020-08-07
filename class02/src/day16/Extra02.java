package day16;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Extra02 {
	int num ;
	JFrame frame;
	JPanel pan;
	JButton btn1, btn2;
	
	public Extra02() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 100);
		
		pan = new JPanel(new BorderLayout());
		btn1 = new JButton("숫자 입력");
		btn1.setPreferredSize(new Dimension(123, 100));
		
		// 이벤트 추가
//		Extra02 e1 = this;
		AddClass02 ac02 = new AddClass02(this);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				new AddClass02(e1);
				ac02.setMain();
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
		new Extra02();
	}

}

class AddClass02 {
	// Extra02의 객체의 주소를 기억할 준비를 해야한다.
	Extra02 main;
	
	// Extra02객체의 주소를 넘겨받아서 셋팅해주는 역할을 하는 생성자를 정의한다.
	public AddClass02(Extra02 main) {
		this.main = main;
//		setMain();
	}
	
	public void setMain() {
//		String sno = JOptionPane.showInputDialog("정수 입력!");
		int no = 0 ;
		JColorChooser choice = new JColorChooser();
		Color color = choice.showDialog(null, "Color Choice", Color.WHITE);
		System.out.println("###################");
		try {
//			no = Integer.parseInt(sno);
		} catch(Exception e) {
			no = -999;
			e.printStackTrace();
		}
		
		// 이제 정수는 만들어 졌으니 Extra02의 객체의 멤버에 기억시키면 된다.
		main.num = no;
	}
}
