package day04;

/*
	문제 2]
		랜덤하게 다섯자리 숫자를 만들고
		각 자리의 숫자의 합을 구해서 출력해주는 프로그램을 작성하세요.
		
		12345
			==> 1 + 2 + 3 + 4 + 5
 */

/*
	윈도우 창을 띄워서 입력받는 방법
		
		라이브러리를 추가한다.
		
		import javax.swing.*;
 */

import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		/*
		String snum = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요!");
		JOptionPane.showMessageDialog(null, "입력한 숫자 : " + snum);
//		JOptionPane.showMessageDialog(null, JOptionPane.ICON_PROPERTY);
		*/
		
		int no = (int)(Math.random() * (99999 - 10000 + 1) + 10000);
		
		// 할일
		// 만단위부터 각 자리수 꺼내서 더해준다.
		int sum = (no / 10000) + (no % 10000 /1000) + (no % 1000 / 100) + (no % 100 / 10) + (no %10);
		
		JOptionPane.showMessageDialog(null, "랜덤하게 발생된 숫자 " + no + " 의 각자리수의 합은 " + sum + " 입니다.");
	}
}
