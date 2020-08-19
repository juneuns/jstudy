package extra02.controller;

/**
 *  이 클래스는 사다리꼴의 정보를 기억할 클래스
 * @author	전은석
 * @since	2020.08.19
 * @version	v.1.0
 *
 */
public class Sadari implements Moyang {
	private int width1, width2, height;
	private double area;
	public Sadari() {
		this((int)(Math.random()*13 + 3), (int)(Math.random()*13 + 3), (int)(Math.random()*13 + 3));
	}
	public Sadari(int width1, int width2, int height) {
		this.width1 = width1;
		this.width2 = width2;
		this.height = height;
		setArea();
	}

	public int getWidth1() {
		return width1;
	}
	public void setWidth1(int width1) {
		this.width1 = width1;
	}
	public int getWidth2() {
		return width2;
	}
	public void setWidth2(int width2) {
		this.width2 = width2;
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
		area = (width1 + width2) * height / 2.0;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
