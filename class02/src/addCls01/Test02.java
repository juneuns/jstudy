package addCls01;

public class Test02 {

	public Test02() {
		Test02_02 t2 = new Test02_02();
		t2.abc();
		System.out.println("t2.num : " + t2.num);
		
		Test02_01 t1 = new Test02_02();
		t1.abc();
		System.out.println("t1.num : " + t1.num);
		
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Test02_01 {
	int num = 10;
	void abc() {
		System.out.println("Test02_01.abc()");
	}
}

// Test02_01 을 상속받은 클래스 Test02_02 클래스
class Test02_02 extends Test02_01 {
	int num = 999;
	void xyz() {
		System.out.println("PI 값 : " + Math.PI);
	}
	
	/*
		오버라이딩 규칙
			
			0. 상속받는다.
			1. 함수의 원형을 유지한다. 함수의 원형 : 반환값타입 + 함수이름 + 매개변수리스트
			2. 접근 지정자는 같거나 넓은 방향으로 한다.
			3. 예외전이는 같거나 좁은 범위로 한다.
	 */
	
	void abc() {
		System.out.println("Test02_02.abc() - Override 됨...");
	}
	
}
