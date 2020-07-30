package day11;

public class Test03 {
	
	public Test03() {
		// 원 객체 세개를 만들어보자.
		Circle01 c1 = getCircle();
		Circle01 c2 = getCircle();
		Circle01 c3 = getCircle();
		
		// 방 세개짜리 배열 만들고
		Circle01[] arr = new Circle01[3];
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = c3;
		
		// 하나씩 꺼내서 출력하고
		for(int i = 0 ; i < arr.length ; i++ ) {
			System.out.println((i+1) + " 번째 원의 반지름 : " + arr[i].rad + 
										"\n\t 원의 둘레 : " + arr[i].arround +
										"\n\t 원의 넓이 : " + arr[i].area);
		}
		
	}
	
	// 랜덤하게 반지름을 만들어서 원의 정보를 기억하는 Circle 객체를 반환해주는 함수
	public Circle01 getCircle() {
		// 객체만들고
		Circle01 c1 = new Circle01();
		// 반지름 랜덤하게 만들고
		int rad = (int)(Math.random()* 46 + 5); 
		// 변수들 셋팅해주고
		c1.setRad(rad);
		
		// 데이터 내보내고
		return c1;
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
