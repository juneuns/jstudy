package day29.thread;

public class Trd052 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000; i++ ) {
			System.out.println("\t\t수진씨가 쿠키를 사줍니다. : " + (i + 1));
			yield();
		}
	}
}
