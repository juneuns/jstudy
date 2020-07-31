package day12;

public class Ex05 {
	public Ex05() {
		Moyang[] m1 = new Moyang[10];
		for(int i = 0 ; i < m1.length ; i++ ) {
			int sh = (int)(Math.random()*3);
			int no1 = (int)(Math.random()*16 + 5);
			if(sh == 0) {
				m1[i] = new Moyang(no1);
				continue;
			}
			int no2 = (int)(Math.random()*16 + 5);
			m1[i] = new Moyang(no1, no2, sh);
		}
		// 출력하기
		for(Moyang m : m1) {
			m.toPrint();
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
