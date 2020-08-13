package day21;

/*
	원을 기억할 클래스를 정의하고
	벡터에 원 3개를 저장해서
	출력하세요.
	
	할일 ]
		1. 원 클래스를 정의한다.
		2. 원을 저장할 벡터를 만든다.
		3. 벡터에 원을 3개 채운다.
			가. 반복해서 원을 만들고
			나. 원에 데이터채우고
			다. 둘레, 넓이 계산해서 채워주고
			라. 벡터에 그 원을 넣어주고...
			
		4. 출력한다.
 */

import java.util.*;

public class Test02 {

	public Test02() {
		// 2. 원을 저장할 벡터를 만든다.
		Vector vec = new Vector();
		// 3. 벡터에 원을 3개 채운다.
		for(int i = 0 ; i < 3 ; i++ ) {
			// 벡터에는 방만 준비되어있고 데이터는 아직 준비가 되어있지 않으므로
			// 반복할 때마다 원을 만들고 원에 데이터를 채워서 
			// 완성된 원을 벡터에 채워줘야 한다.
			Circle c = new Circle();
			// 가. 반지름 채우고
			int rad = (int) (Math.random()*13 + 3);
			c.setRad(rad);
			// 나. 둘레, 넓이 채우고
			c.setArround();
			c.setArea();
			
			// 이제 원이 완성이 됬으니 벡터에 넣어준다.
			vec.add(c);
		}
		
		// 이제 벡터가 완성이 됬으니 출력한다.
		for(int i = 0 ; i < vec.size() ; i++ ) {
			System.out.println(vec.get(i));
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}

// 1. 원 클래스를 정의한다.

