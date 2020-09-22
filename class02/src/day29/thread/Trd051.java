package day29.thread;

public class Trd051 extends Thread {
	public void run() {
		for(int i = 0 ; i < 1000 ; i++ ) {
			System.out.println("반장님이 아메리카노 사줍니다. - " + (i + 1) );
			// 한번 출력했으니
			// 다른 프로그램으로 양보하세요.
			// ==> Runnable 상태로 돌아가세요.
			yield();
		}
	}
}
