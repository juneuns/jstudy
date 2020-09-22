package day29.thread;

import day29.*;
public class Trd111 extends Thread {
	Test11 main;
	public Trd111(Test11 main) {
		this.main = main;
	}
	@Override
	public void run() {
		/*
			이 스레드에서는 배열변수에 데이터를 기억하는 역할을 할 예정이다.
			이 스레드가 5개의 데이터를 완성할 때까지는
			다른 스레드에서 배열을 사용못하게 하고 싶다.
		 */
		System.out.println("***** var init start *****");
		synchronized(main.num) {
			for(int i = 0 ; i < 5 ; i++ ) {
				int tmp = (int)(Math.random()*100 + 1);
				main.num[i] = tmp;
				System.out.println(tmp + " 를 기억했습니다.");
				
				int sec = (int)(Math.random()*(2000 - 500 + 1) + 500);
				
				try {
					Thread.sleep(sec);
				} catch(Exception e) {}
			}
			System.out.println("######## 저장 완료 #######");
		}
	}
}
