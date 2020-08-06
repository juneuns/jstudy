package day16;

/*
	Top Level Inner Class
 */
public class Test03 {
	public Test03() {
		System.out.println(Inner02.no);
		Inner02.abc();
		
		Inner02.TopIn iTop = new Inner02.TopIn();
		iTop.xyz();
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}

class Inner02 {
	int num;
	static int no = 10; // static 영역에 Inner02 int no = 10;
	static void abc() {
		System.out.println("여기는 Inner02");
	}
	
	static class TopIn {
		int no = 10;
		void xyz() {
			System.out.println("TopIn.xyz()");
		}
	}
	
	
}