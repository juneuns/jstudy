package day19;

import java.util.*;

public class Test04 {
	String[] keys = new String[5];
	String[] vals = new String[5];

	// ?이후의 데이터를 잘라내서 
	// mode=LSD 의 경우는 mode는 키값 배열에 
	// LSD는 벨류 배열에 채워주세요.
	public Test04() {
		String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=023&aid=0003553008";
		String tmp = url.substring(url.indexOf('?') + 1) + "&";
		
		/*
			문자열 조작 함수
				
				substring(시작위치, 종료위치)
				charAt(인덱스) 
				indexOf(문자 또는 문자열)
		 */
		
		StringTokenizer token1 = new StringTokenizer(url, "?");
		
		String data = "";
		int cnt = token1.countTokens();
		for(int i = 0 ; i < cnt ; i++ ) {
			if(i == 0) {
				token1.nextToken();
				continue;
			}
			data = token1.nextToken();
		}
//		System.out.println(data);
		
		// & 를 기준으로 자른다.
		StringTokenizer token2 = new StringTokenizer(data, "&");
		int j = 0 ;
		while(token2.hasMoreTokens()) {
			StringTokenizer token3 = new StringTokenizer(token2.nextToken(), "=");
			keys[j] = token3.nextToken();
			vals[j++] = token3.nextToken();
		}
		
		/*
		System.out.println("count : " + token1.countTokens());
		token1.nextToken();
		
		StringTokenizer token2 = new StringTokenizer(token1.nextToken(), "&");
		*/
		
		// 출력하기
		for(int i = 0 ; i < keys.length ; i++ ) {
			System.out.printf("%-10s - %-10s\n", keys[i], vals[i]);
		}
	}
	
	public void abc(String tmp) {
		/*
		for(int i = 0 ; i < keys.length ; i++ ) {
			keys[i] = tmp.substring(0, tmp.indexOf('='));
			vals[i] = tmp.substring(tmp.indexOf('=') + 1 , tmp.indexOf('&'));
			if( i != keys.length - 1) {
				tmp = tmp.substring(tmp.indexOf('&') + 1);
			}
		}
		 */
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
