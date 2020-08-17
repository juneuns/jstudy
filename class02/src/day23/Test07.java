package day23;

import day23.source.*;
import java.util.*;

public class Test07 {

	public Test07() {
		ArrayList<Integer> noList = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++ ) {
			noList.add(1001 + i);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("우지윤");
		names.add("안지영");
		names.add("린다G");
		names.add("아이린");
		names.add("조이");
		
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for(int i = 0 ; i < names.size(); i++) {
			int[] score = new int[4];
			for(int j = 0 ; j < 4 ; j++ ) {
				score[j] = (int)(Math.random()*41 + 60);
			}
			
			Student s = new Student(noList.get(i), names.get(i), score);
			
			map.put(noList.get(i), s);
		}
		
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
