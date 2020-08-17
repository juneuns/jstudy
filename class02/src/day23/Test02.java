package day23;

import java.io.*;
import java.util.*;

/*
	Properties로 Map 데이터를 사용하다가 
	파일로 저장하도록 하자.
 */
public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		prop.put("name", "iu");
		prop.put("age", "28");
		prop.put("tel", "010-1616-2727");
		prop.put("addr", "seoul");
		/*
			Properties는 맵의 일종이므로
			맵처럼 작업해서 사용하면 된다.
			
			이것을 보관할 필요가 생기면....
		 */
		FileOutputStream fout = null;
		try {
			// 파일에 연결하고
			fout = new FileOutputStream("src/day23/iu.iu");
			// 작업내용을 파일로 보낸다.
			prop.store(fout, "iu Information");
			// 위 명령이 실행되면 파일에 내용이 기록된다.
			// 믿어주세요...!
			System.out.println("### 파일 저장 완료 ###");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("*** 파일 저장 실패 ***");
		}
		
		// 읽어보자.
		Properties prop1 = new Properties();
		// 파일 읽을 준비
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day23/iu.iu");
			// 읽은 내용 Properties에 저장...
			prop1.load(fin);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("### 읽은 파일 내용 출력하기");
		Set set = prop1.keySet();
		for(Object o: set) {
			System.out.println(o + " - " + prop1.get(o));
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}








