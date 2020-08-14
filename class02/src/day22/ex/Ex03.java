package day22.ex;

/*
	문제 3 ]
		
		학생 성적을 관리하기 위한 클래스를 제작하세요
			String name
			int ban
			int score
			
		이 클래스를 TreeSet에 저장할 때 
		이름순으로 정렬되서 저장되게 하고 데이터를 5개를 만들어서 저장하고 출력하고...
		반 순으로 정렬되서 저장되게하고 출력하고 만약 반이 같으면 점수 순으로 정렬되게 하고 출력하고...
		
 */

import day22.source.*;

import java.util.*;
public class Ex03 {
	TreeSet set, set2 ;
	HashSet names;

	public Ex03() {
		set = new TreeSet();
		set2 = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				int result = s1.getBan() - s2.getBan(); 
				
				if(result == 0) {
					result = s1.getScore() - s2.getScore();
				}
				
				return result;
			}
		});
		
		setVar();
		toPrint();
		
		System.out.println("---------------------------------------------------");
		setVar(set2);
		toPrint(set2);
	}
	
	public void setVar() {
		names = new HashSet();
		names.add("둘리");
		names.add("고길동");
		names.add("희동이");
		names.add("또치");
		names.add("도우너");
		
		for(Object o : names) {
			int ban = (int) (Math.random()*5 + 1);
			int score = (int)(Math.random()*41 + 60);
			Student stud = new Student((String)o, ban, score);
			set.add(stud);
		}
	}
	
	public void setVar(TreeSet set) {
		for(Object o : names) {
			int ban = (int) (Math.random()*5 + 1);
			int score = (int)(Math.random()*41 + 60);
			Student stud = new Student((String)o, ban, score);
			set.add(stud);
		}
	}
	
	// 출력함수
	public void toPrint() {
		for(Object o : set) {
			System.out.println(o);
		}
	}
	
	// 출력함수
	public void toPrint(TreeSet set) {
		for(Object o : set) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
