package extra02.controller;

public class Diamnd implements Moyang {
	private int width, height;
	private double area;
	
	public Diamnd() {
		this((int)(Math.random()*13 + 3), (int)(Math.random()*13 + 3));
	}
	public Diamnd(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setArea() {
		area = width * height / 2.0;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public double getArea() {
		return area;
	}

}
