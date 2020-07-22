package day05;

//  구구단 5단을 출력해보자.
public class Test03 {
	public static void main(String[] args) {
		int dan = 5;
		for(int i = 0 ; i < 9 ; i++ ) {
			/*
				5 x 1 = 5
				5 x 2 = 10
				...
				5 x 9 = 45
			 */
			System.out.println(dan + " x " + (i + 1) + " = " + (dan * (i + 1)));
		}
	}
}
