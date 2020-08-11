package day19;

import java.util.Arrays;

public class Test03 {

	public Test03() {
		// 배열 만들고
		int[] num = new int[5];
		
		// 배열에 데이터 채우고
		for(int i = 0 ; i < num.length ; i++ ) {
			num[i] = (int)(Math.random()*100 + 1);
		}
		// 채운내용 출력하고
		System.out.println(Arrays.toString(num));
		// 채운내용 정렬하고
		Arrays.sort(num);
		// 다시 출력하고
		System.out.println(Arrays.toString(num));
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
