package day12;

public class Jojikwon {
	int mno;
	String name, id, mail;
	
	// 기본 생성자 함수
	public Jojikwon() {}
	
	// 이름만 입력해도 객체가 만들어지게...
	public Jojikwon(String name) {
		this.name = name;
	}
	
	// 이름과 아이디를 입력하면 객체가 만들어지도록...
	public Jojikwon(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	// 회원번호, 이름, 아이디, 메일을 모두 입력해야 객체가 만들어지도록...
	public Jojikwon(int mno, String name, String id, String mail) {
		this.mno = mno;
		this.name = name;
		this.id = id;
		this.mail = mail;
	}
	
	public String toString() {
		return mno + " - " + name + " | " + id + " | " + mail ;
	}
}
