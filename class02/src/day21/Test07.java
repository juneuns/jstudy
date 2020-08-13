package day21;


/*
	랜덤하게 10 ~ 50 사이의 반지름을 가지는 Circle을
	ArrayList에 10개를 채우고
	출력하고
	정렬하고
	출력하세요.
 */

import java.util.*;
public class Test07 {
	class MySort2 implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Circle c1 = (Circle) o1;
			Circle c2 = (Circle) o2;
			double result = c1.getArea() - c2.getArea();
			return -result > 0 ? 1 : -1;
		}
		
	}
	public Test07() {
		// ArrayList 를 준비한다.
		ArrayList list = new ArrayList();
		// list에 Circle 을 10개 채운다.
		for(int i = 0 ; i < 10 ; i++) {
			Circle won = getWon();
			list.add(won);
		}
		// 출력한다.
		System.out.println("1. 정렬 전");
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 정렬한다. 
		// 지금 처럼 정렬기준이 없거나 정렬기준을 바꿔야 할 경우는 
		// Comparator 를 만들어서 Collections.sor(List l, Comparator c)
		// 로 정렬을 한다.
		
		/*
		// 외부 클래스 이용방법
		Collections.sort(list, new MySort1());
		*/
		/*
		// 전역 내부 클래스 이용방법
		Collections.sort(list, new MySort2());
		*/
		
		// 무명 내부 클래스를 이용하는 방법
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle) o1;
				Circle c2 = (Circle) o2;
				double result = c1.getArea() - c2.getArea();
				return result > 0 ? 1 : -1;
			}
		});
		
		// 출력한다.
		System.out.println("2. 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 내림차순 정렬한다.
		Collections.reverse(list);
		// 출력한다.
		System.out.println("2. 내림차순 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
		
	}
	
	// 랜덤하게 반지름을 만들어서 Won에 데이터 셋팅하고 넘겨주는 함수
	public Circle getWon() {
		Circle won = new Circle();
		// 데이터 채우고
		int rad = (int)(Math.random()*41 + 10);
		won.setRad(rad);
		won.setArround();
		won.setArea();
		
		return won;
	}


	public static void main(String[] args) {
		new Test07();
	}

}
