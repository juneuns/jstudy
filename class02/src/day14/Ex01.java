package day14;

/*
	10개의 데이터를 기억할 배열을 만드는데...
	1 ~ 15 까지의 수를 랜덤하게 발생시켜서 4로 나눠서
	나머지가 0이면 문자열을 "문자열" 이라고 입력하고
	나머지가 1이면 정수 100을 입력하고
	나머지가 2이면 영문자를 랜덤하게 입력하고
	나머지가 3이면 실수를 2.0 ~ 7.0 까지 랜덤하게 만들어서 입력한다.
	
	그리고
	꺼내서 출력하는데
	꺼낸 데이터가 
		문자열이면 "문자열 데이터"로 
		정수면 25를 더한 정수를
		영문자면 대소문자를 바꿔서
		실수면 소수 세째자리에서 반올림해서 
	출력하세요.
	
 */

import static java.lang.Math.*;

public class Ex01 {
	
	/*
		배열을 만들때 필요한 것 - 데이터타입, 저장할 갯수
		
			데이터타입[] 변수이름 = new 데이터타입[갯수];
	 */
	
	Object[] obj = new Object[10];
	
	public Ex01() {
		// obj 배열 초기화
		setData();
		// 배열 내용 출력
		toPrint();
		
	}
	
	// 배열을 초기화하는 함수
	public void setData() {
		for(int i = 0 ; i < obj.length ; i++ ) {
			int tmp = (int)(random()*15 + 1);
			
			if(tmp % 4 == 0) {
				obj[i] = "문자열";
			} else if( tmp % 4 == 1) {
				obj[i] = 100;
			} else if( tmp % 4 == 2) {
				int no = (int)(random() * 52);
				char ch = no < 26 ? (char)(no + 'A') : (char)(no % 26 + 'a');
				obj[i] = ch;
			} else if( tmp % 4 == 3) {
				double no = random() * 6 + 2;
				if(no > 7.0) {
					no = 7.0;
				}
				obj[i] = no;
			}
		} // 배열은 완성이 됬다.
	}
	
	// 배열의 내용을 출력해주는 함수
	public void toPrint() {
		// 출력에 필요한 배열은 전역변수로 만들어 뒀으니 입력할 데이터는 없다.
		for(int i = 0 ; i < obj.length ; i++ ) { // 배열에 데이터가 채워진 갯수만큼 반복작업을 한다.
			Object o = obj[i];
			
			if(o instanceof String) {
				System.out.println(((String)obj[i]) + " | " + ((String)o) + " 데이터");
			} else if(o instanceof Integer) {
				System.out.println(((int)obj[i]) + " | " + (((int)o) + 25));
			} else if(o instanceof Character) {
				char ch = (char) o;
				ch = ch <= 'Z' ? (char)(ch + ('a' - 'A')) : (char)(ch - ('a' - 'A'));
				System.out.println(((char)obj[i]) + " | " + ch);
			} else if(o instanceof Double) {
				double no = (double) o;
				double tmp = (int)(no * 100 + 0.5) / 100.0;
				System.out.println( tmp + " | " + no);
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
