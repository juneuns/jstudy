package day04;

/*
 	조건문 문제
	문제 1]
		두 수를 랜덤하게 발생시켜서 각각 변수에 담고
		첫번째 수가 두번째 수보다 크면 "양수" (같은 경우 양수로 처리)
		첫번째 수가 두번째 수보다 작으면 "음수"
		를 출력하세요.
 */

public class Ex04 {
	int num = 0; // 멤버변수(전역변수)
	
	public static void main(String[] args) {
		int no = 0; // 함수내부의 전역변수
		if(true) {
//			int no = 10; // 지역변수
		}
		
		System.out.println(no);
	}
	
	public void xyz() {
		num = 20;
	}
	
	public void abc() {
		System.out.println(num);
	}
}
