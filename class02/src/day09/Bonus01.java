package day09;

/*
	보너스 ]
		
		1. 랜덤하게 정수를 만들어 변수에 기억시킨다.
		2-0. 발생된 정수의 길이만큼 정수를 저장할 배열을 만든다.
		2-1. 만들어진 배열에 랜덤하게 정수를 발생시켜서 저장한다.
		
		3. 2에서 만들어진 배열의 숫자를 크기로하는 문자열을 랜덤하게 만든다.
			문자열을 영문 대소문자만 가능하다.
		
		4. 각 문자열을 출력하세요.
		
		---------------------------------------------------
		1. 5
		2. int[] len = new int[5];
			for(int i = 0 ; i < len.length; i++){
				len[i] = (int)(Math.random()* (10 - 3 + 1) + 3);
			}
			
			{3, 5, 7, 4, 3}
		
		3. {"Aac", "abehD", "adoadsq", "Tosi", "opR"}
		
 */
public class Bonus01 {

	public static void main(String[] args) {
		//  난수발생
		int cnt = (int)(Math.random()*(9 - 3 + 1) + 3);
		// 배열 만들고
		int[] len = new int[cnt];
		// 정수배열에 랜덤하게 숫자 만들어서 채워주고
		for(int i = 0 ; i < cnt ; i++ ) {
			len[i] = (int)(Math.random() * (9 - 3 + 1) + 3);
		}
		
		String[] str = new String[cnt];
		
		for(int i = 0 ; i < len.length ; i++ ) {
			// 문자열 만든다.
			str[i] = "" ;
			for(int j = 0 ; j < len[i]; j++ ) {
				int tmp = (int)(Math.random()*52);
				char ch = tmp / 26 == 0 ? (char)(tmp + 'A') : (char)(tmp % 26 + 'a');
				str[i] += ch;
			}
		}
		
		for(String msg : str) {
			System.out.println(msg);
		}
		
	}

}
