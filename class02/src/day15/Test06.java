package day15;

public class Test06 {
	public Test06() {
		System.out.println(Inter01.num);
		Inter01 t1 = new Test06_01();
		t1.display();
	}
	public static void main(String[] args) {
		new Test06();
	}

}

// Inter01 을 구현해보자.
class Test06_01 implements Inter01 {
	
	@Override
	public void display() {
		System.out.println("Inter01을 구현한 Test06_01 클래쓰...");
	}
}
