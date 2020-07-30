package day11;

public class Circle01 {
	final double PI = 3.14;
	/*
		변수 만드는 형식
			
			[접근지정자]	[속성]	데이터타입	변수이름;
			
			참고 ]
				접근지정자는
					public, protected, 생략, private
					
			위의 PI 변수의 final은 변수의 내용을 더이상 변경할 수 없게 만드는 속성
	 */
	int rad;
	double arround, area;
	
	// 반지름 대입해주는 함수
	public void setRad(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	// 둘레 계산해서 대입해주는 함수
	public void setArround() {
		arround = (int)(2 * rad * PI * 100 + 0.5) / 100.;
	}
	
	// 면적 계산해서 대입해주는 함수
	public void setArea() {
		area = (int)(rad * rad * PI * 100 + 0.5) / 100.0;
	}
}
