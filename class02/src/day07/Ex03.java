package day07;

/*
	다섯 학생의 국어, 영어, 수학, 코딩, 총점 을 관리할 배열을 만들고
	랜덤하게 과목 점수를 만들어서 입력하고
	총점을 계산하세요.
	출력하세요.
	
	1.
		각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
		2차원 배열로 합쳐서 처리하는 방법
	2. 
		2차원 전체 배열로 처리하는 방법
	
	보너스 ]
		점수가 높은 사람부터 정렬해서 출력하세요.
	
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] cod = new int[5];
		int[] total = new int[5];
		
		for(int i = 0 ; i < kor.length ; i++ ) {
			kor[i] = (int)(Math.random() * 41 + 60);
			eng[i] = (int)(Math.random() * 41 + 60);
			math[i] = (int)(Math.random() * 41 + 60);
			cod[i] = (int)(Math.random() * 41 + 60);
			total[i] = kor[i] + eng[i] + math[i] + cod[i];
		}
		
		// 출력하기
		System.out.println();
		/*
		for(int i = 0 ; i < kor.length ; i++ ) {
			System.out.printf("%2d 번 학생 - 국어 : %2d | ", (i+1), kor[i]);
			System.out.printf("영어 : %2d | ", eng[i]);
			System.out.printf("수학 : %2d | ", math[i]);
			System.out.printf("코딩 : %2d | ", cod[i]);
			System.out.printf("총점 : %3d\n", total[i]);
		}
		*/
		System.out.println("###############################################");
		System.out.printf("%9s|%3s |%3s |%3s |%3s |%3s |\n", "학  생  ", "국어", "영어", "수학", "코딩", "총점");
		for(int i = 0 ; i < 47 ; i++ ) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0 ; i < kor.length ; i++ ) {
			System.out.printf("%2d 번 학생 - %4d | ", (i+1), kor[i]);
			System.out.printf("%4d | ", eng[i]);
			System.out.printf("%4d | ", math[i]);
			System.out.printf("%4d | ", cod[i]);
			System.out.printf("%4d |\n", total[i]);
		}
		for(int i = 0 ; i < 47 ; i++ ) {
			System.out.print("-");
		}
	}

}
