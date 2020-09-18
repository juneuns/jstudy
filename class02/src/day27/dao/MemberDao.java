package day27.dao;


import java.sql.*;

import DB.*;
import day27.sql.*;
import day27.vo.*;
public class MemberDao {
	MyJDBC db ;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL ;
	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원가입 데이터베이스작업 전담 처리함수
//	public int addMemb(String id, String name, String pw, String mail, String tel, String gen, int avt) {
	public int addMemb(MemberVO mVO) {
		int cnt = 0 ;
		
		return cnt;
	}
	
	// 아이디 중복 체크 데이터베이스 작업 전담 처리함수
	public int idCount(String id) {
		int cnt = 0;
		// 할일
		// 1. 커넥션 얻어오고
		con = db.getCon();
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_CNT);
		// 3. PreparedStatement 만들고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, id);
			// 5. 질의명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 6. 데이터꺼내고 
			rs.next(); // 작업줄로 이동...
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 7. 데이터 내보내고
		return cnt;
	}
}
