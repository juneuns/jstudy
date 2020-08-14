package day22;

import java.util.*;

public class Test05 {

	public Test05() {
		HashSet set = new HashSet();
		set.add("고길동");
		set.add("둘리");
		set.add("고길동");
		set.add("희동이");
		set.add("철수");
		set.add("영희");
		set.add("마이콜");
		set.add("또치");
		set.add("도우너");
		set.add("마이콜");
		
		for(Object o : set) {
			System.out.println(o);
//			System.out.println(String.format("%-10d", o.hashCode()));
		}
		for(Object o : set) {
			System.out.println(String.format("%-10d", o.hashCode()));
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
