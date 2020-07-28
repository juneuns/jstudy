package day09;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// 길이가 각각 다른 1차배열을 관리하는 2차 배열을 만들어보자.
		int[][] num = new int[3][];
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		// 출력하고
		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(); // 한줄 내림
		
		// 데이터를 1부터 갯수까지 각각 채워준다.
		for(int i = 0 ; i < num.length ; i++ ) { 
			// num 이 관리하는 갯수만큼 반복한다.
			// num에 들어있는 배열을 하나씩 꺼내서 작업을 해야하기 때문에....
			for(int j = 0 ; j < num[i].length ; j++ ) {
				// 데이터 채워준다.
				num[i][j] = j + 1;
			}
		}
		
		// 출력한다.
		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
