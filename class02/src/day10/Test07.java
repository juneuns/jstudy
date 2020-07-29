package day10;

import java.util.StringTokenizer;

public class Test07 {

	public static void main(String[] args) {
		String str = "10/20/30/40";
		/*
		String tmp = str;
		int idx1 = tmp.indexOf('/');
		
		tmp = tmp.substring(idx1 + 1);
		*/
		
		StringTokenizer token = new StringTokenizer(str, "/");
		
		while(token.hasMoreTokens()) {
			System.out.print(token.nextToken() + "###");
		}
		
	}

}
