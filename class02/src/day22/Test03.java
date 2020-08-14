package day22;

import java.util.*;
import day22.source.*;
public class Test03 {

	public Test03() {
		/*
		TreeSet set = new TreeSet();
		// ==> TreeSet 은 정렬을 해서 데이터를 보관하게 되는데
			   그 말은 입력되는 데이터가 크기비교가 되어야 된다는 말이다.
			   따라서 크기비교가 가능한 Comparable 인터페이스를 구현한 클래스 여야 한다.
			   
			   이렇게 크기비교가 불가능한 데이터를 입력해줘야는 경우에는
			   TreeSet을 만들때 정렬기준을 만들어서 만들면 해결이 된다.
		*/
		
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Nemo n1 = (Nemo) o1;
				Nemo n2 = (Nemo) o2;
				int result = n1.getArea() - n2.getArea();
				return result;
			}
		});
		
		set.add(getNemo());
		set.add(getNemo());
		set.add(getNemo());
		
		// 출력
		for(Object o : set) {
			System.out.println(((Nemo)o).getArea());
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
		new Test03();
	}

}
