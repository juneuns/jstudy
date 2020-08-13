package day21;

import java.util.*;

public class MySort1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Circle c1 = (Circle) o1;
		Circle c2 = (Circle) o2;
		double result = c1.getArea() - c2.getArea();
		return result > 0 ? 1 : -1;
	}

}
