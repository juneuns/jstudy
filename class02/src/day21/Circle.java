package day21;

import java.text.*;
public class Circle {
	private final int ISSTRING = 0;
	private int rad; // 반지름 기억할 변수
	private double arround; // 둘레 기억할 변수
	private double area; // 넓이 기억할 변수
	// 접근지정자가 이 클래스내에서만 접근하도록 되어있으므로 
	// 데이터를 꺼내고 기억시키는 기능의 함수를 만들어 두자.
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public String getArround(int code) {
		DecimalFormat form = new DecimalFormat("###############.##");
		String str = form.format(arround);
		return str;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public String getArea(int code) {
		DecimalFormat form = new DecimalFormat("###############.##");
		String str = form.format(area);
		return str;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		// 우리가 만드는 모든 클래스는 Object 클래스를 상속 받아서 만드는 클래스가 되므로
		// 당연히 Object 가지고 있는 멤버는 모두 가지고 있게 된다.
		return "Circle : rad = " + rad + ", arround = " + getArround(ISSTRING) + ", area = " + getArea(ISSTRING) ;
	}
	
}
