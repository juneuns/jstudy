package extra;

import java.util.*;
public class Test02 {

	public Test02() {
		String str = "a#b@c!d#";
		
		StringTokenizer token = new StringTokenizer(str, "#@!");
		Vector v = new Vector();
		while(token.hasMoreTokens()) {
			String sch = token.nextToken();
			v.add(sch);
		}
		// 함수(데이터)
		System.out.println(v.get(v.size() - 1));
		/*
			int cnt = v.size() - 1;
			v.get(cnt);
		 */
		for(int i = 0 ; i < v.size(); i++) {
			System.out.println(v.get(i) + " ####### ");
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
