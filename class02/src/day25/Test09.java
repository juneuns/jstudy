package day25;

import java.io.*;
/*
	Friend 데이터를 파일(friend01.cls)로 저장해 보자.
	
 */
public class Test09 {

	public Test09() {
		// 타겟 스트림 준비
		FileOutputStream fout = null;
		// 필터스트림 준비
		ObjectOutputStream oout = null;
		
		// 친구 데이터 준비하고
		Friend fr = getFr();
		
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day25/docu/friend01.cls");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 내보내고
			oout.writeObject(fr);
			// 이처럼 클래스 전체를 입출력하는 행위를 직렬화라고 표현한다.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
		
	}
	
	// 내 친구 안지영 반환해주는 함수
	public Friend getFr() {
		Friend fr = new Friend("안지영", 26, 165.0, 'F', "ahnjy@increpas.com", "010-1111-1111");
		return fr;
	}

	public static void main(String[] args) {
		new Test09();
	}

}
