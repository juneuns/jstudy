package day20;

public class Test08 {

	public Test08() {
		Father f = new Son1();
		Father f1 = new Son2();
		
		f1 = f;
		
		Son2 s1 = (Son2)f;
		
		
	}

	public static void main(String[] args) {
		new Test08();
	}
}

class Father {
	void abc() {}
}

class Son1 extends Father {
	int money;
}

class Son2 extends Father {
	int honor;
}
