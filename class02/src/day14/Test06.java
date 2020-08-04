package day14;

public class Test06 /* extends String */{
	public Test06() {
		Test06_02 t1 = new Test06_02();
		t1.abc();
	}
	public static void main(String[] args) {
		new Test06();
	}

}

class Test06_01 {
	final void abc() { // 이 함수는 오버라이드가 안되는 함수....
		System.out.println("전은석 선생님 최고!!!");
	}
}

class Test06_02 extends Test06_01 {
	public final int MAX = 1000;
	/*
	// 상위 클래스의 abc()의 속성이  final 이기 때문에 이 함수는 더이상 오버라이드(재정의) 할 수 없는 함수이다.
	void abc() {
		System.out.println("요셉씨가 쵝오~~~!");
	}
	*/
}
