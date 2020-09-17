package day26;

/*
	JDBC를 사용해서 회원을 추가해보자.
	
	질의명령 ]
	INSERT INTO
	    member01(mno, id, name, mail, tel, gen, avt)
	VALUES(
	    (
	    	SELECT
	    		NVL(MAX(mno) + 1, 1000)
	    	FROM
	    		member01
	    ), 
	    'euns', '전은석', 'euns@increpas.com',
	    '010-3175-9042', 'M', 11
	)
 */
import java.sql.*;

import javax.swing.JOptionPane;
public class Test02 {
	Connection con = null;
	Statement stmt = null;
	
	public Test02() {
		try{
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("********* 드라이버 로딩 성공 ********");
			// 2. 커넥션 얻어오고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "hello";
			String pw = "hello";
			
			con = DriverManager.getConnection(url, id, pw);
			
			// 3. Statement 만들고
			stmt = con.createStatement();
			
			// 질의명령 만들고
			StringBuffer buff = new StringBuffer();
			buff.append("INSERT INTO "); 
			buff.append("    member01(mno, id, name, mail, tel, gen, avt) "); 
			buff.append("VALUES( "); 
			buff.append("    ( "); 
			buff.append("    	SELECT "); 
			buff.append("    		NVL(MAX(mno) + 1, 1000) "); 
			buff.append("    	FROM "); 
			buff.append("    		member01 "); 
			buff.append("    ),  "); 
			buff.append("    'jjang', '장성환', 'jjang@increpas.com', "); 
			buff.append("    '010-1234-5678', 'M', 13 "); 
			buff.append(")");
//			String sql = new String(buff);
			String sql = buff.toString();
			// 4. 질의명령을 실어서 보내고
			int cnt = stmt.executeUpdate(sql);
			//  executeUpdate() 의 반환값의 의미는 질의명령의 실행결과 변경된 행수를 반환해준다.
			
			String msg = "회원입력에 성공했습니다.";
			/*
			if(cnt != 1) {
				msg = "회원입력에 실패했습니다.";
			}
			*/
			JOptionPane.showMessageDialog(null, msg);
			
		} catch(Exception e) {
			String msg = "회원입력에 실패했습니다.";
			JOptionPane.showMessageDialog(null, msg);
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
