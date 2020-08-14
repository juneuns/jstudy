package day22.source;

import java.text.*;

public class Circle {
	private final int CODE = 1000;
	private int rad;
	private double arround, area;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	
	// 둘레 문자열로 반환하도록 오버로딩
	public String getArround(int code) {
		DecimalFormat form = new DecimalFormat("################.00");
		String val = form.format(arround);
		return val;
	}
	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	
	// 넓이 문자열로 반환하도록 오버로딩
	public String getArea(int code) {
		DecimalFormat form = new DecimalFormat("################.00");
		String val = form.format(area);
		return val;
	}
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Circle | rad = " + String.format("%3d", rad) + ", arround = " + String.format("%7.2f", getArround()) + ", area = " + String.format("%7.2f", getArea());
//		return "Circle | rad=" + String.format("%3d", rad) + ", arround=" + getArround(CODE) + ", area=" + getArea(CODE);
	}
	
}
