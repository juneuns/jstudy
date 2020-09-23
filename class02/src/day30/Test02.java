package day30;

import day30.thread.*;
public class Test02 {

	public Test02() {
		Trd021 t1 = new Trd021();
		Trd022 t2 = new Trd022();
		
		t1.start();
		t2.start();
		
		/*
			특정 스레드가 다른 스레드에 실행이 될 때
			실행하지 못하게 하는 방법
				
				join()
		 */
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		try {
			t1.join();
			System.out.println("**************************************");
			t2.join();
			System.out.println("######################################");
			/*
				t1 스레드가 Block 이 되는 것이 아니고
				지금 실행중인 프로그램(스레드포함) ==> 메인 프로세스
				가 중단되는 것이다.
				언제까지??
				지정한 스레드(t1)가 작업을 마칠때 까지....
			 */
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
