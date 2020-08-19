package day25;

import java.io.*;

import javax.swing.JOptionPane;

/*
	fileTest01.txt 파일을
	문자단위 스트림을 사용해서 읽어보자.
 */
public class Test04 {

	public Test04() {
		// 타겟 스트림 준비하고
		FileReader fr = null;
		try{
			// 스트림 만들고...
			fr = new FileReader("src/day25/docu/fileTest01.txt");
			
			/*
			// 1. 한글자만 읽어보자.
			int ch = fr.read();
			// 출력한다.
			System.out.println("한글자 읽은 것 : " + (char)ch);
			*/
			
			// 2. 여러글자를 읽어보자.
			char[] buff = new char[1024];
			int len = fr.read(buff);
			/*
				len - 읽은 문자 갯수를 기억할 변수
				
				int read(char[] ch) - 문자배열에 읽은 문자들을 채워주고, 읽은 문자의 갯수를 반환해준다.
			 */
			// 데이터를 읽었으니 문자배열을 이용해서 문자열을 만들면 된다.
			String str = new String(buff, 0, len);
			// 출력
			JOptionPane.showMessageDialog(null, str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
