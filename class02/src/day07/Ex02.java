package day07;

/*
	정수 5개를 저장할 배열 3개를 만들어서
	첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
	두번째 배열에는 랜덤하게 사각형의 세로의 길이를 만들어서 기억시키고
	세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로, 세로의 길이로 
	면적을 계산해서 저장할 배열을 만들고
	출력하세요.
	
	출력형식 :
		
		첫번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
		두번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
		세번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
		네번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
		다섯번째 사각형 : 가로 - XX | 세로 - XX | 넓이 - xxx
	
 */
public class Ex02 {

	public static void main(String[] args) {
		// 가로를 저장할 배열 변수
		int[] garo = new int[5];
		// 세로를 저장할 배열 변수
		int[] sero = new int[5];
		// 면적을 저장할 배열 변수
		int[] area = new int[5];
		
		// 가로 랜덤하게 다섯개 만들어서 저장
		for(int i = 0 ; i < 5 ; i++ ) {
			int no = (int)(Math.random() * 90 + 10);
			garo[i] = no;
		}
		
		// 세로 랜덤하게 다섯개 만들어서 저장
		for(int i = 0 ; i < 5 ; i++ ) {
			int no = (int)(Math.random() * 90 + 10);
			sero[i] = no;
		}
		
		// 면적 계산하기
		for(int i = 0 ; i < area.length ; i++ ) {
			int myunjuk = garo[i] * sero[i];
			area[i] = myunjuk;
		}
		
		// 출력하기
		for(int i = 0 ; i < area.length ; i++ ) {
			System.out.printf("사각형 %d : 가로 - %2d, 세로 - %2sd, 면적 - %4d\n", (i+1), garo[i], sero[i], area[i]);
		}
		
		System.out.println("#############################################");
		// 2 차원 배열에 담기
		int[][] sagak = new int[3][5];
		
		sagak[0] = garo;
		sagak[1] = sero;
		sagak[2] = area;
		
		// 출력하기
		for(int i = 0 ; i < sagak[0].length ; i++ ) {
			System.out.printf("사각형 %d : 가로 - %2d, 세로 - %2sd, 면적 - %4d\n", 
										(i+1), sagak[0][i], sagak[1][i], sagak[2][i]);
		}
	}
}
