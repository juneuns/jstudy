package day03;

/*
	문제 ]
		두 수를 입력받아서 각각 변수에 담고
		첫번째 수가 두번째 수보다 크면 "양수"
		첫번째 수가 두번째 수보다 작으면 "음수"
		를 출력하세요.
		
		삼항 연사자를 사용해서 처리하세요.
 */

import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 첫번째 숫자 입력 메세지
		System.out.print("첫번째 숫자 : ");
		// 첫번째 숫자 변수에 기억
		int no1 = sc.nextInt();
		// 두번째 숫자 입력메세지
		System.out.print("두번째 숫자 : ");
		// 두번째 숫자 변수에 기억
		int no2 = sc.nextInt();
		// 자원 반환
		sc.close();
		String str = (no1 > no2) ? "양수" : "음수";
		
		System.out.printf("입력한 두 수 %3d, %3d 의 차는 %2s 입니다.", no1, no2, str);
	}
}
