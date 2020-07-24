package day07;

/*
	문제 1 ]
		
		'A' ~ 'J' 대문자를 랜덤하게 100개 발생시켜서
		각 문자가 몇번씩 발생되는지 
		그래프 형태로 출력하세요.
		
		예 ]
			
			A(5) : *****
			B(3) : ***
			
		힌트 ]
			
			각문자의 카운트를 기억할 배열을 만든다.
			랜덤하게 발생시킨 문자가 나올때마다 해당문자의 카운트만 1 증가시켜준다.
			
			int[] count = new int[10];
 */
public class Ex01 {

	public static void main(String[] args) {
		
		String chStr = "";
		/*
		for(int i = 0 ; i < 10 ; i++) {
			chStr += (char)('A' + i);
		}
		*/
		
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < 10 ; i++ ) {
			buff.append((char)('A' + i));			
		}
		chStr = buff.toString();
		System.out.println("문자열 : " + chStr);
		
		
		int[] arr = new int[chStr.length()];
		
		/*
		for(int i = 0 ; i < 100 ; i++ ) {
			char ch = (char)(Math.random() * 10 + 'A');
			arr[chStr.indexOf(ch)] += 1;
		}
		*/
		
		for(int i = 0 ; i < 100 ; i++ ) {
			int idx = (int)(Math.random() * 10);
			arr[idx] += 1;
		}
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.printf("%2c ( %2d ) : ", chStr.charAt(i), arr[i]);
			for(int j = 0 ; j < arr[i] ; j++) {
				System.out.print("♥ ");
			}
			System.out.println();
		}
	}

}
