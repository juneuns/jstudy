package day20;

/*
	Calendar 클래스를 이용해서
	현재시간을 출력해보자.
 */
import java.util.*;
import javax.swing.*;
import static java.util.Calendar.*;
public class Test02 {

	public Test02() {
//		Calendar cal = new Calendar();	// ------------ X : Calendar 클래스는 추상클래스이므로 new 시킬 수 없다.
		Calendar cal = Calendar.getInstance(); //	--- O
		int year = cal.get(YEAR);
		int month = cal.get(MONTH) + 1; // 이 함수도 역시 반환값이 0 ~ 11 의 정수를 반환해준다. 따라서 1을 더해줘야 한다.
		int day = cal.get(DAY_OF_MONTH);
		int yoil = cal.get(DAY_OF_WEEK); // 1 ~ 7 사이의 정수를 반환해준다. 1: 일요일, 2: 월요일
		
		System.out.println("오늘 날짜 : " + year + " 년 " + month + " 월 "  + day + " 일 " + getYoil(yoil));
	}
	// 요일을 문자열로 반환해주는 함수
	public String getYoil(int day) {
			String yoil = "일요일";
			switch(day - 1) {
			case 0:
				yoil = "일요일";
				break;
			case 1:
				yoil = "월요일";
				break;
			case 2:
				yoil = "화요일";
				break;
			case 3:
				yoil = "수요일";
				break;
			case 4:
				yoil = "목요일";
				break;
			case 5:
				yoil = "금요일";
				break;
			case 6:
				yoil = "토요일";
				break;
			}
			
			 return yoil;
		}
	public static void main(String[] args) {
		new Test02();
	}

}
