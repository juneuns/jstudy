package day29.thread;

import day29.*;
public class Trd101 extends Thread {
	Test10 main;
	public Trd101(Test10 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			int no = (int)(Math.random()*100 + 1);
			main.num = no;
			System.out.println(no + " 를 기억했습니다. - " + (i+1));
		}
	}
}
