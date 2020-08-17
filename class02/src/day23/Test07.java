package day23;

import day23.source.*;
import java.util.*;

public class Test07 {
	private ArrayList<Integer> noList = new ArrayList<Integer>();
	private ArrayList<String> names = new ArrayList<String>();
	private HashMap<Integer, Student> map = new HashMap<Integer, Student>();

	public Test07() {
		for(int i = 0 ; i < 5 ; i++ ) {
			noList.add(1001 + i);
		}
		
		names.add("우지윤");
		names.add("안지영");
		names.add("린다G");
		names.add("아이린");
		names.add("조이");
		
		for(int i = 0 ; i < names.size(); i++) {
			int[] score = new int[4];
			for(int j = 0 ; j < 4 ; j++ ) {
				score[j] = (int)(Math.random()*41 + 60);
			}
			
			Student s = new Student(noList.get(i), names.get(i), score);
			
			map.put(noList.get(i), s);
		}
		
		// 데이터 꺼내서 출력해보자.
		Set<Integer> keys = map.keySet();
		
		// 그런데 정렬해서 꺼내고 싶다. 따라서 ArrayList로 만들어서 꺼내면 되겠다.
		ArrayList<Integer> kList = new ArrayList<Integer>(keys);
		// 정렬한다.
		Collections.sort(kList);
		// 이제 키값은 정렬이 됬으니 데이터를 뽑아본다.
		for(int i = 0 ; i < kList.size(); i++ ) {
			// 키값 뽑아내고...
			int no = kList.get(i);
			// 데이터 뽑아내고
			Student s = map.get(no);
			// 출력해준다.
			System.out.println(no + " 번 학생 -  이름 :  " + s.getName() + ", 총점 : " + s.getTotal());
		}
		
	}
	
	public ArrayList<Integer> setNoList(){
		for(int i = 0 ; i < 5 ; i++ ) {
			noList.add(1001 + i);
		}
		return noList;
	}
	
	public ArrayList<String> setNames(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("우지윤");
		names.add("안지영");
		names.add("린다G");
		names.add("아이린");
		names.add("조이");
		
		return names;
	}

	public static void main(String[] args) {
		new Test07();
	}

}
