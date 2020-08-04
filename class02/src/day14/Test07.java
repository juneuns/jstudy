package day14;

import day14.sub.*;
public class Test07 extends Class02 {
	String cName = "Test07";
	public Test07() {
//		super();
//		1.
//		System.out.println(new Class00().getNo());
		
//		2.
//		Class01 c1 = new Class01();
//		int num = c1.no;
		
//		3.
//		Class02 c2 = new Class02();
		String className = super.cName;
		System.out.println(className);
		System.out.println(cName);
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}
