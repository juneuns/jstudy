package day08;

/*
	문제 1]
		
		대문자 10개를 랜덤하게 발생해서 출력하는 프로그램을 작성하세요.
		단, 중복 문자는 없어야 한다.
		
	bonus ]
		정렬해서 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		// 문자 배열 만들고
		char[] chArr = new char[10];
		
		loop:
		for(int i = 0 ; i < chArr.length ; i++ ) {
			// 랜덤하게 문자 만들고
			char ch = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
			
			// 중복여부 검사 - 현재 인덱스의 이전까지 반복해서
			for(int j = 0 ; j < i ; j++) {
				if(ch == chArr[j]) {
					// 이 경우는 이미 저장된 문자이기 때문에 다시 문자를 만들어야 한다.
					i--;
					continue loop;
				}
			}
			chArr[i] = ch;
		}
		
		// 출력하고
		System.out.print("| ");
		for(char ch : chArr) {
			System.out.print(ch + " | ");
		}
		System.out.println();
		
		// 정렬하기
		for(int i = 0 ; i < chArr.length - 1 ; i++ ) {
			for(int j = i + 1 ; j < chArr.length ; j++ ) {
				if(chArr[j] < chArr[i]) {
					char tmp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = tmp;
				}
			}
		}
		// 출력하고
		System.out.println("*** 정렬 후 ***");
		System.out.print("| ");
		for(char ch : chArr) {
			System.out.print(ch + " | ");
		}
		System.out.println();
	}

}
