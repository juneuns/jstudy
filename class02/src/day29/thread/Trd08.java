package day29.thread;

public class Trd08 extends Thread {
	public boolean isStart = true;
	/*
		이 변수가 하는 역할은 언제까지 run()함수가 실행될지를 
		기억하는 변수의 역할을 한다.
	 */
	@Override
	public void run() {
		for(int i = 0; isStart ; i++ ) {
			/*
				이 스레드는 무한 반복으로 반복할 예정이다.
				하지만 isStart = false 되는 순간
				이 반복문은 종료할 것이고
				run() 함수의 내용도 모두 종료가 된다.
			 */
			System.out.println("\t\t선생님이 아이스크림을 사줍니다. : " + (i + 1));
			try {
				Thread.sleep(200);
			} catch(Exception e) {}
		}
	}
}
