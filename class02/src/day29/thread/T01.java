package day29.thread;

public class T01 extends Thread {
/*
	스레드 프로그램 제작 방법
		1. Thread 클래스를 상속받은 클래스를 만든다.
		2. run() 함수를 오버라이딩한다.
 */
//	 물론 이 클래스 내에도 변수, 함수, 생성자가 올 수 있다.
	@Override
	public void run() {
		// 이프로그램에서는 혜찬씨한테 1000번 공부시킨다.
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("혜찬씨가 공부합니다. - " +(i+1) );
		}
	}
}
