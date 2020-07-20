package day03;

/*
 	삼항연산자 문제
 	
	문제 2]
		세자리 숫자를 입력받아서
		그 수가 300보다 크면 "300보다 큰수"
		작으면 "300보다 작은수"
		가 출력되게 하세요.
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 세자리 숫자 입력 메세지
		System.out.print("세자리 숫자를 입력하세요! : ");
		// 세자리 숫자 변수에 기억
		int no = sc.nextInt();
		
		// 판별해서 변수에 기억
		String msg = (no == 300) ? "과" : "보다";
		String str = (no > 300) ? "큰 수" : ((no == 300) ? "같은 수" : "작은 수");
		
		System.out.printf("입력한 숫자 %3d 은(는) 300%2s %4s 입니다.", no, msg, str);
				
	}
}
