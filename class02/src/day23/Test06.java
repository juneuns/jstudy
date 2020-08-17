package day23;

import java.util.*;

public class Test06 {

	public Test06() {
		HashSet<String> set = new HashSet<String>();
		set.add("iu");
		set.add("제시카");
		set.add("볼빨간 사춘기");
		set.add("안지영");
		set.add("우지은");
		set.add("싹쓰리");
		set.add("린다G");
		set.add("이효리");
		
		/*
		// 1. Iterator 로 꺼내는 방법
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String str = itor.next();
			System.out.println(str);
		}
		*/
		
		// 2. ArrayList로 꺼내는 방법
		ArrayList<String> list = new ArrayList<String>(set);
		// 정렬하고
		Collections.sort(list);
		// 출력
		for(int i = 0 ; i < list.size(); i++ ) {
			String str = list.get(i);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
