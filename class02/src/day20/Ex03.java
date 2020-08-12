package day20;

/*
	1.
		Vector 를 만들고
		이름, 자바, 디비, 웹, jsp, 총점을 저장해서
		출력하세요.
		
	2. 3명을 출력하세요.
 */

import java.util.*;
public class Ex03 {

	public Ex03() {
		Vector v = new Vector();
		v.add("김정구");
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(0);
		System.out.println(v.get(5));
		
//		v.set(5, (int)v.get(5) + (int) v.get(4) + (int)v.get(3) + (int)v.get(2) + (int)v.get(1));
		for(int i = 1 ; i < 5 ; i++) {
			v.set(5, (int)v.get(5) + (int)v.get(i));
		}
		System.out.println(v.get(5));
		
//		int no = (int)(Math.random() * 0 + 100);
//		System.out.println(v.toString());
		Vector student = new Vector();
		student.add(v);
		student.add(v);
		student.add(v);
		
		/*
		for(Object o : student) {
			System.out.println(((Vector)o).toString());
		}
		*/
		System.out.println(student);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
