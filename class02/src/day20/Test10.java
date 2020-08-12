package day20;

import java.util.*;
public class Test10 {

	public Test10() {
		Vector v = new Vector();
		for(int i = 0 ; i < 5 ; i++ ) {
			int no = (int) (Math.random()* 10 + 1);
			v.add(no);
		}
		
		for(int i = 0 ; i < v.size() ; i++ ) {
			System.out.print(v.get(i) + ", ");
		}
		System.out.println();
		for(int i = 0 ; i < v.size() ; i++ ) {
			System.out.print(((int)v.get(i) + i) + ", ");
		}
		
		v = new Vector();
		v.add("홍길동");
		v.add('M');
		v.add(18);
		v.add(178.5);
		System.out.println();
		for(int i = 0 ; i < v.size() ; i++ ) {
			System.out.print(v.get(i) + ", ");
		}
		
		ArrayList list = new ArrayList(v);
		System.out.println();
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.print(list.get(i) + ", ");
		}
		
		v.addAll(2, list);
		System.out.println();
		for(int i = 0 ; i < v.size() ; i++ ) {
			System.out.print(v.get(i) + ", ");
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
