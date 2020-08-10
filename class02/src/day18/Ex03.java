package day18;

import javax.swing.JOptionPane;

/*
	학생의 
		이름, java, oracle, web, jsp, total
	성적을 관리할 클래스를 작성하세요.
	
	1.  toString() 오버라이드
		단, 클래스를 출력하면
			"???? 학생의 성적 : java - xxx, oracle - xxx, web - xxx, jsp - xxx, total - xxx"
		의 형식으로 출력되게 하세요.
	
	2. 	equals() 오버라이드
		학생이름이 같으면 같은 학생으로 처리되게 하세요.
 */
public class Ex03 {

	public Ex03() {
		// 두 학생의 데이터를 입력해 보자. 반복해서 처리할 것이므로 배열로 만들어서 처리하자.
		Stud[] stud = new Stud[2];
		
		for(int i = 0 ; i < stud.length ; i++ ) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요!");
			// 같은 이름이 발생하면 예외가 발생하게 처리
			try {
				if(i != 0 && name.equals(stud[i - 1].name)) {
					throw new Exception();
				}
			} catch(Exception e) {
				i--;
				JOptionPane.showMessageDialog(null, "같은 학생이 입력되었습니다.");
			}
			
			// 과목점수를 만든다.
			int[] score = new int[4];
			for(int j = 0 ; j < 4 ; j++ ) {
				
//				Math m1 = new Math(); // 이렇게 new 시킬려고 하면 아니되옵니다...!
				
				score[j] = (int)(Math.random()*41 + 60);
			}
			stud[i] = new Stud(name, score[0], score[1], score[2], score[3]);
		}
		
		// 꺼내서 확인해보자.
		String msg = stud[0].name.equals(stud[1].name) ? "같은 " : "다른 ";
		JOptionPane.showMessageDialog(null, "두 학생은 " + msg + "학생입니다.\n" + stud[0] + "\n" + stud[1]);
	}

	public static void main(String[] args) {
		new Ex03();
	}

}

class Stud {
	String name;
	int java, oracle, web, jsp, total;
	
	public Stud() {}
	public Stud(String name, int java, int oracle, int web, int jsp) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
		setTotal();
	}
	
	// 총점 계산해주는 함수
	public void setTotal() {
		total = java + oracle + web + jsp;
	}
	
	public String toString() {
		return name + " 학생의 성적 : java - " + java + ", oracle - " + oracle + ", web - " + web + ", jsp - " + jsp + ", total - " + total;
	}
	
	public boolean equals(Object o) {
		return name.equals(((Stud) o).name); // 문자열 비교는 == 로 절대 비교하지 말것.... 반드시 equals() 함수로 처리할 것...
	}
}