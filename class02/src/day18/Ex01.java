package day18;

import javax.swing.JOptionPane;

/*
	문제 1 ]
		String[] str = {"123", "456", "789", "89/2"....};
		이런 배열이 있는 경우
		이것의 합과 평균을 구하는 프로그램을 작성하세요.
		
		단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
		1. 배열의 인덱스를 벗어나는 경우
		2. 숫자로 변환이 불가능한 경우
		3. 평균을 계산하는데 0으로 나누는 경우 ...
		
 */
public class Ex01 {
	String[] str = {"123", "456", "789", "89/2", "a", "111"};
	public Ex01() {
		int sum = 0 ;
		int cnt = 0 ;
		double avg = 0 ;	// 자동 형변환
		
		for(int i = 0 ; i < str.length + 1; i++ ) {
			try {
				sum += Integer.parseInt(str[i]);
				++cnt;
			} catch(NumberFormatException e) {
				e.printStackTrace();	// 숫자로 변환이 안되는 경우이므로 다음 데이터를 꺼낸다.
				continue;
			} catch(IndexOutOfBoundsException e) {
				e.printStackTrace(); // 배열의 범위를 벗어난 경우이므로 반복문을 중지시킨다.
				break;
			}
		}
		
//		cnt = 0;
		try{
			avg = sum / (double) cnt;
		} catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
		}
		JOptionPane.showMessageDialog(null, "배열의 합계 : " + sum + "\n배열의 평균 : " + avg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
