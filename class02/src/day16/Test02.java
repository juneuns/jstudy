package day16;

/*
	전역 Inner Class
 */
public class Test02 {
	
	public Test02() {
		Test02_01 t1 = new Test02_01();
		t1.abc();
		Test02_01.Inner01 in01 = new Test02_01().new Inner01();
		in01.xyz();
	}
	public static void main(String[] args) {
		new Test02();
	}
}

class Test02_01 {
	int no = 100;
	void abc() {
		System.out.println("여기는 Test02_01");
		new Inner01().xyz();
	}
	// 전역 내부 클래스(Grobal Inner Class)
	class Inner01 {
		int num = no * 2;
		void xyz() {
			System.out.println("여기는 Inner01");
		}
	}
}
