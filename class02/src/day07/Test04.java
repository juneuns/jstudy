package day07;

public class Test04 {
	public static void main(String[] args) {
		String str = "가나다라abcdABCD";
		int sIdx = str.indexOf("abcd");
		System.out.println(str + " 중 \"abcd\" 의 시작 위치값 : " + sIdx);
	}
}
