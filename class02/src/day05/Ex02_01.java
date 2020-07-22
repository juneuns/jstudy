package day05;

/*
	예제 2]
		5자리 숫자를 입력받아서
		그 숫자가 회문수 인지 아닌지 판별하세요.
		
		단, for 반복문을 사용해서 처리하세요.
 */

import javax.swing.*;
public class Ex02_01 {
	public static void main(String[] args) {
		// 문자열로 입력받고
		String sno = JOptionPane.showInputDialog("다섯자리 숫자 입력!");
		// 문자열을 정수로 형변환시키고
		int no = Integer.parseInt(sno);
		
		// 정수로 비교하는 방법
		int tmp = no;
		// 역순 숫자 기억변수
		int result = 0;
		// 반복해서 숫자를 만든다.
		for(int i = 0 ; i < sno.length() ; i++ ) {
			result = result * 10 + (tmp % 10);
			tmp /= 10;
		}
		
		String msg = "회문수가 아니다.";
		if(no == result) {
			msg = "회문수다.";
		}
		
		JOptionPane.showMessageDialog(null, 
				"입력한 숫자 " + no + " 는 " + msg);
	}
}
