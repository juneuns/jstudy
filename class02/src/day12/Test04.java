package day12;

public class Test04 {
	int no1;
	int no2;
	
	public Test04() { // 기본 생성자 함수
		this(10, 10);
		new Test04(10, 10); // 전혀다른 Test04 타입의 인스턴스를 힙에 만든다.
	}
	
	// 생성자함수 오버로딩
	public Test04(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public static void main(String[] args) {
		Test04 t1 = new Test04();
		// t1의 생성자를 호출한다.
//		t1.Test04(); //  생성자 함수는 일반함수처럼 [ 주소.함수이름() ]의 형태로 호출할 수 없다.
		// 생성자 함수는 반드시 new 라는 명령과 함께 사용되어야 한다.
		
		/*
		t1.no1 = 20;
		t1.no2 = 5;
		*/
		
		Test04 t2 = new Test04(5, 15);
		
		System.out.println("1. t1.no1 : " + t1.no1);
		System.out.println("2. t2.no1 : " + t2.no1);
	}

}
