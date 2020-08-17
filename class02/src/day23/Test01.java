package day23;

import java.util.*;
import java.io.*;

/*
	Sample.txt를 읽어서 Map으로 저장해보자.
 */

public class Test01 {

	public Test01() {
		Properties prop = new Properties();
		/*
			외부 파일과 연결할 예정이다.
			이 작업은 이후 이어지는 IO에서 공부할 때 깊게 알아보도록 한다.
		 */
		FileInputStream fin = null;
		try {
//			fin = new FileInputStream("D:\\class\\java\\git\\jstudy\\class02\\src\\day23\\sample.txt"); //  한글 인코딩 처리를 하지 않으면 문자가 깨져서 들어온다.
//			fin = new FileInputStream("D:\\class\\java\\git\\jstudy\\class02\\src\\day23\\sample_ko.txt");
			fin = new FileInputStream("src/day23/tel.txt");
			/*
				경로는
				절대경로를 이용해서 
					D:\class\java\git\jstudy\class02\src\day23\sample.txt
				로 사용해도 된다.
				이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
				src부터 시작하는 경로를 사용하면 된다.
			 */
			
			// 이제 파일의 내용을 Properties에 옮긴다.
			prop.load(fin);
			// 파일의 내용을 이릭어서 Map으로 처리해 놓았다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이제부터는 HashMap에 데이터가 저장된 것처럼 사용하면 된다.
		
//		String name = (String) prop.get("name");
		
		/*
		String name = (String) prop.get("hong");
		System.out.println("저장된 이름 : " + name);
		*/
		
		// 키값만 모두 뽑아본다.
		Set set = prop.keySet();
		
		// 키값만 출력
		for(Object o : set) {
			System.out.print(o + " | ");
		}
		System.out.println();
		
		for(Object o : set ) {
			System.out.println(o + " - " + prop.get(o));
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
