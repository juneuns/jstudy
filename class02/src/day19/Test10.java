package day19;

/*
	 특정 문자열을 입력한 후
	 그 문자열 중에서 원하는 규칙에 맞는 부분만 골라서
	 출력해보자.
 */

import java.util.regex.*;
public class Test10 {

	public Test10() {
		String tel = "[Tel] : 010-3175-9042";
		// 이 문자열에서 전화번호 부분만 꺼내고 싶다.
		// 방법
		// 		정규식 검사를 진행한다.
		Pattern pat = Pattern.compile("0\\d{1,2}-\\d{3,4}-\\d{4}");
		Matcher mat = pat.matcher(tel);
		// 여기까지는 정규식검사 순서와 일치한다.
		// 여기서 find()를 이용해서 규칙에 맞는 부분이 있는지 확인하고
		if(mat.find()) {
			// 규칙에 맞는 부분이 존재하면 꺼내면 된다.
			String stel = mat.group();
			System.out.println("전화번호 : " + stel);
		}
	
	}

	public static void main(String[] args) {
		new Test10();
	}

}
