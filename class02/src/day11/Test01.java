package day11;

public class Test01 {
	// Heap Type 이 Moyang[] 인 변수를 만들자.
	Moyang[] m1;
	
	public Test01() {
		m1 = new Moyang[5];
		
		for(int i = 0 ; i < m1.length ; i++ ) {
			m1[i] = new Moyang();
		}
		
		// 데이터 입력하기
		m1[0].figure = "삼각형";
		m1[1].figure = "사각형";
		m1[2].figure = "원  형";
		m1[3].figure = "타원형";
		m1[4].figure = "삐딱형";
		
		// 꺼내서 출력하기
		for(int i = 0 ; i < m1.length ; i++ ) {
			System.out.println((i + 1) +" 번째 도형 : " + m1[i].figure);
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
