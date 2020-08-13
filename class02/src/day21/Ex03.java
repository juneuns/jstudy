package day21;

/*
	학생의 시험 점수를 관리할 클래스를 정의해서
		이름, java, db, web, jsp, total 을 입력해서
		데이터를 완성해서
	ArrayList에 5명의 데이터를 추가하고
	출력하고
	
	총점을 기준으로 정렬하고 
	출력하고
	
	자바 점수를 기준으로 정렬하고
	출력하고
	
 */
import java.util.*;

import javax.swing.JOptionPane;
public class Ex03 {
	ArrayList sort = new ArrayList();
	ArrayList stud = new ArrayList();
	ArrayList list = new ArrayList();

	public Ex03() {
		list.add("둘리");
		list.add("고길동");
		list.add("도우너");
		list.add("또치");
		list.add("희동이");
		
		// 학생 리스트 완성
		for(int i = 0 ; i < 5 ; i++ ) {
			stud.add(getStud((String)list.get(i)));
		}
		
		// 정렬리스트 만들기
		setSortList();
		
		while(true) {
			String str = JOptionPane.showInputDialog("정렬기준을 입력하세요!\n종료는 q 를 입력하세요!");
			str = str.toLowerCase();
			if(str.equals("q")) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			}
			Comparator c = getComp(str);
			Collections.sort(stud, c);
			// 출력
			String msg = "";
			for(int i = 0 ; i < stud.size() ; i++ ) {
				String t = "\n";
				if(i == stud.size() -1) {
					t = "";
				}
				msg = msg + stud.get(i) + t;
			}
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}
	
	// 정렬 방식 반환해주는 함수
	public Comparator getComp(String sub) {
		Comparator c = null;
		
		switch(sub) {
		case "name":
			c = (Comparator)sort.get(0);
			break;
		case "total":
			c = (Comparator)sort.get(1);
			break;
		case "java":
			c = (Comparator)sort.get(2);
			break;
		case "db":
			c = (Comparator)sort.get(3);
			break;
		case "web":
			c = (Comparator)sort.get(4);
			break;
		case "jsp":
			c = (Comparator)sort.get(5);
			break;
		}
		
		return c;
	}
	
	public void setSortList() {
		sort.add(new Comparator() { // 이름으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getName().compareTo(((Stud)o2).getName());
			}
		});
		sort.add(new Comparator() { // 총점으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getTotal() - (((Stud)o2).getTotal());
			}
		});
		sort.add(new Comparator() { // 자바성적으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getJava() - (((Stud)o2).getJava());
			}
		});
		sort.add(new Comparator() { // 디비성적으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getDb() - (((Stud)o2).getDb());
			}
		});
		sort.add(new Comparator() { // 웹 성적으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getWeb() - (((Stud)o2).getWeb());
			}
		});
		sort.add(new Comparator() { // JSP 성적으로 정렬
			@Override
			public int compare(Object o1, Object o2) {
				return ((Stud)o1).getJsp() - (((Stud)o2).getJsp());
			}
		});
	}
	
	public Stud getStud(String name) {
		Stud s = new Stud();
		s.setName(name);
		ArrayList score = new ArrayList();
		for(int i = 0 ; i < 4 ; i++ ) {
			score.add((int)(Math.random()*41 + 60));
		}
		s.setJava((int)score.get(0));
		s.setDb((int)score.get(1));
		s.setWeb((int)score.get(2));
		s.setJsp((int)score.get(3));
		s.setTotal();
		return s;
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
