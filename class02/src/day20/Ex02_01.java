package day20;

/*
	세사람의 시험 결과를 출력하세요.
	형식은
		
		전은석 - java : 100, oracle : 95, web : 75, JSP : 95, Total : 365
		
	의 형태로 출력되게 하세요.
	점수는 랜덤하게 만들어도 됩니다.
	
 */

import java.text.*;

public class Ex02_01 {

	public Ex02_01() {
		Object[] stud1 = getArr("홍길동");
		Object[] stud2 = getArr("심청이");
		Object[] stud3 = getArr("팥쥐이");
		
		MessageFormat form = new MessageFormat("{0} - java : {1}, oracle : {2}, web : {3}, jsp : {4}, total : {5}");
		
		// 출력한다.
		String result1 = form.format(stud1);
		String result2 = form.format(stud2);
		String result3 = form.format(stud3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	
	public Object[] getArr(String name) {
		Object[] obj = new Object[6];
		obj[0] = name;
		obj[1] = (int)(Math.random()*41 + 60);
		obj[2] = (int)(Math.random()*41 + 60);
		obj[3] = (int)(Math.random()*41 + 60);
		obj[4] = (int)(Math.random()*41 + 60);
		obj[5] = 0; // 데이터가 입력되어 있지 않으면 null 인 상태이므로 총점은 0으로 초기화 해주고 누적계산한다.
		/*
		int sum = 0;
		for(int i = 1 ; i < obj.length -1 ; i++ ) {
			sum = sum + (int) obj[i];
		}
		
		obj[5] = sum;
		*/
		for(int i = 1 ; i < obj.length - 1 ; i++ ) {
			obj[5] = (int)obj[5] + (int)obj[i];
		}
		
		return obj;
	}

	public static void main(String[] args) {
		new Ex02_01();
	}
}
