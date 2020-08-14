package day22.source;

public class Nemo {
	private int garo, sero, area;
	
	public Nemo() {
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

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		
//		System.out.println(garo + " - " + sero);
		setArea();
	}
	
	// 면적 셋팅해주는 함수
	public void setArea() {
		area = garo * sero;
	}
	
	// 면적이 같으면 같은 사각형으로 되게 equals() 함수 오버라이딩
	
	@Override
	public boolean equals(Object o) {
		// 먼저 o 를 Nemo 타입으로 변환해준다.
		/*
		Nemo n = (Nemo) o;
		
		// boolean bool = this.area == n.getArea();
		// return bool;
		
		return (this.area == n.getArea());
		 */
		
		return (area == ((Nemo)o).getArea());
//		return (sero == ((Nemo)o).getSero());
	}
	
	/*
		HashSet 은 내부적으로 해쉬코드를 사용해서 데이터를 정렬하고 저장한다.
		같은 데이터라는 것은 같은 해쉬코드를 갖는다는 것이 될 것이다.
		
		해쉬코드 값이 같아야 같은 데이터가 된다라는 이야기가 된다.
		
		따라서 hashCode() 함수를 오버라이드 해야야하는데
		같은 클래스일 경우 자동 호출되는 함수이다.
		
	 */

	public int hashCode() {
		return area;
//		return sero;
	}

	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}

}
