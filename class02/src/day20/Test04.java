package day20;

/*
	현재 시간을
		
		XXXX년 XX월 XX일 X요일 ##시 ##분 ##초
	의 형식으로 출력해보자
 */
import java.text.*;
import java.util.*;
public class Test04 {

	public Test04() {
		// 폼을 만들고
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		
		// 문자열 만들고
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String str = form.format(date);
		
		System.out.println("현재 시간 : " + str);
	}

	public static void main(String[] args) {
		new Test04();
	}

}
