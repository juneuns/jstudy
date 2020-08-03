package day12;

/*
	문제 2 ]
		1.
			java, oracle, html, jsp, total 점수를 기억할 클래스를 만들고
			학생 한명의 데이터를 입력해서 출력하세요.
			
			조건 ]
			점수는 70 ~ 95 사이로 한다.
			출력함수도 만드는 것으로 한다.
		
		2. 
			생성자 함수를 오버로딩해서
			4 과목 점수를 입력해서 객체가 만들어지게 하세요.
			출력...
		
		3. 
			3명 데이터를 관리할 배열을 만들어서 
			입력하고
			출력하세요.
			
 */
public class Ex02 {
	
	public Ex02() {
//		setOne();
		setThree();
//		setThree(5);
	}
	public static void main(String[] args) {
		new Ex02();
	}
	
	// 한명의 데이터 만들고 출력하기
	public void setOne() {
		int java = (int)(Math.random()*26 + 70);
		int oracle = (int)(Math.random()*26 + 70);
		int html = (int)(Math.random()*26 + 70);
		int jsp = (int)(Math.random()*26 + 70);
		
		// 한명 성적데이터 만들고
		Stud student = new Stud(java, oracle, html, jsp);
		
		System.out.println(student);
	}
	
	public Stud[] setOne(Stud[] stud, int idx) {
		int java = (int)(Math.random()*26 + 70);
		int oracle = (int)(Math.random()*26 + 70);
		int html = (int)(Math.random()*26 + 70);
		int jsp = (int)(Math.random()*26 + 70);
		
		// 한명 성적데이터 만들고
		Stud student = new Stud(java, oracle, html, jsp);
		
		stud[idx] = student;
		
		return stud;
	}
	
	// 3명의 데이터를 만들고 출력해보자.
	public void setThree() {
		// 세명의 점수가 필요하므로 배열로 만들어 처리한다.
		Stud[] students = new Stud[3]; // 방만 세개 만들어 뒀다.
		
		for(int i = 0 ; i < students.length ; i++ ) {
			
			int java = (int)(Math.random()*26 + 70);
			int oracle = (int)(Math.random()*26 + 70);
			int html = (int)(Math.random()*26 + 70);
			int jsp = (int)(Math.random()*26 + 70);
			
			// 한명 성적데이터 만들고
			Stud student = new Stud(java, oracle, html, jsp);
			students[i] = student;
		}
		
		// 출력한다.
		for(Stud st : students) {
			System.out.println(st);
		}
	}
	
	public void setThree(int idx) {
		// 세명의 점수가 필요하므로 배열로 만들어 처리한다.
		Stud[] students = new Stud[idx]; // 방만 세개 만들어 뒀다.
		
		for(int i = 0 ; i < students.length ; i++ ) {
			students = setOne(students, i);
		}
		
		// 출력한다.
		for(Stud st : students) {
			System.out.println(st);
		}
		
	}
}
