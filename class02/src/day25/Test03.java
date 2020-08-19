package day25;

import java.io.*;

/*
	문자단위로 파일에 데이터를 저장하는 프로그램을 작성해보자.
 */
public class Test03 {

	public Test03() {
		FileWriter fw = null;
		try {
			// 스트림 만들고
			fw = new FileWriter("src/day25/docu/fileTest01.txt");
			
			/*
			// 1. 한글자(2바이트)만 저장해보자.
			char ch = '안';
			fw.write(ch);
			*/
			
			/*
			// 2. 여러글자를 저장해보자.
			String str = "사춘기때 되게 순수하고 솔직하고 이렇잖아요. 그런 걸 좀 음악에 담고 싶어서 사춘기라고 지었고, 볼빨간은 저희 수식어에요. 귀여운 그런 느낌...";
			char[] chArr = str.toCharArray();
			fw.write(chArr);
			*/
			
			// 3. 문자열을 저장해보자.
			String str = "볼빨간사춘기는 여러 가지 면에서 한국 대중음악계에 새로운 바람을 몰고 온 존재라고 할 수 있다.";
			fw.write(str);
			/*
				char 단위는 텍스트 데이터만 처리하도록 되어있기 때문에
				기본함수에  + 문자 처리기능 이 추가되어있다.
			 */
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
