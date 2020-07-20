package day02;

public class Test05 {
	public static void main(String[] args) {
		// 1. 논리값 참을 저장할 변수를 선언하고 초기화하세요.
		boolean bool;
		bool = true;
//		boolean bool = true;
		boolean bool1 = false;
		// *** 같은 이름으로 변수를 선언할 수 없다.
		
		bool = bool1;
		// ==> bool : false
		
		// 2. A를 기억할 변수를 만들고 초기화 하세요.
		char ch = 'A';
		System.out.println("ch : " + ch);
		char ch1 = (char) 65;
		System.out.println("ch1 : " + ch1);
		
		char ch2 = (char)(ch1 + 5);
		System.out.println("ch2 : " + ch2);
		
		System.out.println("'C' - 'A' :  " + (char)('C' - 'A'));
		
		// 3.14 를 기억할 float 타입의 변수 num을 선언하고 초기화하세요.
		float num;
//		num = 3.14F; // 리터럴 형변환
		num = (float) 3.14; // 강제 형변환
		
		// 참고 
		// 정수데이터에 .을 붙이면 실수가 된다.
		// 예 ] 10.	==> 10.0 같은 의미(double 형 데이터)
		
		// "홍길동" 이라는 문자열을 기억할 변수를 선언하고 초기화하세요.
		String name;
		name = "홍길동";
		String irum = new String("홍길동");
		
		System.out.println("name : " + name);
		System.out.println("irum : " + irum);
		System.out.println("name == irum : " + (name == irum));
		// 문자열의 비교는 equals() 함수를 사용해서 데이터를 비교해야 한다.
		System.out.println("name.equals(irum) : " + name.equals(irum));
		System.out.println("\"홍길동\".equals(name) : " + "홍길동".equals(name));
		
		String tmp = "\"";
		/*
			줄바꿈 기호 : \n
			벡스페이스 : \b
			탭키		: \t
		 */
		
		System.out.print("abcd");
		System.out.print("\n\tefgh");
	}
}
