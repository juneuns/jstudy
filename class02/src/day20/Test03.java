package day20;

/*
	34567.8912 
	라는 숫자를 세자리마다 , 로 구분하고
	소수점 이하는 3자리만 출력해보자.
 */
import java.text.*;

public class Test03 {

	public Test03() {
		double num = 34567.8916;
		
		// 폼을 만들고
		DecimalFormat form = new DecimalFormat("0,000,000.000");
		/*
			숫자의 형식을 지정할 때 
				0 : 무효숫자 표현
				# : 무효숫자 표현 안함
		 */
		
		// 문자열을 만든다.
		String str = form.format(num);
		
		// 출력하기
		System.out.println("n u m : " + num);
		System.out.println("결 과 : " + str);
		System.out.println("--------------------");
		// 무효숫자는 안보이게 처리
		form = new DecimalFormat("#,###,###.###");
		
		// 문자열을 만든다.
		str = form.format(num);
		
		// 출력하기
		System.out.println("n u m : " + num);
		System.out.println("결 과 : " + str);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
