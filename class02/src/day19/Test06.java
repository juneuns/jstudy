package day19;

public class Test06 {

	public Test06() {
		String sarr = "[1,2,3,4,5]";
		sarr = sarr.replaceAll(",", " | ");
		System.out.println(sarr);
	}

	public static void main(String[] args) {
		new Test06();
	}

}
