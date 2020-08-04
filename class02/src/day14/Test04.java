package day14;

public class Test04 {
	public Test04() {
		Object o1 = new Figure();
		
//		System.out.println(o1.getArea());
		
		Object[] o2 = new Object[] {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < o2.length ; i++ ) {
			System.out.print(o2[i].toString() + 10 + ", ");
//			System.out.print(((int)o2[i] + 10) + ", ");
		}
	}
	public static void main(String[] args) {
		new Test04();
	}

}
