package day30.thread;

import day30.*;
public class Trd012 extends Thread {
	Test01 main;
	
	public Trd012(Test01 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++ ) {
			main.useData();
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			} catch(Exception e) {}
		}
	}
}
