package day05;

/*
	문제 4 ]
		1 - 2 + 3 - 4 + 5 - 6 + ..... 했을 경우
		어디까지 계산하면 100이 넘는 숫자가 발생하는지 출력하세요.
		
		힌트 ]
			-1은 -1을 곱할 때마다 부호가 바뀐다.
 */
public class Ex04 {
	public static void main(String[] args) {
		int booho = -1;
		int sum = 0;
		int num = 1;
		for(int i = 1 ; true ; i++ ) {
			booho *= -1;
			sum = sum + (booho * i);
			if(sum > 100) {
				num = i;
				break;
			}
		}
		
		System.out.println("더한 값이 100이 넘는 숫자는 " + 
							num + " 이고 합은 " + sum + " 입니다.");
	}
}
