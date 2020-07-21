package day04;

/*
	1.
	랜덤하게 두자리 숫자를 발생시키고
	키보드로 두자리 숫자를 입력하면
	발생된 숫자보다 입력한 숫자가 큰수인지 아닌지 판별하는 프로그램을 작성하세요.
	
	2.
	심화 ]
		입력한 수와 차는 얼마인지 같이 출력하도록 하세요.
 */

import javax.swing.*;
public class Ex01 {
	public static void main(String[] args) {
		// 1. 랜덤하게 두 자리 숫자를 만들고
		int no1 = (int) (Math.random() * (99 - 10 + 1) + 10);
		// 2. 두 자리 숫자 입력받고 후 정수형으로 변환시키고
		String snum = JOptionPane.showInputDialog("두자리 숫자를 입력하세요!");
		// 정수로 변환시키고
		int no2 = Integer.parseInt(snum);
		
		// 3. 두 수를 비교해서 큰수에서 작은 수를 뺀 차를 구한다.(삼항연산자)
		String str = (no1 > no2)? (no1 + "과 " + no2 + " 중 큰 수는 " + no1 + " 이고 차는 " + (no1 - no2) + " 입니다.") :
									(no1 + "과 " + no2 + " 중 큰 수는 " + no2 + " 이고 차는 " + (no2 - no1) + " 입니다.");
		
//		System.out.println(str);
		JOptionPane.showMessageDialog(null, str);
	}
}
