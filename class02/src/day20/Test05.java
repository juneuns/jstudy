package day20;

/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어보자.
 */

import java.text.*;
import javax.swing.*;

public class Test05 {

	public Test05() {
		double[] limits = {0, 60, 70, 80, 90};
		/*
			limits 배열을 만들 때 주의 사항
				반드시 오름 차순으로 정렬되어야 한다.
				의미는 0~59까지는 하나의 문자로 바꾸고
				60~69 까지는 하나의 문자로 바꾸고
				....
				90~ 사이는 하나의 문자로 바꿔라.
		 */
		String[] formats = {"F", "D", "C", "B", "A"};
		/*
			formats 만들 때 주의 사항
				limits의 갯수와 반드시 일치해야 한다.
		 */
		
		// 포멧을 만들고
		ChoiceFormat form = new ChoiceFormat(limits, formats);
		
		// 점수 입력받고
		String sno = JOptionPane.showInputDialog("점수를 입력하세요!");
		int no = 0 ; 
		try {
			no = Integer.parseInt(sno);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 학점 구하고
		String grade = form.format(no);
		
		// 출력하기
		JOptionPane.showMessageDialog(null, no + " - " + grade + " 학점");
	}

	public static void main(String[] args) {
		new Test05();
	}

}
