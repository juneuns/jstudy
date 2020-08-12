package extra;

/*
 * http://www.increpas.com/member/login.inc?id=euns&pw=12345
 */

import java.util.*;

public class Test03 {

	public Test03() {
		String str = "http://www.increpas.com/member/login.inc?id=euns&pw=12345";
		
		// ? 의 인덱스 구하고
		int idx = str.indexOf('?');
		
		// idx + 1 된 위치부터 꺼내야 된다.
		int idx1 = idx + 1;
		
		// idx1 부터 맨 뒤까지 문자열을 꺼낸다.
		String data = str.substring(idx1);
		
		System.out.println("data : " + data);
		
		// & 를 기준으로 자른다.
		StringTokenizer tk1 = new StringTokenizer(data, "&");
		String s1 = tk1.nextToken();
		String s2 = tk1.nextToken();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		// id=euns 자르기
		StringTokenizer t1 = new StringTokenizer(s1, "=");
		String d1 = t1.nextToken(); // id를 꺼내서 d1에 기억
		String d2 = t1.nextToken(); // euns를 꺼내서 d2에 기억
		
		// pw=12345 자르기
		StringTokenizer t2 = new StringTokenizer(s2, "=");
		String d3 = t2.nextToken(); // pw꺼내서 d3에 기억
		String d4 = t2.nextToken(); // 12345꺼내서 d4에 기억
		
		// 출력
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d4 : " + d4);
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
