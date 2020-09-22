package day29.thread;

public class Trd04 implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		if(!name.equals("장성환")) {
			name = "\t\t" + name;
		}
		
		for(int i = 0 ; i < 1000; i++ ) {
			System.out.println(name + " 씨가 공부합니다. : " + (i + 1));
		}
	}
}
