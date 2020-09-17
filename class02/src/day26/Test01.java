package day26;

/*
	JDBC를 이용해서 오라클에 접속해서 회원정보를 가져와보자.
 */
import java.sql.*;

import javax.swing.JOptionPane;

public class Test01 {
	Connection con = null;
	public Test01() {
		try {
			/*
				자바에서 데이터베이스 작업을 하려면
				1. JDBC와 외부데이터베이스를 연결할 드라이버를
					프로그램에서 가지고 와야 한다.
					외부 클래스를 로딩하는 함수
						
						Class.forName()
					드라이버마다 외부 클래스의 이름이 조금씩 다르다.
			 */
			// 드라이버 로딩한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			// JDBC가 해당 드라이버를 이용해서 연결을 시도한다.
			// 2. 오라클에 접속을 시도한다.
			/*
				이때 각 DBMS마다 접속하는 방법(URL)이 조금씩 다르다.
				그 방법은 웹에서 검색하면 된다.
				
				접속하는 명령은 JDBC에게 명령하면 된다.
					
					DriverManager.getConnection();
			 */
			
			// 2.1 접속할 주소를 변수에 담고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			con = DriverManager.getConnection(url, "hello", "hello");
			
			System.out.println("*** 접속 성공 ***");
			
			/*
				접속을 하면 접속자를 관리하는 세션을 제공하게 된다.
				이 세션을 관리하는 클래스가 Connection 이다.
				
				--------- 이부분까지가 DBMS 마다 조금씩 다른 내용 ---------
				
				여기부터는 모두 동일한 방식으로
				JDBC에게 명령을 내리면
				JDBC가 DBMS에게 명령을 전달하게 된다.
			 */
			
			// 3. Statement 를 만든다.
			Statement stmt = con.createStatement();
			
			// 4. 질의명령을 만들고
			String str = JOptionPane.showInputDialog("조회할 아이디를 입력하세요!"); // 아이디 입력받고
			String sql = "SELECT name FROM member01 WHERE id = '" + str + "'"; // 질의명령 만들고
			
			// 질의명령을 Statement에 실어서 보낸다.
			// 이때 조회 질의명령은 결과를 받아야 하므로 executeQuery()를 사용해서 보낸다.
			
			// 질의명령 보내고 결과 받고
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			String name = rs.getString("name");
			
			JOptionPane.showMessageDialog(null, "<html><h2>입력한 아이디 "+ str +" 는 " + name + " 회원이 사용하고 있습니다.</h2></html>");
			
			rs.close();
			stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 데이터베이스 작업이 모두 완료가 되면
			// 사용하던 자원은 반드시 반환해주도록 한다.
			try {
				con.close();
				System.out.println("### 자원 반환 완료 ###");
			} catch (SQLException e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test01();
	}

}
