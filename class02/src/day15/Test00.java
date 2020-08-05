package day15;

public class Test00 {
	public Test00() {
		// 여러 Saram에 대한 데이터를 관리하고 싶다.
		Saram[] nugu = new Saram[5];
		String[] names = {"윤요셉", "유병욱", "오혜찬", "이지우", "장성환"};
		int[] ages = {33, 29, 28, 26, 27};
		char gen = 'M';
		
		// 배열 완성하기
		for(int i = 0 ; i < nugu.length ; i++ ) {
			nugu[i] = new Saram(names[i], ages[i], gen);
		}
		
	}
	
	public static void main(String[] args) {
		new Test00();
	}

}

class Saram {
	String name;
	int age;
	char gen;
	
	public Saram() {}
	public Saram(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}
}
