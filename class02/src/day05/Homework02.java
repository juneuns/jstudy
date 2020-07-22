package day05;

/*
	과제 2 ]
		1부터 100 사이의 소수를 모두 출력하세요.
		
		소수 : 1과 자기자신 이외의 수로 나눌 수 없는 수
 */
public class Homework02 {
	public static void main(String[] args) {
		
		loop:
		for(int i = 2; i <= 100 ; i++ ) {
			
			for(int j = 2; j < i ; j++) {
				if(i % j == 0) {
					continue loop;
				}
			}
			System.out.print(i + ", ");
		}
	}
}
