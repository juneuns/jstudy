package day16;

import javax.swing.*;
public class Test01 {
	/*
		입력한 정수형태의 문자열을 
		정수로 변환해서 전역변수 num 에 기억시키세요.
		만약 변환에 실패하면 -999 이 입력되게 하세요.
	 */
	
	int num;
	
	public Test01() {
		// 정수형태의 문자열 입력받고
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		// 정수로 바꿔주고
		System.out.println("#######################");
		int no = 0;
		try {
			no = Integer.parseInt(sno);
			System.out.println("-----------------------");
			num = no;
		} catch(Exception e) {
			num = -999;
		}
		JOptionPane.showMessageDialog(null, "입력한 정수 : " + num);
		System.out.println("+++++++++++++++++++++++");
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}
