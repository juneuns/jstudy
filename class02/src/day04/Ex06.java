package day04;

/*
	문제 3]
			정수 세개를 입력 받아서
			제일 큰수부터 출력하세요.
			
			혹은 
			랜덤하게 발생시켜서
 */
public class Ex06 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()* 10 + 1);
		int no2 = (int)(Math.random()* 10 + 1);
		int no3 = (int)(Math.random()* 10 + 1);
		
		int max, mid, min;
		
		if(no1 > no2) { 
			// no1이 no2보다 큰경우
			if(no2 > no3) {
				// no2가 no3보다 큰 경우
				max = no1;
				mid = no2;
				min = no3;
			} else {
				// no3가 no2 보다 큰 경우
				min = no2;
				if(no1 > no3) {
					max = no1;
					mid = no3;
				} else {
					max = no3;
					mid = no1;
				}
			}
		} else {
			//no2가 no1보다 큰 경우
			if(no1 > no3) {
				max = no2;
				mid = no1;
				min = no3;
			} else {
				// no3가 no1보다 큰 경우
				// no2와 no3를 비교처리
				min = no1;
				if(no2 > no3) {
					max = no2;
					mid = no3;
				} else {
					max = no3;
					mid = no2;
				}
			}
		}
	}
}
