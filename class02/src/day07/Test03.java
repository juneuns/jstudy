package day07;

import java.util.Arrays;

/*
	'a' 부터 시작하는 문자 10개를 저장하는 배열을 만들고
	출력하는 프로그램을 작성하세요.
 */
public class Test03 {

	public static void main(String[] args) {
		// 문자들을 관리할 변수를 만들고
		char[] chArr = new char[10];
		
		// 데이터 추가하고
		for(int i = 0 ; i < 10 ; i++) {
			char ch = (char)('a' + i);
			chArr[i] = ch;
		}
		// 배열 확인하고
		System.out.println(Arrays.toString(chArr));
		
		// 하나씩 꺼내서 출력하기
		int i = 0 ;
		while(i < 10) {
			System.out.print(chArr[i++] + " | ");
		}
		System.out.println();
		for(int j = 0 ; j < 39 ; j++ ) {
			System.out.print("-");
		}
		System.out.println();
		
		// 향상된 for 명령으로 하나씩 출력하기
		for(char ch : chArr) {
			System.out.print(ch + " | ");
		}
	}

}
