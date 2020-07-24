package day07;

import java.util.Arrays;

/*
	1 ~ 45 까지의 숫자 여섯개를 저장할 배열을 만들고 오름차순 정렬하세요.
	중복 숫자는 없는 것으로 한다.
 */
public class Test06 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		
		for(int k = 0 ; k < 10 ; k ++ ) {
			if(k % 5 == 0) {
				System.out.println("-------------------------");
			}
			
			loop:
			for(int i = 0 ; i < 6 ; i++ ) {
				// 반복해서 숫자 만들고
				int no = (int)(Math.random() * 45 + 1);
				
				// 중복된 숫자 있는지 검사한다.
				for(int j = 0 ; j < i ; j++ ) {
					if(lotto[j] == no) {
						i--;
						continue loop;
					}
				}
				
				// 이 경우는 중복된 숫자가 없는 경우이므로 배열에 추가해준다.
				lotto[i] = no;
			}
			// 내용확인
//			System.out.println(Arrays.toString(lotto));
			
			// 오름차순정렬
			for(int i = 0 ; i < lotto.length - 1; i++) {
				
				for(int j = i + 1 ; j < lotto.length ; j++) {
					if(lotto[i] > lotto[j] ) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}
			
			// 내용 확인
			System.out.println(Arrays.toString(lotto));
		}
		System.out.println("-------------------------");
		System.out.println(Arrays.toString(lotto));
	}

}
