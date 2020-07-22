package day05;

/*
	문제 7 ]
		랜덤한 두수를 입력한 후
		두수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		힌트 ]
			최대 공약수 구하는 방법
			: 	작은 수부터 시작해서 1씩 감소하면서
				두수가 나누어 떨어지는지 확인한다.
 */
public class Ex07 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random() * 100 + 1);
		int no2 = (int)(Math.random() * 100 + 1);
		
		int max, min;
		
		max = (no1 > no2)? no1 : no2;
		min = (no1 > no2)? no2 : no1;
		
		int result = 1;
		for(int i = min; i > 1 ; i--) {
			if(max % i == 0 && min % i == 0) {
				result = i;
				break;
			}
		}
		
		System.out.println("랜덤하게 발생된 두수 "+ max + ", " + min + " 의 최대 공약수는 [ " + result + " ]입니다.");
		
	}
}
