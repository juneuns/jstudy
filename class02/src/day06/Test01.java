package day06;

public class Test01 {
	public static void main(String[] args) {
		// 1부터 10까지 출력하세요. while 문으로 처리하세요.
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		i = 1;
		while(i <= 10) {
			System.out.println("************");
			System.out.println(i++);
		}
		System.out.println("************");
		
		boolean bool = true;
		while(bool) {
			
			if(true) {
				bool = false;
			}
		}
		System.out.println("************");
		
	}
}
