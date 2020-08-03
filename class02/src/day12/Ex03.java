package day12;

/*
	문제 3 ]
		회원정보를 기억할 클래스를 작성하세요.
		회원 정보는 
			회원번호, 회원이름, 아이디, 메일
		
		1. 회원이름만 입력하면 객체로 만들수 있게 한다.
		2. 회원 이름과 아이디를 입력해야만 객체가 될 수 있게 한다.
		3. 회원번호, 회원이름, 아이디, 메일을 모두 입력해야 객체가 될 수 있도록 한다.
		
		생성자 함수 오버로딩 문제....
		
 */
public class Ex03 {
	public Ex03() {
//		fromName();
//		nameAndId();
		setAll();
	}
	public static void main(String[] args) {
		new Ex03();
	}
	
	public void fromName() {
		// 이름을 입력해서 객체를 만들고 출력해보자.
		Jojikwon member = new Jojikwon("윤요셉");
		System.out.println(member);
		member.mno = 1001;
		member.id = "joseph";
		member.mail = "joseph@increpas.com";
		System.out.println(member);
	}
	
	public void nameAndId() {
		// 이름과 아이디를 입력하면 객체가 만들어지게 한다.
		Jojikwon memb = new Jojikwon("유병욱", "wook");
		System.out.println(memb);
		memb.mno = 1002;
		memb.mail = "wook@increpas.com";
		System.out.println(memb);
	}
	
	public void setAll() {
		// 모든 변수를 초기화 하면서 객체가 만들어지게....
		Jojikwon memb = new Jojikwon(1003, "이지우", "jiwoo", "jiwoo@increpas.com");
		System.out.println(memb);
	}
}
