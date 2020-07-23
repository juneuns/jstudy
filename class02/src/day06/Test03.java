package day06;

/*
	7단 구구단을 출력하세요.
	do ~ while 문을 사용해서 처리하세요.
*/
public class Test03 {
	public static void main(String[] args) {
		// 변수만들고
		int gop = 1;
		do {
			System.out.println(7 + " x " + gop + " = " + (7 * gop));
//			gop++;
		} while(++gop < 10);
	}
}
