package day23;

import day23.source.*;
import java.util.*;

public class Test08 {

	/*
		제너릭스의 와일드 카드
			어떤 함수가 제너릭 선언된 컬렉션을 매개변수로 받을 때
			자기 자신 이외의 다른 클래스로 제너릭 선언된 것도 받을 수 있도록 해 놓은 것.
	 */
	public Test08() {
		ArrayList<Figure> list1 = new ArrayList<Figure>();
		int no1 = (int)(Math.random()*13 + 3);
		int no2 = (int)(Math.random()*13 + 3);
		Semo semo = new Semo(no1, no2);
		Nemo nemo = new Nemo(no1, no2);
		
		list1.add(semo);
		list1.add(nemo);
		
		for(int i = 0 ; i < list1.size(); i++ ) {
			Figure f1 = list1.get(i);
			// list1에 입력되는 데이터는 Figure로 한정시켜놓았고
			// Figure의 멤버는 getArea() 만 존재하므로 이 멤버만 사용가능 하다.
			
			if(f1 instanceof Semo) {
				Semo sm1 = (Semo) f1;
				System.out.println(sm1.getArea() + " : 밑변 - " + sm1.getWidth() + ", 높이 - " + sm1.getHeight());
			} else if(f1 instanceof Nemo) {
				Nemo nm1 = (Nemo) f1;
				System.out.println(nm1.getArea() + " : 가로 - " + nm1.getGaro() + ", 세로 - " + nm1.getSero());
			}
		}
		
		int[][] no = new int[5][2];
		for(int i = 0 ; i < 5 ; i++ ) {
			int[] n = new int[2];
			n[0] = (int)(Math.random()*13 + 3);
			n[1] = (int)(Math.random()*13 + 3);
			no[i] = n;
		}
		
		ArrayList<Figure> fList = new ArrayList<Figure>();
		
		for(int i = 0 ; i < no.length ; i++ ) {
			Semo sm = new Semo(no[i]);
			fList.add(sm);
		}
		
		// 함수 호출
		func01(fList);
		
		ArrayList<Semo> sList = new ArrayList<Semo>();
		
		for(int i = 0 ; i < no.length ; i++ ) {
			Semo sm = new Semo(no[i]);
			sList.add(sm);
		}
		
		// 함수 호출
//		func01(sList); // error
		func02(sList);
		func02(fList);
		
		// func03() 호출
		func03(fList);
		
		// fun04() 호출
		func04(fList);
		func04(sList);
	}
	
	// ArrayList<Figure> 를 매개변수로 요구하는 함수
	public void func01(ArrayList<Figure> list) {
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
		}
	}
	
	// ArrayList<Figure> 를 매개변수로 요구하는 함수
	public void func02(ArrayList<? extends Figure> list) {
		/*
			이 함수는 Figure 로 제너릭 선언된 ArrayList와
			그 하위 클래스로 제너릭 선언된 것을 매개변수로 받을 수 있다.
			
		 */
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
		}
	}
	
	// ArrayList<Figure> 를 매개변수로 요구하는 함수
	public void func03(ArrayList<? super Nemo> list) {
		/*
			이 함수는 반드시 Nemo 타입으로 제너릭 선언된 것과
			그 상위 클래스로 제너릭 선언된 것을 매개변수로 받을 수 있다.
		 */
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(((Figure) list.get(i)).getArea());
		}
	}
	
	public void func04(ArrayList<?> list) { // 모든 제너릭 선언된 ArrayList를 모두 받는다.
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
