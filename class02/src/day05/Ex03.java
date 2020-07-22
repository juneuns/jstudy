package day05;

/*
	예제 3 ]
		1부터 10까지 합을 구해서 출력하세요.
		단, for 명령으로 처리하세요.
 */
public class Ex03 {
	public static void main(String[] args) {
		/*
		int sum = 0 ;
		for(int i = 1; i <= 10; i++ ) {
			sum += i;
		}
		System.out.println("1 부터 10 까지의 합은 " + sum + " 입니다.");
		*/
		
		for(int i = 1, sum = 0 ; i <= 10 ; i++ ) {
			sum += i;
			if(i == 10) System.out.println(i + " 까지의 합 : " + sum);
		}
	}
}
