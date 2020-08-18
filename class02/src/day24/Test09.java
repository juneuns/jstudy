package day24;

/*
	파일에 친구의 정보를 저장해 보자.
	친구의 정보는
		이름 		String
		나이		int
		신장		double
		성별		char
		전화번호	String
		메일주소	String
 */

import java.io.*;

import javax.swing.JOptionPane;

public class Test09 {

	public Test09() {
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		try {
			// 스트림 만들고
			fout = new FileOutputStream("src/day24/wTest/doutTest.txt");
			dout = new DataOutputStream(fout);
			
			// 데이터 만들고
			String name = "안지영";
			int age = 26;
			double height = 165.0;
			char gen = 'F';
			String tel = "010-1111-1111";
			String mail = "jiyoung@increpas.com";
			
			/*
				DataOutputStream의 특징은
				Java의 데이터를 변환없이 사용할 수 있다. 
			 */
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			JOptionPane.showMessageDialog(null, "친구 추가 완료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
