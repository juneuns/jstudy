package day20;

import javax.swing.JOptionPane;

/*
	학생의 점수를 입력받아
	학점을 출력하는 프로그램을 만들어보자.
	
	단, 조건문으로 처리하세요.
 */
public class Ex01 {

	public Ex01() {
		for(;;) {
			String sno = JOptionPane.showInputDialog("점수를 입력하세요!\n종료는 q 를 입력하세요!");
			if(sno.equals("q")) break;
			
			int score = 0 ; 
			try {
				score = Integer.parseInt(sno);
			} catch(Exception e) {
				e.printStackTrace();
			}
			String grade = "F";
			
			/*
			if(score >= 90) {
				grade ="A";
			} else if(score >= 80) {
				grade ="B";
			} else if(score >= 70) {
				grade ="C";
			} else if(score >= 60) {
				grade ="D";
			} else {
				grade ="F";
			}
			*/
			
			switch(score / 10) {
			case 10:
				grade = "A";
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
			}
			JOptionPane.showMessageDialog(null, "입력한 점수 : " + score + "\n획득한 학점 : " + grade);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
