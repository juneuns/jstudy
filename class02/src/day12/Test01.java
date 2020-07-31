package day12;

public class Test01 {
	double area;
	public Test01() {
		// 사각형의 가로세로를 입력해서 면적변수에 대입...
		setArea(10, 5);
		System.out.println("1. 사각형의 넓이 : " + area);
		
		// 면적변수에 원의 넓이를 대해보자.
		area = setArea(10); // double rad = 10; 과 같이 자동 형변환이 이루어지기 때문에 실행된다.
		System.out.println("2. 원의 넓이 : " + area);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	// 사각형 넓이 구해주는 함수 ------------------------- 4
	public void setArea(int width, int height) {
		area = width * height;
	}
	
	// 원의 넓이를 계산해서 반환해주는 함수 -------------- 0
	public double setArea(double rad) {
		return (int)(rad * rad * 3.14 * 100 + 0.5) / 100.0;
	}
	
}
