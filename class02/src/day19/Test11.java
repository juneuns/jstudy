package day19;

/*
	Scanner를 이용해서 파일에 저장된 내용을 읽어서 출력하자.
 */

import java.io.*;
import java.util.*;
public class Test11 {

	public Test11() {
		File file = new File("D:\\class\\java\\git\\jstudy\\class02\\src\\day19\\Test06.java");
		
		// 스캐너 변수를 선언하고 null로 초기화해둔다.
		Scanner sc = null;
		try {
			// 파일을 입력해서 스캐너 만들고
			sc = new Scanner(file);
			// 스캐너의 내용을 출력하고
			/*
			String str = sc.nextLine() + "\n";
			str += sc.nextLine() + "\n";
			str += sc.nextLine() + "\n";
			*/
			StringBuffer buff = new StringBuffer();
			while(sc.hasNext()) {
				buff.append(sc.nextLine() + "\n");
			}
			
			// 출력하고
			System.out.println("### Test06.java ###");
			System.out.println(new String(buff));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
