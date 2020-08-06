package day16;

/*
	Top Level Inner Class
 */
public class Test03 {
	public Test03() {
//		Inner02.TopIn;
//		Inner02.TopIn tin = Inner02.TopIn;
	}
	public static void main(String[] args) {
		new Test03();
	}

}

class Inner02 {
	int num;
	static int no = 10;
	void abc() {
		System.out.println("여기는 Inner02");
	}
	
	static class TopIn {
		int no = 10;
		void xyz() {
			System.out.println("TopIn.xyz()");
		}
	}
}