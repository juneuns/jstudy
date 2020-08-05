package day14;

public class Test08 {
	
	public Test08() {
		Object obj = new Test08_01();
		((Test08_01)obj).abc();
	}
	
	public static void main(String[] args) {
		new Test08();
	}
}

class Test08_01/* extends Object - 이 생략된 것이다.*/{
	public void abc() {
		System.out.println("이 클래스는 Test08_01 클래스!");
	}
}
