package day02;

public class Test03 {
	public static void main(String[] args) {
		new Test02().toPrint();
		// . 은 소속을 밝혀줄 때 사용한다.
		Test03_01 t01 = new Test03_01();
		System.out.println("t01.no : " + t01.no);
		System.out.println("Test03_02.no : " + new Test03_02().no);
	}
}

class Test03_01 {
	int no = 10;
}

class Test03_02 {
	int no = 20;
}
