package day30.thread;

public class Trd021 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println("반장님이 꿀아이스아메리카노를 쏩니다. - " + (i + 1) );
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
