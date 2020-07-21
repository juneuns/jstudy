package day04;

/*
	랜덤하게 알파벳 대문자를 발생시켜보자.
 */
public class Test01 {
	
	public static void main(String[] args) {
		char ch = (char)(Math.random()*('Z' -'A' + 1) + 'A');
		
		System.out.println("랜덤하게 발생된 대문자는 " + ch + " 입니다.");
	}
}
