package day19;


import java.util.*;
public class Test05 {

	public Test05() {
		String str = "[10,9,8,7,6]";
		str = str.substring(str.indexOf("[") + 1 , str.indexOf("]"));
		
		StringTokenizer token1 = new StringTokenizer(str, ",");
		int len = token1.countTokens(); // 잘려진 토큰의 갯수를 반환해주는 함수
		int[] arr = new int[len]; // 잘려진 갯수와 배열의 크기는 같을 거니까...
		for(int i = 0 ; token1.hasMoreTokens() ; i++ ) {
			String sno = token1.nextToken();
			int no = 0;
			try {
				no = Integer.parseInt(sno);
			} catch(Exception e) {
				e.printStackTrace();
			}
			arr[i] = no;
		}
		
		for(int no : arr) {
			System.out.printf("%2d, ", no);
		}
		
		
		String str2 = "[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]";
		str2 = str2.replace("[[", "").replace("]]", "");
				
		str2 = str2.substring(str2.indexOf("[[") + 2, str2.indexOf("]]"));
		str2 = str2.replace("],[", "|");
		// ==> "1,2,3,4,5|6,7,8,9,10|11,12,13,14,15|16,17,18,19,20|21,22,23,24,25"
		int[][] arr2 = new int[5][5];
		// 위 문자열을 정수배열에 담아주세요.
		
		StringTokenizer token2 = new StringTokenizer(str2, "|");
		for(int i = 0 ; token2.hasMoreTokens() ; i++ ) {
			StringTokenizer token3 = new StringTokenizer(token2.nextToken(), ",");
			for(int j = 0 ; token3.hasMoreTokens() ; j++ ) {
				String sno = token3.nextToken();
				int no = 0 ;
				try {
					no = Integer.parseInt(sno);
				} catch(Exception e) {}
				
				arr2[i][j] = no;
			}
		}
		
		// 출력
		System.out.println();
		System.out.println("--------------------------");
		for(int[] num : arr2) {
			System.out.printf("%-2s", "|");
			for(int n : num) {
				System.out.printf("%2d | ", n);
			}
			System.out.println();
			System.out.println("--------------------------");
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
