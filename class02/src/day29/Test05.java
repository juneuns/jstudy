package day29;

import day29.thread.*;
public class Test05 {

	public Test05() {
		Trd051 t1 = new Trd051();
		Trd052 t2 = new Trd052(); // New Born 상태
		
		// ====> Runnable 로 전위
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test05();
	}

}
