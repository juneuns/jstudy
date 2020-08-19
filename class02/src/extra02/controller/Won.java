package extra02.controller;

public class Won implements Moyang {
	private int rad;
	private double arround, area;
	public Won() {
		this((int)(Math.random()*13 + 3));
	}
	public Won(int rad) {
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
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public double getArea() {
		return area;
	}

}
