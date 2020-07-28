package day09;

import java.util.Arrays;

/*
	다음 형태의 배열을 요구하는 형태로 변경해 보세요..
	
	1 	2	3
	4	5	6
	
	1	4
	2	5
	3	6
	
 */

public class Ex01 {

	public static void main(String[] args) {
		int[][] no1 = {{1, 2, 3}, {4, 5, 6}};
		
		int[][] no2 = new int[3][2];
		for(int[] arr : no1) {
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i = 0 ; i < no2.length ; i++ ) {
			for(int j = 0 ; j < no2[i].length ; j++ ) {
				no2[i][j] = no1[j][i];
			}
		}
		
		System.out.println();
		for(int[] arr : no2) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
