package day15;

public class Test04 {
	
	public Test04() {
		int no1 = (int)(Math.random() * 16 + 5);
		int no2 = (int)(Math.random() * 16 + 5);
		Figure nemo = new Nemo(no1, no2);
		Figure semo = new Semo(no1, no2);
		Figure dongle = new Dongle(no1);
		
		nemo.toPrint();
		semo.toPrint();
		dongle.toPrint();
	}
	public static void main(String[] args) {
		new Test04();
	}
}

abstract class Figure {
	public abstract void setArea();
	public abstract void toPrint();
}

class Nemo extends Figure {
	int width, height;
	double area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	// Figure 클래스의 setArea() 함수 오버라이딩
	public void setArea() {
		area = width * height;
	}
	
	// Figure 클래스의 toPrint() 함수 오버라이딩
	public void toPrint() {
		System.out.println("Nemo 클래스 : 가로 - " + width + " | 세로 - " + height + " | 넓이 : " + area);
	}
}

class Semo extends Figure {
	int width, height;
	double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * height / 2.0;
	}
	@Override
	public void toPrint() {
		System.out.println("Semo 클래스 : 밑변 - " + width + " | 높이 - " + height + " | 넓이 : " + area);
	}
}

class Dongle extends Figure {
	int rad;
	double arround, area;
	
	public Dongle() {}
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = (int)(2 * rad * Math.PI * 100 + 0.5) / 100.0;
	}
	
	@Override
	public void setArea() {
		area = (int)(rad * rad * Math.PI * 100 + 0.5) / 100.0 ;
	}

	@Override
	public void toPrint() {
		System.out.println("Dongle 클래스 : 반지름 - " + rad + " | 둘레 - " + arround + " | 넓이 : " + area);
	}
	
}
