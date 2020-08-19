package day25;

import java.io.*;

/*
	friend01.cls 파일을 읽어보자.
	
	주의 사항 ]
		ObjectOutputStream 으로 내보낸 데이터는 반드시
		ObjectInputStream 으로 읽어야 한다.
		그리고 
		송수신 측 모두 똑같은 클래스를 가지고 있어야 한다.
 */
public class Test10 {

	public Test10() {
		// 타겟스트림 준비
		FileInputStream fin = null;
		// 보조 스트림 준비
		ObjectInputStream oin = null;
		try {
			// 스트림 만들고
			fin = new FileInputStream("src/day25/docu/friend01.cls");
			oin = new ObjectInputStream(fin);
			// 데이터 만들고
			Friend fr = (Friend)oin.readObject();
			// 출력하고
			System.out.println(fr);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
