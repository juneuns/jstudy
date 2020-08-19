package day25;

import java.io.*;

/*
	문자기반 스트림을 사용해서
		day25/docu/fileTest01.txt
	파일을 복사해서
		day25/docu/fileTest02.doc
	파일을 만드세요.
 */

public class Test07 {

	public Test07() {
		// 입력타겟스트림 준비
		FileReader fr = null;
		// 입력 필터스트림 준비
		BufferedReader br = null;
		// 출력 타겟스트림 준비
		FileWriter fw = null;
		// 출력 필터스트림 준비
		BufferedWriter bw = null;
		try {
			// 입력 스트림 만들고
			fr = new FileReader("src/day25/docu/fileTest01.txt");
			br = new BufferedReader(fr);
			
			// 출력 스트림 만들고
			fw = new FileWriter("src/day25/docu/fileTest02.txt");
			bw = new BufferedWriter(fw);
			
			while(true) {
				String line = br.readLine();
				if(line == null ) break;
				bw.write(line + "\r\n");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
