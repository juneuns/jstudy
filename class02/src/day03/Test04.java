package day03;

/*
 	비교 연산자
 		두개의 데이터를 비교할 때 사용하는 연산자
 			
 			>
 			>=
 			<
 			<=
 			==
 			!=
 		
 		주의
 			수학에서는 하나의 식에서 두가지 비교를 할 수 있지만
 			컴퓨터에서는 한번에 하나의 비교만 가능하다.
 				
 				a = 10;
 				b = 20;
 				c = 15;
 				
 				a < b < c 			: X
 				
 				(a < b) & (b < c) 	: O
 		
 		참고 ]
 			비교연산자의 결과값은 논리값이다.(true, false)
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println(1 < 2);
		System.out.println(!true);
		System.out.println(true != (1 > 2));
		System.out.println(!(1 > 2));
	}
}
