package day23;


import java.util.*;

public class Test05 {

	public Test05() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("윤요셉");
		names.add("유병욱");
		names.add("오혜찬");
		
		names.add("이지우");
		names.add("장성환");
		names.add("장수진");
		
		names.add("정현욱");
		names.add("김주현");
		names.add("박진우");
		
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		for(int i = 0 ; i < 3; i++ ) {
			ArrayList<String> n = new ArrayList<String>();
			for(int j = 0 ;j < 3; j++ ) {
				int no = 3 * i + j;
				n.add(names.get(no));
			}
			list.add(n);			
		}
		
		System.out.println("list.size() : " + list.size());
		
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println("#### " + (i + 1) + " 팀 ###");
			ArrayList<String> l = list.get(i);
			for(int j = 0 ; j < l.size(); j++ ) {
				String str = l.get(j);
				System.out.println(str);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
