package day24;

/*
	"D:\\class\\java\\git\\jstudy\\class02\\src\\day24\\wTest\\FileText.txt"
	의 내용을 읽어보자.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class Test06 {

	public Test06() {
		// 파일 연결 스트림을 준비한다.
		// 이번에는 파일에서 프로그램으로 데이터가 이동하는 방향이므로 InputStream을 준비해야 한다.
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24/Test01.java");
//			fin = new FileInputStream("D:\\class\\java\\git\\jstudy\\class02\\src\\day24\\wTest\\FileText.txt");
			
			/*
			// 1. 한글자만 읽어보자.
			int ch = fin.read();
			System.out.println("한글자 : " + (char)ch);
			*/
			
			/*
			// 2. 여러글자를 읽어보자.
			// byte 배열 준비하고
			byte[] buff = new byte[1024];
			// 배열을 입력해서 읽는다.
			int len = fin.read(buff);
			// 문자열로 만들고
			String str = new String(buff, 0, len);
			// 출력하고
//			System.out.println("읽어온 내용 : " + str);
			 */
			
			// 3. 파일의 전체 내용을 읽어보자.
			// 파일의 내용은 몇번을 읽어야 할지 알 수 없으므로 반복문으로 처리한다.
			// byte[] 준비하고
			ArrayList<byte[]> list = new ArrayList<byte[]>();
			byte[] buff = new byte[1023];
			int i = 0 ;
			while(true) {
//				System.out.print(i++);
				// 배열 내용 초기화
				Arrays.fill(buff, (byte)0);
				// 스트림의 내용 읽는다.
				int len = fin.read(buff);
				// 반환값은 읽은 데이터의 수 이다.
				if(len == -1) {
					// 이 경우는 읽은 데이터의 갯수가 없는 경우이다.
					// 이 경우는 다 읽은 경우이므로 반복문을 종료시킨다.
					break;
				}
				byte[] tmp = new byte[len];
				System.arraycopy(buff, 0, tmp, 0, len);
				list.add(tmp);
//				String str = new String(buff, 0, len);
//				System.out.print(str);
			}
			int len = 0 ;
			for(byte[] b : list) {
				len += b.length;
			}
			byte[] b = new byte[len];
			for(int j = 0 ; j < list.size() ; j++) {
				byte[] tmp = list.get(j);
				System.arraycopy(tmp, 0, b, (j == 0)? 0:list.get(j-1).length, tmp.length);
			}
			
			String str = new String(b);
			System.out.print(str);
//			JOptionPane.showMessageDialog(null, str);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
