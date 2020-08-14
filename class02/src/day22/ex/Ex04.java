package day22.ex;

import java.util.*;
import day22.source.*;

/*
	문제 4 ]
		1.
		학생의 점수를 관리할 클래스(Stud)를
			name, java, db, web, jsp, total
		이라는 변수를 가지는 클래스로 정의하고
		
		학생이름을 키값으로 하고 학생클래스의 객체를 입력해서
		학생의 이름과 총점을 출력하는 프로그램을 작성하세요. 
		
		2. 학생의 이름을 입력하면 
			학생의 정보를 출력해주는 프로그램을 작성하세요.
 */
public class Ex04 {
	HashSet names;
	
	public Ex04() {
		names = new HashSet();
		setNames();
	}
	
	public void setNames() {
		names.add("고길동");
		names.add("둘리");
		names.add("또치");
		names.add("도우너");
		names.add("희동이");
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
