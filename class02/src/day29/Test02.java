package day29;

import day29.thread.*;
public class Test02 {

	public Test02() {
		// Runnable 인터페이스를 구현한 경우에는 조금 다르다.
		
		// 1. 클래스를 new 시킨다.
		Trd021 t01 = new Trd021();
		Trd022 t02 = new Trd022();
		/*
			지금 t01, t02는 아직 New Born 상태가 아니다.
			일반적으로 클래스를 사용하기 위해서 new 시켜놓은 상태와 같다.
			따라서
			Runnable은 아직 Thread 가 아니다.
		 */
		
		// 2. Thread 를 각각 만든다.
		Thread t1 = new Thread(t01);
		Thread t2 = new Thread(t02);
		// 이제 드뎌 Thread가 만들어 졌고 New Born 상태가 되었다.
		
		// 3. Runnable 로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test02();
	}
}
