package day24;

import java.io.*;

/*
	1. D:\\fileTest
		폴더를 강제로 만들자.
		
	2. D:\day24\fileTest 
		폴더를 강제로 만든다.
		
	3. 만들어진 파일중 하나를 삭제한다.
		(delete() - 파일과 폴더 모두 삭제가 가능)
 */
public class Test01 {

	public Test01() {
		// 만들고 싶은 폴더를 파일로 만든다.
		/*
		//1.
		// 1-1. 파일을 만든다.
		File file = new File("d:\\fileTest");
		// 1-2. 만들어진 파일을 이용해서 폴더를 만든다.
		file.mkdir();
		*/
		
		/*
		// 2. 계층 폴더 만들기
		File file = new File("D:\\day24\\fileTest");
//		file.mkdir(); // day24 폴더가 존재하지않으므로 못만든다.
		file.mkdirs();
		*/
		
		/*
		// 3. 폴더 삭제
		//  - 삭제할 파일을 File로 만든다.(존재해야 지울 수 있다.)
		File file = new File("d:\\fileTest");
		file.delete();
		
		File file = new File("d:\\day24");
		file.delete(); // 폴더내에 폴더가 존재하므로 지울 수 없다.
		 */
		
		// 4. 특정 파일의 이름을 다른 이름으로 변경하자.
		//		D:\day24\fileTest  ==> D:\day24\fTest 
		
		// 		4-1 파일을 만들고
		File oldF = new File("D:\\day24\\fileTest");
		File newF = new File("D:\\day24\\fTest");
		// 		4-2 바꾼다.(renameTo())
		oldF.renameTo(newF);
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
