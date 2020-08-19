package extra02.controller;

/**
 * 	이 클래스는 평행사변형의 정보를 기억할 클래스
 * @author	전은석
 * @since 	2020.08.19
 * @version	v.1.0
 *
 */
public class Sagak implements Moyang {
	private int width, height, area;
	public Sagak() {
		this((int)(Math.random()*13 + 3), (int)(Math.random()*13 + 3));
	}
	public Sagak(int width, int height) {
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
		area = width * height;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public double getArea() {
		return area;
	}

}
