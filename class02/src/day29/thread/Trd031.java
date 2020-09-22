package day29.thread;

public class Trd031 extends Thread {
	/*
		하나의 프로그램을 이용해서 여러번 실행할 경우
		이것을 구분할 필요가 생길 수 있다.
		
		구분방법은 여러가지가 있을 수 있는다.
			1. 변수를 하나 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
				예 ]
					
					String irum;
					
			2. 스레드 자체에 이름을 부여하는 방법
				이때는 상위 클래스인 Thread의 Thread(String name) 생성자를 이용하면 된다.
				
				즉, 상위 클래스의 디폴트 생성자가 아닌
				다른 생성자를 이용하면 스레드에 이름을 붙일 수 있다.
					
					super()
					
					이 함수는 
						1. 반드시 생성자 안에서만 사용해야 하고
						2. 반드시 생성자의 첫줄 첫문장으로 사용해야 한다.
	 */
	
//	String sname;
	
	public Trd031() {
		super("장성환");
		// 이 생성자를 이용해서 만들게 되면 항상 스레드의 이름이 "장성환" 이 된다.
	}
	
	public Trd031(String name) {
		super(name);
		// new 시킬때 이름을 입력받아서 스레드의 이름을 정하는 방법
	}
	@Override
	public void run() {
		/*
			스레드의 이름을 이용하는 방법
				getName() 가 이름을 알아내는 함수
			지금 run은 두번 실행된다.
			그것도 순서를 무시한 병행 처리가 된다.
			어떤 스레드가 실행되는지 먼저 알아야 한다.
			
				현재 실행중인 스레드를 알아내는 함수
					
					currentThread()
		 */
		for(int i = 0 ; i < 1000 ; i++ ) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			
			if(!name.equals("장성환")) {
				name = "\t\t" + name;
			}
			System.out.println(name + " 씨가 공부합니다. - " + (i + 1));
		}
	}
}
