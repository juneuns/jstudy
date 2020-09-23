package day30.thread;

import java.util.*;

import day30.*;
public class Trd011 extends Thread {
	Test01 main;
	
	public Trd011(Test01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++ ) {
			int no = (int)(Math.random()*100 + 1);
			main.makeData(no);
			int sec = (int)(Math.random()*1501 + 500); // 500 ~ 2000
			try {
				Thread.sleep(sec);
			} catch(Exception e) {}
		}
	}
}
