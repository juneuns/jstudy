package day29.thread;

import day29.*;
public class Trd122 extends Thread {
	Test12 main;
	
	public Trd122(Test12 main, String name) {
		super(name);
		this.main = main;
	}
	
	@Override
	public void run() {
		main.abc();
		main.xyz();
	}
}
