package day08;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[][] num = new int[2][3];
		int[] no1 = {1, 2, 3};
		int[] no2 = {4, 5, 6};
		
		num[0] = no1;
		num[1] = no2;
		
		int[][] num2 = num;
		
		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("### num2 ###");
		for(int[] arr : num2) {
			System.out.println(Arrays.toString(arr));
		}
		
		// num의 데이터 수정
		num[0][1] = 20;
		System.out.println("*** 수정 후 배열 ***");

		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("### num2 ###");
		for(int[] arr : num2) {
			System.out.println(Arrays.toString(arr));
		}
		
		int[][] num3 = new int[num.length][num[0].length];
		for(int i = 0 ; i < num.length ; i++) { // 데이터를 하나씩 꺼내서 배열에 담고
			for(int j = 0 ; j < num[i].length; j++) {
				num3[i][j] = num[i][j];
			}
		}
		// num 배열의 첫번째 방의 세번째 방의 데이터를 33으로 변경시킨다.
		num[0][2] = 33;
		System.out.println("####### num[0][2] = 33 : after #####");
		for(int[] arr : num) {
			System.out.println(Arrays.toString(arr));
		}
		

		System.out.println("### num3 ###");
		for(int[] arr : num3) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
