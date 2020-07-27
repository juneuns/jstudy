package day08;

/*
	문제 4 ]
		
		도형의 정보를 입력받는데
		입력형식은 
		 	
		 	0/5		- 반지름이 5인 원
		 	3/5/10	- 밑변이 5이고 높이가 10인 삼각형
		 	4/3/4	- 가로가 3이고 세로가 4인 사각형
		 	
		의 형식으로 입력 받은 도형의 넓이를 계산해서 출력하세요.
		
	참고 ]
		
		indexOf(int ch, int fromIndex)
			ch 			: 찾을 문자
			fromIndex 	: 찾을 시작위치
		
		lastIndexOf(int ch)
			뒤에서 부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
		 	
 */
public class Ex04 {

	public static void main(String[] args) {
		String str = "aebedefg";
		int idx = str.lastIndexOf('e');
		System.out.println(idx);
		idx = str.indexOf('e', str.indexOf('e') + 1);
		System.out.println(idx);
	}

}
