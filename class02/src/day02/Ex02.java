package day02;

/*
	2. 	하나의 숫자(반지름)를 입력 받은 후
		그 숫자를 이용해서 원의 넓이와 둘레를 구해서 
		출력해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex02 {
	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		// 반지름 입력 메세지 출력하고
		System.out.print("반지름을 입력하세요! : ");
		// 입력받은 반지름 변수에 기억하고
		int rad = sc.nextInt();
		// 더이상 입력받을게 없으므로 자원을 반환해주고
		sc.close();
		
		// 둘레를 계산해서 변수에 기억시키고
		double arround = 2 * rad * 3.14;
		
		// 면적을 계산해서 변수에 기억시키고
		double area = rad * rad * 3.14;
		
		// 출력하고
		System.out.printf("*** 반지름이 %3d 인 원 ***\n\t%5s: %6.2f\n\t%5s: %5.2f", 
							rad, "둘레", arround, "넓이", area);
	}
}
