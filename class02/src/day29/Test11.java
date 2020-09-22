package day29;

import day29.thread.*;
public class Test11 {
	public int[] num = new int[5];
	public Test11() {
		Trd111 t1 = new Trd111(this);
		Trd112 t2 = new Trd112(this);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}

}
