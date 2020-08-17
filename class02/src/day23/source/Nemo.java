package day23.source;

public class Nemo implements Figure {
	private int garo, sero;
	private double area;
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public Nemo(int...size) {
		this(size[0], size[1]);
	}

	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	@Override
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = garo * sero;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
