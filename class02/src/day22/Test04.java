package day22;

import java.util.*;
import day22.source.*;

public class Test04 {

	public Test04() {
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// 할일
				// o1, o2 를 Circle 타입으로 강제 형변환한다.
				Circle c1 = (Circle) o1;
				Circle c2 = (Circle) o2;
				
				double result = c1.getArea() - c2.getArea();
				return result == 0 ? 0 : (result > 0) ? 1 : -1;
			}
		});
		
		set.add(new Circle((int)(Math.random()*16 + 5)));
		set.add(new Circle((int)(Math.random()*16 + 5)));
		set.add(new Circle((int)(Math.random()*16 + 5)));
		set.add(new Circle((int)(Math.random()*16 + 5)));
		set.add(new Circle((int)(Math.random()*16 + 5)));
		
		for(Object o : set) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
