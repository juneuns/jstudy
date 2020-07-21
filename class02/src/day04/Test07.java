package day04;

public class Test07 {
	public static void main(String[] args) {
		// 랜덤하게 두자리 숫자를 발생시키고
		int no = (int)(Math.random() * (99 - 10 + 1) + 10);
		
		String str = "";
		
		if(no > 50) {
			str = "50보다 큰 수";
		} else if(no < 50) {
			str = "50보다 작은 수";
		} else {
			str = "50과 같은 수";
		}
		System.out.println("랜덤하게 발생한 숫자 " + no + " 는 " + str + " 입니다.");
	}
}
