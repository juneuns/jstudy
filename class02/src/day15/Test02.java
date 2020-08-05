package day15;

public class Test02 {
	
	public Test02() {
		// Sub1의 abc()가 실행되야할 경우
		Sub1 s1 = new Sub1();
		xyz(s1); // MainTest t = s1;
		
		// Sub2의 abc()가 실행되야할 경우
		Sub2 s2 = new Sub2();
		xyz(s2); // MainTest t = s2;
		
		// Sub3의 abc()가 실행되야할 경우
		Sub3 s3 = new Sub3();
		xyz(s3); // MainTest t = s3;
		
		
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void xyz(MainTest t) {
		t.abc();
	}
}

class MainTest {
	public void abc() {
		System.out.println("여기는 메인");
	}
}

class Sub1 extends MainTest {
	public void abc() {
		System.out.println("여기는 Sub1");
	}
}

class Sub2 extends MainTest {
	public void abc() {
		System.out.println("여기는 Sub2");
	}
}

class Sub3 extends MainTest {
	public void abc() {
		System.out.println("여기는 Sub3");
	}
}
