package day21;
/*
		Vector 를 만들고
			이름, 자바, 디비, 웹, jsp, 총점을 저장할 클래스를 만들고 벡터에 넣어서 
		5명을 출력하세요.
		
		할일 ]
			1. 클래스를 정의 한다.
			
			2. 벡터 만들어서 벡터안에 클래스의 인스턴스를 5개 넣어준다.
 */

import java.util.*;
public class Test01 {

	public Test01() {
		// 벡터 변수를 만들고 함수를 호출해서 반환값을 기억한다.
		Vector scoreList = getVector();
		
		// 출력한다.
		// 출력에 필요한 문자열을 Stud(VO클래스)에 이미 만들어 놨으므로 꺼내서 사용하면 된다.
		for(int i = 0 ; i < scoreList.size() ; i++ ) { // 데이터가 채워져있는 만큼 반복한다.
			Stud st = (Stud) scoreList.get(i);
			/*
				벡터에는 Stud 데이터가 다섯개 채워져있고
				채워질때 Object 타입으로 자동 형변환이 되서 채워졌으므로
				꺼내면 Object 타입일 것이고
				이것을 원형태 Stud 타입으로 강제 형변환이 필요하다.
				강제형변환 한 것을 변수에 기억시켜서 사용하면 된다.
			 */
			
			//  출력한다.
			System.out.println(st);
		}
	}
	
	// 다섯명의 이름을 입력해서 벡터로 반환해주는 함수
	public Vector getVector() {
		// 다섯명의 데이터가 필요하므로 다섯명의 이름을 기억하는 벡터를 만들자.
		Vector name = new Vector(); 
		name.add("둘리");
		name.add("고길동");
		name.add("도우너");
		name.add("또치");
		name.add("마이콜");
		
		// Stud 클래스를 다섯개를 담을 벡터를 만든다.
		Vector stud = new Vector();
		
		// 각 방에 Stud 클래스를 만들어서 넣어야 한다. 따라서 반복문을 사용한다.
		for(int i = 0 ; i < name.size() ; i++ ) {
			// VO를 new 시키고
			Stud s = new Stud(); // 이 상태는 아직 변수에 데이터가 채워져 있지 않은 상태...
			
			// 데이터 채워주고
			s.setName((String)name.get(i));
			
			// 점수를 채워준다. 
			// 이 경우는 VO를 입력하고 호출하면 
			// 자동으로 점수를 랜덤하게 만들어서 입력해주는 기능의 
			// 함수를 만들어서 처리하자.
			setVO(s);
			
			// 이제 Stud 클래스의 변수에 데이터가 모두 채워졌으니
			// 벡터에 넣어주면 된다.
			stud.add(s);
		}
		
		return stud;
	}
	
	// Stud 타입의 데이터를 입력받으면 점수를 채워주는 함수
	public void setVO(Stud vo) {
		// 전달 받은 vo는 이름만 채워진 Stud 클래스이다.
		// 이제 점수를 랜덤하게 만들어서 채워주면 된다. 
		// 점수는 4개가 필요하고 총점은 그 4개를 합쳐주면 된다.
		Vector score = new Vector();
		for(int i = 0 ; i < 4 ; i++ ) {
			int no = (int)(Math.random()*41 + 60);
			score.add(no);
		}
		vo.setJava((int)score.get(0));
		vo.setDb((int)score.get(1));
		vo.setWeb((int)score.get(2));
		vo.setJsp((int)score.get(3));
		// 총점 채워주고
		vo.setTotal();
	}

	public static void main(String[] args) {
		new Test01();
	}

}

// 학생 점수를 기억할 클래스를 정의한다.
class Stud {
	private String name;
	private int java, db, web, jsp, total;
	/*
		이 클래스는 단순히 학생의 이름과 점수를 저장만하고 있다.
		이 형태의 클래스를 VO(Value Object)클래스 라고 말하고
		이런 클래스들은 주로 데이터를 전달할 목적으로 사용되어진다.
		따라서 DTO(Data Transfer Object)라고 부르기도 한다.
		
		장점 ]
			1. 여러타입의 데이터를 한번에 전달 할 수 있다.
			2. 데이터를 꺼낼때 형변환을 해서 사용하지 않아도 된다.
		
	 */
	public String getName() {
		return name;
	}
	/*
	public void setName(Object o) {
		this.name = (String) o;
		// 이렇게 해도 처리는 되지만 이름에 다른 타입의 데이터가 입력될 수도 있으므로 이 방법은 피하는 것이 좋겠다.
	}
	*/
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = java + db + web + jsp;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Stud : name=" + name + ", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp + ", total="
				+ total ;
	}
}
