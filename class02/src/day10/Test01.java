package day10;

/*
 	앞으로 함수나 코드의 내용을 실행할 때는
 	생성자 함수를 이용해서 실행하도록 한다.
 */
public class Test01 {
	int no = 10;
	
	public Test01() {
		// 생성자 함수는 반환값타입이 존재하지 않고
		// 기본 생성자 함수는 생성자 함수중 매개변수리스트가 존재하지 않는 함수를 기본생성자 함수라 한다.
		abc();
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
	void abc() {
		System.out.println("여기는 abc 함수입니다.");
	}

}
