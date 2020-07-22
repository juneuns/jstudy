package day05;

/*
	예제 2]
		5자리 숫자를 입력받아서
		그 숫자가 회문수 인지 아닌지 판별하세요.
		
		단, for 반복문을 사용해서 처리하세요.
 */

import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		// 문자열로 입력받고
		String sno = JOptionPane.showInputDialog("다섯자리 숫자 입력!");
		
		// 1. 문자열로 비교하는 방법
		// 참고 ] 문자열의 길이를 반환해주는 함수 : length()
		String tmp = "";
		int len = sno.length();
		// 역순으로 된 문자열 반복해서 만든다.
		for(int i = 0 ; i < len ; i++ ) {
			tmp += sno.charAt((len - 1) - i);
		}
		
		// 만들어진 문자열을 비교한다.
		boolean bool = sno.equals(tmp);
		
		if(bool == true) {
			JOptionPane.showMessageDialog(null, 
									"입력한 숫자 " + sno + " 는 회문수 입니다.");
		} else {
			JOptionPane.showMessageDialog(null, 
									"입력한 숫자 " + sno + " 는 회문수가 아닙니다.");
		}
	}
}
