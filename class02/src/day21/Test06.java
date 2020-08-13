package day21;


/*
	랜덤하게 10 ~ 50 사이의 반지름을 가지는 Won을
	ArrayList에 10개를 채우고
	출력하고
	정렬하고
	출력하세요.
 */

import java.util.*;

public class Test06 {

	public Test06() {
		// ArrayList 만들고
		ArrayList list = new ArrayList();
		// 10번 반복해서 데이터 채우고
		for(int i = 0 ; i < 10 ; i++ ) {
			Won w = getWon();
			list.add(w);
		}
		
		// 출력하고
		System.out.println("1. 정렬 전");
		for(Object o : list) {
			System.out.println(o);
		}
		// 정렬하고
		Collections.sort(list);
		// 출력하고
		System.out.println("1. 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 내림차순 정렬하고
		Collections.reverse(list);
		// 출력하고
		System.out.println("1. 내림차순 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	// 랜덤하게 반지름을 만들어서 Won에 데이터 셋팅하고 넘겨주는 함수
	public Won getWon() {
		Won won = new Won();
		// 데이터 채우고
		int rad = (int)(Math.random()*41 + 10);
		won.setRad(rad);
		won.setArround();
		won.setArea();
		
		return won;
	}

	public static void main(String[] args) {
		new Test06();
	}

}
