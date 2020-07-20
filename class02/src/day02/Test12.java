package day02;

import java.util.*;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요! : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요! : ");
		int no2 = sc.nextInt();
//		System.out.println("입력된 숫자 : " + no1);
		// no1을 변의 길이로 가지는 정사각형의 넓이를 구해서 출력하세요.
		// 공식 ] 정사각형의 넓이 = 변의길이 * 변의길이
		int area = no1 * no2;
//		System.out.println("한 변의 길이가 " + no1 + " 인 정사각형의 넓이는 " + area + " 입니다.");
		System.out.println("입력된 길이를 가지는 사각형의 넓이는 " + area + " 입니다.");
	}
}
