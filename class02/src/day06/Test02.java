package day06;

/*
	7단 구구단을 출력하세요.
	while 문을 사용해서 처리하세요.
 */
public class Test02 {
	public static void main(String[] args) {
		// 카운터변수부터 만든다.
		int gop = 1;
		/*
		while(gop < 10) {
			System.out.println(7 + " x " + gop + " = " + (7 * gop));
			++gop;
		}
		*/
		while(gop < 10) {
			System.out.println(7 + " x " + gop + " = " + (7 * gop++));
		}
	}
}
