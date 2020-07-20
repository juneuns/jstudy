package day02;

/*
	밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고 초기화하세요.
	밑변과 높이의 변수도 선언하고 초기화 하세요.
	
	공식 ]
		삼각형의 넓이 = 밑변 * 높이 * 1/2
 */
public class Test07 {
	
	public static void main(String[] args) {
		int width = 5;
		int height = 5;
		
		double area = width * height * (1. / 2);
		/*
			1 / 2 ==> 0 : 정수와 정수의 연산 결과는 정수가 되기 때문에
			
			1. ==> 1.0 : double 타입의 데이터
			
		 */
		
		/*
		 * double area = width * height * 0.5;
		 */	
		System.out.println("area : " + area);
		
		/*
			& - 그리고 and
			| - 또는 	or
			&&	- 절삭 연산을 한다.
			||	- 절삭 연산을 한다.
		*/
	}
}
