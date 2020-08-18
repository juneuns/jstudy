package day24;

import java.io.*;
import java.util.Arrays;

import javax.swing.JOptionPane;

/*
	doc/안지영02.jpg 파일을 복사해본다.
 */
public class Test07 {

	public Test07() {
		/*
		 	할일 ]
		 		스트림은 단방향이다.
		 		그런데 복사라는 개념은 한곳에서 읽어서
		 		다른곳에 쓰면 된다.
		 		따라서 스트림이 두개가 필요하다.
		 */
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			// 스트림 두개를 만든다.
			fin = new FileInputStream("doc/안지영02.jpg");
			fout = new FileOutputStream("doc/anjiyoung2.jpg");
			// 한 곳에서 읽어서 그대로 다른곳에 쓰면 된다.
			// 그런데 몇번이 반복되어야 할지 알 수 없으므로 반복으로 처리한다.
			
			byte[] buff = new byte[1024];
			while(true) {
				// 배열 초기화
//				Arrays.fill(buff, (byte)0);
				// 읽는다.
				int len = fin.read(buff);
				/*
				if(len != 1024) {
					String msg = new String(buff, len, 1024 - len);
					JOptionPane.showMessageDialog(null, msg);
				}
				*/
				if(len == -1) {
					// 읽은 데이터가 없는 경우이므로 종료시킨다.
					break;
				}
				
				// 읽은 내용을 쓰면 된다.
				fout.write(buff, 0, len);
			}
			JOptionPane.showMessageDialog(null, "★★★ 파일 복사가 완료되었습니다. ★★★");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
