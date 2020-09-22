package day29;
/*
	함수 동기화
 */

import day29.thread.*;
public class Test12 {

	public Test12() {
		Trd121 t1 = new Trd121(this, "장성환");
		Trd122 t2 = new Trd122(this, "\t\t이지우");
		
		t2.start();
		t1.start();
	}
	
	// 다음 두 함수는 생성자에서 실행하는 스레드에서 호출해서 사용하는 함수이다.
	
	public synchronized void abc() {
		// 지금 이 함수를 호출하는 스레드를 알아낸다.
		String name = Thread.currentThread().getName();
		System.out.println(name + " 스레드가 abc 함수를 사용하기 시작!");
		
		// 2초동안 기다렸다가 
		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
		
		System.out.println(name + " 스레드가 abc 함수 사용을 종료!");
	}
	
	public synchronized void xyz() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 스레드가 xyz 함수를 사용하기 시작!");
		
		// 2초동안 기다렸다가 
		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
		
		System.out.println(name + " 스레드가 xyz 함수 사용을 종료!");
	}
	
	public static void main(String[] args) {
		new Test12();
	}

}
