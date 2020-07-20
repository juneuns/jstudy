package day02;

/*
	10이라는 반지름을 기억할 변수를 만들어서 초기화하고
	초기화된 반지름을 가지는 원의 넓이와 둘레를 기억할 변수를 만들어서 초기화 하세요.
 */
public class Test06 {
	public static void main(String[] args) {
		int ban = 10;
		// 상수 파이 선언및 초기화
		final float PI = 3.14f; // 리터럴 형변환시의 대소문자는 구분하지 않는다.
		
		// 원의 넓이 기억할 변수 선언 및 초기화
		// 공식 ] 반지름 * 반지름 * 3.14 ==> 정수 * 정수 * 실수 ==> 실수
		float area = ban * ban * PI;
		
		// 원의 둘레를 기억할 변수 선언 및 초기화
		// 공식 ] 2 * 반지름 * 3.14 ==> 정수 * 정수 * 실수 ==> 실수
		float arround = 2 * ban * PI;
		System.out.print("원의 반지름 : " + ban + "\n원의 둘레 : " + arround + "\n원의 넓이 : " + area);
	}
}
