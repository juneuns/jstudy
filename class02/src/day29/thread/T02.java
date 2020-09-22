package day29.thread;

public class T02 extends Thread {
	@Override
	public void run() {
		// 여기서는 지우씨를 1000번 공부시킨다.
		for(int i =0; i < 1000; i++) {
			System.out.println("\t\t이지우씨가 공부합니다. : " + (i + 1));
		}
	}
}
