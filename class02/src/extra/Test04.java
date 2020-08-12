package extra;

/*
	정규식 검사는 
	문자열이 원하는 형으로 되어있는지 검사할려고 하는 것이다.
	
	예를 들어
		숫자만 입력받도록 해야되는 프로그램에서
		문자를 입력받으면 문제가 된다.
		
		1A34 라고 입력하면 변환 과정에서 에러가 발생한다.
		이런 사태를 미연에 방지할려고 하는 작업
		
		또는
		
		비밀번호의 경우 보안 때문에 각 사이트에서는 
		영문 대소문자 한개 이상, 숫자 1개이상, 특수문자 1개 이상을 반드시 포함하도록 해야 한다.
		
		
	문제 ]
		숫자만 4자리로 입력받는 프로그램을 작성하세요.
 */

import javax.swing.*;
import java.util.regex.*;

public class Test04 {

	public Test04() {
		String sno = JOptionPane.showInputDialog("4자리 숫자를 입력하세요!");
		
		System.out.println(sno);
		
		Pattern pat = Pattern.compile("[1-9]{1}[0-9]{3}");
		
		Matcher mat = pat.matcher(sno);
		
		// 이제 형식에 맞는지 아닌지 결과를 꺼내서 처리한다.
		boolean bool = mat.matches();
		if(bool == true) {
			JOptionPane.showMessageDialog(null, "입력한 문자열 : " + sno + "\n결과 : 숫자로만 구성된 문자열");
		} else {
			JOptionPane.showMessageDialog(null, "입력한 문자열 : " + sno + "\n결과 : 숫자4개의 형식에 맞지 않은 문자열");
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
