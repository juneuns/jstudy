package day30;

/*
	예제 ]
		ArrayList를 하나 준비하고
		이 리스트에 데이터 넣고 빼고를 할 예정이다.
		
		즉, 1번 스레드는 이곳에 데이터를 입력할 예정이고
			2번 스레드는 이곳에 데이터를 읽을 예정이다.
			
		정책 ]
			5개의 데이터가 입력되면 더이상 입력하면 안된다.
 */

import java.util.*;
import day30.thread.*;
public class Test01 {
	public ArrayList list = new ArrayList();
	
	public Test01() {
		Trd011 t1 = new Trd011(this);
		Trd012 t2 = new Trd012(this);
		
		t1.start();
		t2.start();
	}
	
	public synchronized void makeData(int num) {
		if(list.size() == 5) {
			// 이 경우는 절대로 이 함수가 일을 하면 안된다.
			try {
				System.out.println("일 그만할래요~~!");
				wait();
				// 이 순간 이 함수를 사용하는 스레드는
				// 스스로가 Block 상태로 전위된다.
			} catch(Exception e) {}
		}
		
		// 창고에 물건을 하나 넣는다.
		list.add(num);
		System.out.print(num + " 입고 완료!!! :");
		System.out.println("채운 후 현재 창고에는 " + list.size() + " 개가 입고되어있습니다.");
		// 그러면 이제 물건을 가지고 있는 사람은 일을 해도 되는 시점이 되었다.
		
		notify();
		// ==> 가장 먼저 Block 상태로 들어간 스레드가 일어나서 일을 하게 된다.
	}
	
	public synchronized void useData() {
		// 이 함수는 창고의 물건을 꺼내는 함수이다.
		
		if(list.size() == 0) {
			// 이 스레드는 물건을 꺼낼수 없는 상태이므로 스스로 Block 상태로 전위되어야 한다.
			try {
				System.out.println("할일 없네요~~~! 쉴래요!");
				wait();
			} catch(Exception e) {}
		}
		
		int num = (int) list.get(0);
		// 물건을 꺼냈으므로 창고에서 물건을 제거한다.
		list.remove(0);
		System.out.print("\t\t" + num + " 꺼내기 완료!!! - ");
		System.out.println("현재 창고의 재고는 " + list.size() + " 개 보관중입니다.");
		// 이제 창고에는 최소한 물건을 채울 공간이 적어도 한개는 존재한다.
		// 따라서 창고에 물건 채울 작업자를 깨워서 일시킨다.
		notify();
	}
	
	public static void main(String[] args) {
		new Test01();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
