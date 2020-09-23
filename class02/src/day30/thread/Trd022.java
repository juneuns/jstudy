package day30.thread;

public class Trd022 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++ ) {
			System.out.println("\t\t*** [ " + (i + 1) + " ] 번 학생이 더 달라고 조릅니다.");
			try {
				Thread.sleep(200);
			} catch(Exception e) {}
		}
	}
}
