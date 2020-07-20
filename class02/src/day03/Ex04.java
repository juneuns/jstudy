package day03;

/*
	년수를 입력받아서
	그 해가 윤년인지 평년이지 판별해서 출력하세요.
	
	참고 ]
		윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고
				400으로 나누어 떨어지는 해는 윤년이다.
		
		1300년 : 평년
		1200년 : 윤년
 */
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		// 년도 입력받을 준비 하고
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력하고
		System.out.print("년도를 입력하세요! : ");
		// 입력년도 변수에 기억하고
		int year = sc.nextInt();
		// 더이상 쓸일이 없으므로 자원반환해주고
		sc.close();
		
		// 윤년인지 평년인지 판별하고
		String str = (year % 4 != 0 ) ? "평년" : (
						(year % 100 == 0 ) ? (
								(year % 400 == 0) ? "윤년": "평년"
								): "윤년"
					);
		
		// 출력하고
		System.out.printf("입력한 년도 [ %4d ] 년은 %2s입니다.", year, str);
	}
}
