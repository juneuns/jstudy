package chatting.server.dao;

/**
 * 	회원 정보 처리용 클래스
 * @author	전은석
 * @since	2020.09.25
 * @version	v.1.0
 *
 */

import java.sql.*;

import DB.*;
public class MemberDao {
	MyJDBC db;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemberDao() {
		db = new MyJDBC();
	}
	
	// 회원 로그인 처리 데이터베이스 작업 전담 함수
	public int getLogin(String id, String pw) {
		int cnt = 0 ; 
		
		// connection
		con = db.getCon();
		String sql = "SELECT COUNT(*) cnt FROM member WHERE id = ? AND pw = ? AND isshow = 'Y'";
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 질의명령 완성하고
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			// 질의명령 실행하고 결과 받고
			rs = pstmt.executeQuery();
			rs.next();
			
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 데이터 반환하고
		return cnt;
	}
}
