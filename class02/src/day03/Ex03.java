package day03;

/*
	삼항연산자 문제
		문제 3]
			정수 세개를 입력 받아서
			제일 큰수부터 출력하세요.
			
	힌트 ]
		
		삼항 연산자도 중첩해서 사용할 수 있다.
		
			() ? (삼항연산자) : (삼항연산자);
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("첫번째 숫자 : ");
		// 변수에 기억
		int no1 = sc.nextInt();
		// 메세지 출력
		System.out.print("두번째 숫자 : ");
		// 변수에 기억
		int no2 = sc.nextInt();
		// 메세지 출력
		System.out.print("세번째 숫자 : ");
		// 변수에 기억
		int no3 = sc.nextInt();
		
		// 제일 큰수만 출력해보자.
		int no = (no3 > no2) ? 
					(
						(no2 > no1) 
							? 
						no3 : (no3 > no1) ? no3 : no1
					) 
					: 
					(
						(no3 > no1) 
							? 
						no2 : (no2 > no1) ? no2 : no1
					);
		
		System.out.printf("세 숫자 %3d, %3d, %3d 중 제일 큰수는 %3d 입니다.", no1, no2, no3, no);
	}
}
