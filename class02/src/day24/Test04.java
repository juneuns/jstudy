package day24;

import java.io.*;
import java.util.*;
public class Test04 {
/*
	키보드 역시 외부 장치이다.
	자주 사용하는 외부 장치이기 때문에
	이미 스트림을 준비한 변수가 존재 한다.
	
		System.in
	
 */
	public Test04() {
		System.out.print("한글자를 입력하세요!");
		int ch = 0 ;
		try {
			/*
			// 1. 
			ch = System.in.read();
			// 출력
			System.out.println("입력한 문자 1 : " + ((char) ch));
//			System.out.println("입력한 문자 2 : " + ch);
			 */
			
			/*
			// 2. 여러문자를 입력받아서 출력해보자.
			// 읽은 결과를 기억할 변수를 준비한다.
			byte[] buff = new byte[256];
			// 256의 숫자에 따라서 한번에 읽은 데이터 양이 정해진다.
			int len = System.in.read(buff); // len - 읽은 데이터 갯수
			String str = new String(buff, 0, len);
			System.out.println("입력한 문장 : " + str);
			*/
			
			// 3. 여러문자를 입력받아서 출력(주로 네트워크 처리를 할 때 많이 사용하는 방법)
			byte[] buff = new byte[256];
			Arrays.fill(buff, (byte)'A');
			int len = System.in.read(buff, 10, 100);
			/*
				준비된 배열 buff에 11번째 부터 읽은 내용을 기억하세요.
				최대 100개를 읽으세요.(100글자만 입력받겠다...)
			 */
			String str = new String(buff, 0, len + 10);
			System.out.println("입력한 문장 : " + str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
