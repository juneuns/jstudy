package day05;

/*
	문제 6 ]
		
		수학 방정식
			2x + 4y = 10
		의 결과를 출력하세요.
		
		단, x, y는 모두 0보다 크거나 같고 10 보다 작거나 같다.
 */
public class Ex06 {
	public static void main(String[] args) {
		
		for(int i = 0 ; i <= 10 ; i++ ) {
			for(int j = 0 ; j <= 10 ; j++) {
				int no = 2*i + 4 * j ;
				if(no == 10) {
					System.out.println("x : " + i + " , y : " + j);
					break;
				}
			}
		}
	}
}
