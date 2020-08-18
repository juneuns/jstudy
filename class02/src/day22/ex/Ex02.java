package day22.ex;

/*
	문제 2 ]
		랜덤한 숫자를 10개를 발생시켜서 (11 ~ 99) TreeSet에 저장하고 출력하고
		정렬방식을 내림차순으로 변경해서 저장하고 출력하고...
 */

import java.util.*;

public class Ex02 {

	public Ex02() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i = 0 ; set.size() <= 10 ; i++ ) {
			set.add((int)(Math.random()*89 + 11));
		}
		for(Integer no : set ) {
			System.out.print(no + ", ");
		}
		System.out.println();
		TreeSet<Integer> set2 = new TreeSet<Integer>(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int no1 = (int) o1;
				int no2 = (int) o2;
				
				return no2 - no1;
			}
		});
		
		for(int no : set) {
			set2.add(no);
		}
		for(Integer no : set2 ) {
			System.out.print(no + ", ");
		}
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
