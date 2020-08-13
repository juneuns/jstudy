package day21;

import java.util.*;

public class Test03 {

	public Test03() {
		Vector vec = new Vector();
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		vec.add(100);
		
		System.out.println(vec);
//		AbstractList 
		
		List list = vec;
		
		int[] num = {100, 100, 100, 100, 100, 100, 100};
		System.out.println(Arrays.toString(num));
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
