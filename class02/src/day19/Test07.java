package day19;

/*
	전화번호를 입력한 후 그 전화번호가 형식에 맞는지 검사하세요.
	
	 	전화번호 형식
	 		
	 		02-xxxx-xxxx
	 		02-xxx-xxxx
	 		031-xxx-xxxx
	 		031-xxxx-xxxx
 */
import java.util.regex.*;
import javax.swing.*;
public class Test07 {

	public Test07() {
		String tel = JOptionPane.showInputDialog("전화번호를 입력하세요!");
		
		/*
			1. Pattern 클래스를 이용해서 검사하고 싶은 정규식 패턴을 만든다.
				참고 ]
					이 클래스는 생성자 함수가 없으므로
					절대로 new 시켜서 사용할 수 없고
					더군다나 클래스의 속성이 더이상 상속해줄수 없는 final 속성이므로
					상속 시켜준후 new 시켜서 사용할 수도 없다.
					
					이런 경우는 소속 함수중 속성이 static 이면서 반환값이 자기자신인
					함수를 찾아서 사용해야 한다.
		 */
		Pattern pattern = Pattern.compile("0(\\d){1,2}-(\\d){3,4}-\\d{4}");
		/*
		 * Pattern pattern = Pattern.compile("0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}");
		 */		
		/*
			2. 패턴이 만들어졌으면 만들어진 패턴을 가지고 문자열을 검사하면된다.
				검사 함수는
					matcher()
				이 함수는 검사 결과를 Matcher 라는 클래스 타입으로 반환해준다.
				따라서 반환되는 Matcher 객체에서 결과를 꺼내야 한다.
		 */
		Matcher match = pattern.matcher(tel);
		
		// 이제 객체에 들어있는 결과를 뽑아서 보면 된다.
		// 이때 사용하는 함수가 matches() 이다. 반환값은 true 또는 false 로 기억된다.
		
		/*String msg = ""; // 올바른 || 잘못된
		if(match.matches()) {
			msg = "올바른";
		} else {
			msg = "잘못된";
		}
		*/
		String msg = match.matches() ? "올바른" : "잘못된";
		
		JOptionPane.showMessageDialog(null, "입력 전화번호 : " + tel + "\n결과 : " + msg + " 형식의 전화번호입니다.");
	}

	public static void main(String[] args) {
		new Test07();
	}

}
