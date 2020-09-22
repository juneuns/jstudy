package day29.thread;

import day29.*;
public class Trd091 extends Thread {
	Test09 main;
	public Trd091(Test09 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println("반장님이 아이스크림사달라고 조릅니다. - " + (i + 1));
			try {
				Thread.sleep(200);
			} catch(Exception e) {}
		}
		
		// 이 부분은 이 쓰레드의 수행내용이 종료되는 시점이다.
		// 따라서 여기서 Trd092 스레드를 종료를 유도해야 한다.
		main.t2.isStart = false;
	}
}
