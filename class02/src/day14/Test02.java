package day14;


public class Test02 {
	
	public Test02() {
		Figure f1 = new Figure();
		Figure f2 = new Sagak();	// 자동 형변환
		Sagak s1 = new Sagak();
		Semo s2 = new Semo();
		Dongle d1 = new Dongle();
		
		System.out.println(s1 instanceof Sagak);
		System.out.println(s1 instanceof Figure); // Figure > Sagak 
		System.out.println((Figure)s1 instanceof Semo);
		System.out.println(f1 instanceof Figure);
//		System.out.println((Sagak)f1 instanceof Sagak);// 형변환은 되지만 사용하지는 못한다. <== 멤버가 없으므로 사각형이 아니기 때문에...
		System.out.println(f1 instanceof Semo);
		System.out.println(f1 instanceof Dongle);
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}

class Figure {
	double getArea(){
		return 0.0;
	}
	public String toString(){
		return "이것은 도형입니다.";
	}
}

class Sagak extends Figure {
	int width, height;
	double area;
	
	// 새성자 함수를 만들어둔다.
	public Sagak() {
		this(1, 1);
		// 원칙은 this.Sagak(1, 1) 호출해야하지만 생성자 함수는 일반함수처럼 호출할 수 없다.
	}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}
	
	public double getArea() { 
		/*
		 	getArea() 오버라이딩
		 	
		 	방법 ]
		 		
		 		1. 함수의 원형은 유지한다. 함수의 원형 = 반환값타입 + 함수이름 + 매개변수리스트
		 		2. 접근지정자는 같거나 넓은 방향으로 한다.
		 */
		return width * height;
	}
	
	public String toString() {
		return "이 도형은 가로가 " + width + 
				" 이고 세로가 " + height + 
				" 이고 넓이가 " + area + 
				" 인 사각형입니다.";
	}
}

class Semo extends Figure {
	int width, height;
	double area;
	
	public Semo() {
		this(1, 1);
	}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		area = getArea();
	}
	
	public double getArea() {
		return width * height / 2.0;
	}
	
	public String toString() {
		return "이 도형은 밑변이 " + width + 
				" 이고 높이가 " + height + 
				" 이고 넓이가 " + area + 
				" 인 삼각형입니다.";
	}
}

class Dongle extends Figure {
	int rad;
	double arround, area;
	
	// 생성자 함수
	public Dongle() {
		this(1);
	}
	
	public Dongle(int rad) {
		this.rad = rad;
		area = getArea();
		setArround();
	}
	
	public double getArea() {
		return rad * rad * 3.14;
	}
	
	// 둘레 변수 초기화 해주는 함수
	public void setArround() {
		arround = ((int)(2 * rad * 3.14 * 100 + 0.5)) / 100.0;
	}
	
	public String toString() {
		return "이 도형은 반지름이 " + rad + 
				" 이고  둘레가 " + arround + 
				" 이고 넓이가 " + area + 
				" 인 원입니다.";
	}
}
