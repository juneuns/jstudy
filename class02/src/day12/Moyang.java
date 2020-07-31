package day12;

public class Moyang {
	public static final int DONGLE = 0;
	public static final int SEMO = 1;
	public static final int NEMO = 2;
	
	int width, height, rad, shape;
	double area;
	
	public Moyang() {
		this(10, 10, NEMO);
	}
	
	public Moyang(int width, int height, int code) {
		shape = (code == SEMO ? SEMO : NEMO);
		this.width = width;
		this.height = height;
		getArea(code);
	}
	
	public Moyang(int rad) {
		shape = DONGLE;
		this.rad = rad;
		getArea(DONGLE);
	}
	
	// 사각형 면적 계산해주는 함수
	public void getArea() {
		area = width * height;
	}
	
	// 삼각형, 원의 면적 계산해주는 함수
	public void getArea(int code) {
		if(code == SEMO) {
			area = (int)(width * height / 2. * 100 + 0.5) / 100.0;
		} else if(code == NEMO) {
			area = width * height;
		} else if(code == DONGLE) {
			area = (int)(rad * rad * 3.14 * 100 + 0.5) / 100.0;
		}
	}
	
	public void toPrint() {
		String str = "";
		switch(shape) {
		case 0:
			str = "반지름이 " + rad + ", 넓이가 " + area + " 인 원형";
			break;
		case 1:
			str = "밑변이 " + width + ", 높이가 " + height + ", 넓이가 " + area + " 인 삼각형";
			break;
		case 2:
			str = "가로가 " + width + ", 세로가 " + height + ", 넓이가 " + area + " 인 사각형";
			break;
		}
		System.out.println("### 이 도형은 " + str + " 입니다.");
	}
}
