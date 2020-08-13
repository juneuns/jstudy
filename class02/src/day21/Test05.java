package day21;

/*
	Nemo 클래스를 정의하고
	랜덤하게 가로와 세로를 만들어서 데이터를 채운 Nemo 10개를 
	List에 담고
	정렬해서 출력하세요.
 */

import java.util.*;
public class Test05 {

	public Test05() {
		// ArrayList 만들고
		ArrayList list = new ArrayList();
		// list에 Nemo 10개 채우고
		for(int i = 0 ; i < 10 ; i++ ) {
			Nemo nemo = getNemo();
			
			list.add(nemo);
		}
		// 출력하고
		System.out.println("1. 정렬 전 출력");
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		// 정렬하고
		Collections.sort(list);
		// 출력하고
		System.out.println("2. 정렬 후 출력");
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}
	
	// 랜덤하게 가로, 세로를 만들어서 Nemo 객체를 반환해주는 함수
	public Nemo getNemo() {
		// 넘겨줄 Nemo 만들고
		Nemo nemo = new Nemo();
		// 네모 데이터 채우고
		
		// 가로세로 데이터 만들고
		int garo = (int)(Math.random()*41 + 10);
		int sero = (int)(Math.random()*41 + 10);
		// 네모에 채우고
		nemo.setGaro(garo);
		nemo.setSero(sero);
		// 면적에 채우고
		nemo.setArea();
		
		// 네모 반환해주고
		return nemo;
	}

	public static void main(String[] args) {
		new Test05();
	}

}
