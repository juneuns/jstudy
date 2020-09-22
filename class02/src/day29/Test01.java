package day29;

/*
	스레드 프로그램을 제작하고 실행해보자.
 */
import day29.thread.*;
public class Test01 {

	public Test01() {
		/*
			1. 스레드 프로그램은 반드시 New Born 상태로 만들어야 한다.
				New Born 상태란?
					실행가능한 프로그램으로 만든다는 의미이다.
				이것은 자바에서는 new 시키면 된다.
		 */
		
		T01 t1 = new T01();
		T02 t2 = new T02();
		// 이제 두개의 스레드 프로그램이  New Born 상태가 되었다.
		
		// 이것을 실행하기 위해서는 스레드 프로그램이 시작되어야할 시점에서
		// 개발자가 할 일은 Runnable 사앹로 전위만 시켜주면 된다.
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		/*
			스레드 프로그램은 반드시 프로세스 프로그램이 존재해야만 실행이 된다.
		 */
		new Test01();
	}

}
