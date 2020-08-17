package day23.ex;

/*
	day23.source.Student 데이터를 입력하는 맵의 문제 07을
	TreeMap을 사용해서 처리하세요.
	
	1. 키값을 학생번호를 하는 방법
	2. 키값을 학생이름으로 하는 방법
	
	extra ]
		내림차순 정렬...
	
 */
import day23.*;
import day23.source.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Ex02 {
	ArrayList<Integer> noList;
	ArrayList<String> names;
	TreeMap<Integer, Student> map1;
	TreeMap<String, Student> map2;
	
	int[] score;
	
	public Ex02() {
		IdolList sList = new IdolList();
		noList = sList.setNoList();
		names = sList.setNames();
		
		map1 = new TreeMap<Integer, Student>();
		for(int i = 0 ; i < noList.size(); i++ ) {
			map1.put(noList.get(i), new Student(noList.get(i), names.get(i), sList.setScore()));
		}
		
		map2 = new TreeMap<String, Student>();
		for(int i = 0 ; i < names.size() ; i++ ) {
			map2.put(names.get(i), new Student(noList.get(i), names.get(i), sList.setScore()));
		}
		
		for(;;) {
			String sno = JOptionPane.showInputDialog("키값이 번호인 자료 출력은 1번\n키값이 이름인 자료 출력은 2번\n종료는 q 를 입력하세요!");
			if(sno.equals("q")) {
				int qno = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "종료 확인", 
															JOptionPane.YES_NO_OPTION);
				if(qno == 0) {
					break;					
				} else {
					continue;
				}
			} else if(sno.equals("1")) {
				getMap1();
			} else if(sno.equals("2")) {
				getMap2();
			}
		}
		
	}
	
	public void getMap1() {
		// 출력하기
		Set<Integer> set = map1.keySet();
		String msg = "";
		Iterator<Integer> itor = set.iterator();
		while(itor.hasNext()) {
			// 키값 꺼내고
			int no = itor.next();
			
			// 학생객체 데이터 꺼내고
			Student stud = map1.get(no);
			
			// 변수데이터 꺼내고
			String name = stud.getName();
			int java = stud.getJava();
			int db = stud.getDb();
			int web = stud.getWeb();
			int jsp = stud.getJsp();
			int total = stud.getTotal();
			
			msg = msg + String.format("%-5d 번 학생 \n이름 : %-6s, java : %-3d, db : %-3d, web : %3d, jsp : %3d, Total : %4d\n", 
										no,name,java, db, web, jsp, total);
			
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void getMap2() {
		// 출력하기
		Set<String> set = map2.keySet();
		String msg = "";
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			// 키값 꺼내고
			String name = itor.next();
			// 학생객체 데이터 꺼내고
			Student stud = map2.get(name);
			
			// 변수데이터 꺼내고
			int no = stud.getNo();
			int java = stud.getJava();
			int db = stud.getDb();
			int web = stud.getWeb();
			int jsp = stud.getJsp();
			int total = stud.getTotal();
			
			msg = msg + String.format("이름 : %-6s\n번호 : %-5d 번, java : %-3d, db : %-3d, web : %3d, jsp : %3d, Total : %4d\n", 
											name, no, java, db, web, jsp, total);
			
		}
		JOptionPane.showMessageDialog(null, msg);
	}
	

	public static void main(String[] args) {
		new Ex02();
	}

}
