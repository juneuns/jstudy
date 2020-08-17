package day23.source;

public class Semo implements Figure {
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public Semo(int...size) {
		this(size[0], size[1]);
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
	@Override
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = width * height / 2.0;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
