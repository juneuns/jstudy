package day20;

/*
	세사람의 시험 결과를 출력하세요.
	형식은
		
		전은석 - java : 100, oracle : 95, web : 75, JSP : 95, Total : 365
		
	의 형태로 출력되게 하세요.
	점수는 랜덤하게 만들어도 됩니다.
	
 */

import java.text.*;

public class Ex02 {

	public Ex02() {
		String[] name = {"윤요셉", "유병욱", "오혜찬"};
		Score[] score = new Score[3];
		for(int i = 0 ; i < score.length ; i++ ) {
			score[i] = new Score(name[i]);
		}
		
		// 출력하기
		for(Score s : score) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

class Score {
	String name;
	int java, oracle, web, jsp, total;
	
	public Score(){}
	public Score(String name){
		int[] num = new int[4];
		for(int i = 0 ; i < num.length ; i++ ) {
			num[i] = (int)(Math.random()*41 + 60);
		}
		this.name = name;
		java = num[0];
		oracle = num[1];
		web = num[2];
		jsp = num[3];
		setTotal();
	}
	public Score(String name, int java, int oracle, int web, int jsp){
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
		setTotal();
	}
	
	// 총점 셋팅해주는 함수
	public void setTotal() {
		total = java + oracle + web + jsp;
	}
	
	public String toString() {
		MessageFormat form = new MessageFormat("{0} - java : {1}, oracle : {2}, web : {3}, jsp : {4}, total : {5}");
		Object[] obj = {name, java, oracle, web, jsp, total};
		String result = form.format(obj);
		return result;
	}
}