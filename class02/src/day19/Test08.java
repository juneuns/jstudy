package day19;

/*
	문제 4 ]
		자바소스 파일 이름을 입력받아서 
		해당 파일이 정상적인 소스파일인지 아닌지 판별하세요.
		
		ex ]
			
			abc.txt ==> 자바소스파일이 아닙니다.
 */

import java.util.regex.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		// 패턴 만들고
		Pattern pat = Pattern.compile("^([A-Z_$]){1}(\\w|[$_])*[.]java$");
		// Java.java
		// ^ - 시작
		// $ - 끝
		
//		Pattern pat = Pattern.compile("[A-Z_$]{1}[a-zA-Z0-9$_]*[.]java");
		while(true) {
			// 데이터 입력받고
			String str = JOptionPane.showInputDialog("자바소스파일을 입력하세요!\n종료는 [ q ]를 입력하세요!");
			
			if(str.equals("q")) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다!");
				break;
			}
			
			// Matcher 만들고
			Matcher mat = pat.matcher(str);
			// 결과 꺼내고
			String msg = mat.matches() ? "올바른" : "잘못된";
			// 출력하고
			JOptionPane.showMessageDialog(null, "입력된 파일이름 : " + str + "\n결 과 : " + msg + " 자바소스파일");
			
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
