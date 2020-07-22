package day05;

// 0 부터 10까지 숫자를 출력하세요.
public class Test02 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 11 ; i++ ) {
			System.out.printf("%2d ] 회차 : %2d\n" ,(i + 1),  i);
		}
	}
}
