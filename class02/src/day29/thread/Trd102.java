package day29.thread;

import day29.*;

public class Trd102 extends Thread {
	Test10 main;
	public Trd102(Test10 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			int no = main.num;
			System.out.println("\t\t" + no + " 를 읽었습니다. : " + (i + 1));
		}
	}
}
