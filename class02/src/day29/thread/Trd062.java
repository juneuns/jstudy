package day29.thread;

public class Trd062 implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++ ) {
			System.out.println("영선씨가 티라미수를 사줍니다. : " + (i+1));
			
			try {
				Thread.sleep(300);
			} catch(Exception e) {}
		}
	}

}
