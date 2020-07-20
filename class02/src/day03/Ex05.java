package day03;

/*
	문제 5]
		알파벳 문자를 임의로 입력한 후
		그 문자가 대문자이면 소문자로 변환하고,
		소문자면 대문자로 변환하고,
		특수문자면 그냥 출력하는 프로그램을 작성하세요.
		
	참고 ]
		'A' : 65
		'a' : 97
		
		int cha = 'a' - 'A';
		
	참고 ]
		대문자인 경우
			ch >= 'A' &
			ch <= 'Z'
		소문자인 경우
			ch >= 'a' & 
			ch <= 'z'
	
	
	참고 ]
		nextLine() 으로 꺼내오면 문자열을 꺼내오게 된다.
		이때 문자만 입력하더라도 문자열로 꺼내오게 된다.
		
		문자만 꺼내는 방법
		
			문자열.charAt(0)
 */
public class Ex05 {
	public static void main(String[] args) {
		System.out.println('a' - 'A');
		
		String str = "ABC";
		System.out.println(str.charAt(2));
	}
}
