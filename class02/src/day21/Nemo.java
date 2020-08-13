package day21;

/*
	이 클래스처럼
	크기비교가 불가능한 경우에는 
	크기비교가 가능하도록 Comparable 인터페이스를 구현해줘야 한다.
 */
public class Nemo implements Comparable {
	private int garo, sero, area;

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
	public int getArea() {
		return area;
	}
	public void setArea() {
		this.area = garo * sero ;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Nemo : garo = " + garo + ", sero = " + sero + ", area = " + area;
	}
	@Override
	public int compareTo(Object o) {
		Nemo n = (Nemo) o;
		// 이제 필요한 데이터가 준비 됬으니
		// 비교 기준을 정해준다.
		// 우리의 경우 면적(area)를 기준으로 하기로하자.
		int area1 = n.getArea();
		
		int result = area - area1;
		return -result;
	}
	/*
	*/
}
