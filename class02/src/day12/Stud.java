package day12;

public class Stud {
	// 이 클래스는 학생 한명의 성적을 기억할 클래스이다.
	// 따라서 각 과목의 점수를 기억할 변수를 준비해준다.
	int java, oracle, html, jsp, total;
	
	// 생성자 함수를 만든다.
	// 기본 생성자 함수
	public Stud() {}
	
	// 네 과목의 점수를 입력하면 
	// 객체가 만들어지도록 하는 생성자 함수
	public Stud(int java, int oracle, int html, int jsp) {
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.jsp = jsp;
		setTotal();
	}
	
	// 총점을 구해주는 함수
	public void setTotal() {
		total = java + oracle + html + jsp;
	}
	
	// toString() 를 오버라이딩(함수의 재정의)한다.
	public String toString() {
		return "java : " + java + " | oracle : " + oracle + 
				" | html : " + html + " | jsp : " + jsp + 
				" | total : " + total;
	}
}
