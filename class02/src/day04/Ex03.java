package day04;

/*
	문제 3 ]
		다섯자리 숫자를 입력받아서
		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
		
		참고 ]
			회문수란 앞으로 보나 뒤로보나 똑같은 수를 회문수라 한다.
			
			12321 : 회문수
			12312 : 회문수가 아니다.
 */

import javax.swing.*;
public class Ex03 {
	public static void main(String[] args) {
		// 숫자 입력받고
		String snum = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요!");
		
		char ch0 = snum.charAt(0);
		char ch1 = snum.charAt(1);
		char ch3 = snum.charAt(3);
		char ch4 = snum.charAt(4);
		
		String str = (ch0 == ch4) ? 
						(ch1 == ch3 ? "회문수이다." : "회문수가 아니다.") 
					: "회문수가 아니다.";
		
		JOptionPane.showMessageDialog(null, "입력한 숫자 " + snum + " 은 " + str);
	}
}
