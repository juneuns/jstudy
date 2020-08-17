package day23.ex;

import day23.*; // iu.iu 파일은 패키지가 다르기 때문에....

import java.io.*;
import java.util.*;
import javax.swing.*;

/*
 	문제 1 ]
 		Test02 에서 만든 iu.iu 파일의 내용을 읽어서 출력하세요.
 		단, Map.Entry 타입으로 반환받아서 처리하세요.
 		
 		참고 ]
 			Map.Entry
 			는 키와 벨류를 변수를 만들어서 저장해놓은 일종의 VO 클래스이다.
 */

public class Ex01 {

	public Ex01() {
		// Properties 준비한다.
		Properties prop = new Properties();
		// 파일 읽어온다.
		FileInputStream fin = null;
		String msg = ""; // 읽은 데이터 저장할 변수
		try {
			fin = new FileInputStream("src/day23/iu.iu");
			// 읽은 데이터 Properties에 기억시키고
			prop.load(fin);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// Properties 도 Map의 일종이므로 키와 벨류를 Map.Entry가 담겨있는 Set으로 뽑아낼 수 있다.
		Set set = prop.entrySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Map.Entry ent = (Map.Entry) itor.next();
			// 이제 데이터는 ent에 저장이 되어있으니 변수의내용만 꺼내서 출력하면 된다.
			msg = msg + ent.getKey() + " : " + ent.getValue() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "<html><h2 style='color: orange'>*** IU Information ***</h2></html>\n\n" + msg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
