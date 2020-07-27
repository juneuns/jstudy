package day08;

/*
	문제 4 ]
		
		도형의 정보를 입력받는데
		입력형식은 
		 	
		 	0/5		- 반지름이 5인 원
		 	3/5/10	- 밑변이 5이고 높이가 10인 삼각형
		 	4/3/4	- 가로가 3이고 세로가  4인 사각형
		 	
		의 형식으로 입력 받은 도형의 넓이를 계산해서 출력하세요.
		
	참고 ]
		
		indexOf(int ch, int fromIndex)
			ch 			: 찾을 문자
			fromIndex 	: 찾을 시작위치
		
		lastIndexOf(int ch)
			뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
		 	
 */

import javax.swing.*;
public class Ex04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("도형/숫자1[/숫자2] 의 형식으로 입력해주세요!");
		String[] sArr = new String[3];
		
		// 실제데이터 형태의 배열만들고
		int[] noArr = new int[3];
		
		sArr[0] = str.substring(0, str.indexOf('/'));
		/*
		if(!sArr[0].equals("0")) {
			// 사각형, 삼각형인 경우
			sArr[1] = str.substring(str.indexOf('/') + 1, str.lastIndexOf('/'));
		} else {
			// 원인 경우
			sArr[1] = str.substring(str.indexOf('/') + 1);
		}
		*/
		sArr[1] = sArr[0].equals("0") ? str.substring(str.indexOf('/') + 1) : str.substring(str.indexOf('/') + 1, str.lastIndexOf('/'));
		sArr[2] = sArr[0].equals("0") ? "0" : str.substring(str.lastIndexOf('/') + 1);
		
		for(int i = 0 ; i < noArr.length ; i++ ) {
			noArr[i] = Integer.parseInt(sArr[i]);
		}
		
		// 데이터 꺼내서 계산해서 출력한다.
		
	}

}
