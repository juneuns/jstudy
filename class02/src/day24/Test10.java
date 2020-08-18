package day24;

/*
	"src/day24/wTest/doutTest.txt"
	의 파일을 읽어보자.
	DataOutputStream을 사용해서 저장했으니
	반드시 읽을 때도 DataInputStream을 사용해서 읽어야 하고
	저장한 순서와 같게 읽는 순서도 결정이 된다.
 */

import java.io.*;

import javax.swing.JOptionPane;
public class Test10 {

	public Test10() {
		// 타겟스트림 준비
		FileInputStream fin = null;
		// 필터스트림 준비
		DataInputStream din = null;
		
		try {
			// 스트림 만들고
			fin = new FileInputStream("src/day24/wTest/doutTest.txt");
			din = new DataInputStream(fin);
			
			// 저장할 때 이름, 나이, 신장, 성별, 전화, 메일 순으로 저장했으니
			// 꺼낼 때도 같은 순서로 꺼내야 한다.
			String name = din.readUTF();
			int age = din.readInt();
			double kee = din.readDouble();
			char sungbyul = din.readChar();
			String hp = din.readUTF();
			String email = din.readUTF();
			
			// 출력한다.
			String msg = String.format("이름 : %-8s\n나이 : %2d\n키     : %5.2f\n성별 : %c\n전화 : %-13s\n메일 : %-35s", 
										name, age, kee, sungbyul, hp, email);
			System.out.printf("이름 : %-8s, \n나이 : %2d, \n키 : %5.2f, \n성별 : %c, \n전화 : %-13s, \n메일 : %-35s", 
								name, age, kee, sungbyul, hp, email);
			JOptionPane.showMessageDialog(null, msg);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
