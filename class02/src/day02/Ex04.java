package day02;
/*
	4. 	1년은 365.2426일이다.
		이 수치는 몇일, 몇시간, 몇분 몇초인지 계산해서 출력하세요.
		
		힌트 ] 0.5일은 12시간이다. <== 24 * 0.5
 */
public class Ex04 {
	public static void main(String[] args) {
		double data = 365.2426;
		double tmp = data;
		
		// 날수
		int days = (int)data;
		tmp -= days; // tmp = tmp - days;
		
		// tmp를 초단위로 변환시킨다.
		int total = (int)(tmp * 24 * 3600);
		
		// 시간을 계산하자
		int hour = total / 3600;
		total %= 3600;
		
		// 분을 계산
		int min = total / 60;
		
		total %= 60;
		
		// 초
		int sec = total;
		
		System.out.printf("일년 %7.4f일은\n\t%3d일, %2d시간, %2d분, %2d초 입니다.",
							data, days, hour, min, sec);
	}
}
