package day11;


/*
	문제 2]
		세모 데이터 5개를 관리하는 배열을 만들고
		각 인스턴스의 변수를 초기화 해서
		내용을 출력하세요.
 */
public class Ex01 {
	public Ex01() {
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}

class Semo {
	int width, height;
	double area;
	
	void setData(int width, int height) {
		this.width = width;
		this.height = height;
		area = (int)(width * height / 2.0 * 100 + 0.5) / 100.0;
	}
}
