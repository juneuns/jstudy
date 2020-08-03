package day12;

import java.util.Arrays;

/*
	문제 4]
		
		String 클래스의 api 문서를 참고해서 해결하세요.
		
		'A' ~ 'Z' 사이의 문자 10를 랜덤하게 배열로 만들어서
		이 배열을 이용해서 문자열을 만들어 보세요.
		
		String 클래스의 생성자함수중
			String(char[] ch)
		를 이용하면 문자배열을 문자열로 만들어준다.
		
 */
public class Ex04 {
	
	public Ex04() {
		String str = getString();
		
		// 출력한다.
		System.out.println("랜덤하게 만들어진 문자열 : " + str);
	}
	
	public String getString() {
		char[] ch = new char[10];
		for(int i = 0 ; i < ch.length ; i++ ) {
			char tmp = (char)(Math.random()*26 + 'A');
			ch[i] = tmp;
		}
		
		System.out.println(Arrays.toString(ch));
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
