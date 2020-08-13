package addCls01;

import static java.lang.Math.*;

public class Test01 {
	public int num = 1000;
	
	public Test01() {
		int no = (int)(Math.random()*10);
		double pi = PI;
	}

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		int no = t1.num;
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

}
