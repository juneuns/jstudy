package day01;

public class Test03 {
	final double PI = 3.14;
	
	public Test03() {
//		PI = 4.14; // 여기는 단일행 주석
		// 반지름이 5인 원의 넓이 출력
		System.out.println("반지름이 5인 원의 넓이 : " + (5 * 5 * PI));
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
