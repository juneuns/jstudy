package day29;

import day29.thread.*;
public class Test10 {
	public int num;
	
	public Test10() {
		// New Born
		Trd101 t1 = new Trd101(this);
		Trd102 t2 = new Trd102(this);
		
		// Runnable
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test10();
	}

}
