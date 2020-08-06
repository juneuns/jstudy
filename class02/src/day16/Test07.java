package day16;

import javax.swing.*;
public class Test07 {
	public Test07() {
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		int no;
		try {
			no = Integer.parseInt(sno);
		} catch(NumberFormatException e) {
			// 예외가 발생하면 변수 no 에는 아직 데이터가 정해지지 않은 상태이므로 변수 초기화가 필요하다.
			no = -999;
//			System.out.println(e);
			e.printStackTrace();
		} catch(Exception e) {
			no = -777;
			e.printStackTrace();
		/*
		} finally {
			no = -999;
		 */
		}
		
		JOptionPane.showMessageDialog(null, "입력한 정수 : " + no);
	}
	public static void main(String[] args) {
		new Test07();
		/*
		int no = 400;
		if(no % 4 == 0) {
			
		} else if(no % 100 == 0) {
			
		} else if(no % 400 == 0) {
			
		} else {
			
		}
		*/
	}

}
