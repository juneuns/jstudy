package day29.thread;

public class Trd061 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			System.out.println("반장님이 꿀아메리카노를 사줍니다. : " + (i+1));
			// 한번 출력하면 비록 시간이 남았지만...
			// 이번에는 아예 Block 상태로 보낸다.
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}

}
