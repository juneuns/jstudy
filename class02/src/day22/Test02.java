package day22;

import java.util.*;
import day22.source.*;
public class Test02 {

	public Test02() {
		HashSet set = new HashSet();
		for(int i = 0 ; i < 8 ; i++ ) {
			Nemo n = getNemo();
			set.add(n);
		}
		set.add(new Nemo(3, 4));
		set.add(new Nemo(4, 3));
		
		System.out.println("set.size() : " + set.size());
		
		for(Object o : set) {
			System.out.println(((Nemo)o).getArea() + " : " + ((Nemo)o).getGaro() + ", " + ((Nemo)o).getSero() + " | " + ((Nemo)o).hashCode());
			
		}
	}
	
	// 네모 반환해주는 함수
	public Nemo getNemo() {
		// 가로, 세로 랜덤하게 수치 만들고 
		int garo = (int)(Math.random()*13 + 3);
		int sero = (int)(Math.random()*13 + 3);
		// 네모 만들고
		Nemo n = new Nemo(garo, sero);
		// 네모 반환해주고
		return n;
	}

	public static void main(String[] args) {
		new Test02();
	}

}
