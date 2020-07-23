package day06;

/*
	반복문 문제
		
		문제 4 ]
		
			1
			2	3
			4	5	6
			7	8	9	10
			11	12	13	14	15
			
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
			0부터 n 까지 합 구하는 공식
				
				n * (n + 1) / 2
				
				
			1		0 + 1
			2		1 + 1
			4		3 + 1
			7		6 + 1
			11		10 + 1
				
		 */
		
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i; j++ ) {
				int num = i * (i + 1) / 2 + 1;
				System.out.print(num + j + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int sum = 1;
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(sum++ + "\t");
			}
			System.out.println();
		}
		
	}
}
