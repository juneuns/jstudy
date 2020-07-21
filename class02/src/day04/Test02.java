package day04;

/*
	랜덤하게 대문자 두개를 발생시켜서
	작은 순서부터 출력되게 하세요.
 */
public class Test02 {
	public static void main(String[] args) {
		// 랜덤하게 문자 두개를 발생시킨다.
		char ch1 = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		char ch2 = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
		
		// 비교해서 작은 문자문자 나열해서 문자열을 만든다. [ E - R ] 의 형태로 문자열을 만들어보자.
		String str = (ch1 < ch2) ? ch1 + " - " + ch2 : ch2 + " - " + ch1;
		
		System.out.printf("랜덤하게 발생된 두 문자 [ %c ], [ %c ] 를 순서대로 나열하면 [ %5s ] 가 된다.", ch1, ch2, str);
	}
}
