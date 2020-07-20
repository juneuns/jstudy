package day03;

// 삼항연산자(조건연산자)
public class Test05 {
	public static void main(String[] args) {
		String str = (true) ? "참" : "거짓";
		int no = (false) ? 1 : 100;
		System.out.println(str);
		System.out.println(no);
		System.out.println((1 < 2)? "참": "거짓");
	}
}
