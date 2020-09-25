package chatting.dbsetting;

import java.util.*;
import java.sql.*;


import DB.*;
public class MemberDao {
	MyJDBC db1; // 데이터가져오기 db
	MyJDBC db2; // 내 데이터베이스 db
	
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	ArrayList<MemberVO> list;
	public MemberDao() {
		list = new ArrayList<MemberVO>();
		db1 = new MyJDBC("192.168.0.21");
		db2 = new MyJDBC();
	}
	
	// 데이터가져오기 전담 처리함수
	public void getData() {
		con = db1.getCon();
		String sql = "SELECT * FROM member";
		stmt = db1.getSTMT(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				// 매번 반복해서 한사람의 정보를 만들고
				MemberVO mVO = new MemberVO();
				
				mVO.setMno(rs.getInt("mno"));
				mVO.setId(rs.getString("id"));
				mVO.setPw("12345");
				mVO.setName(rs.getString("name"));
				mVO.setMail(rs.getString("mail"));
				mVO.setGen(rs.getString("gen"));
				mVO.setAvt(rs.getInt("avt"));
				mVO.setJoinDate(rs.getDate("joindate"));
				mVO.setJoinTime(rs.getTime("joindate"));
				mVO.setIsshow(rs.getString("isshow"));
				
				// 만들어진 정보를 리스트에 담고
				list.add(mVO);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db1.close(rs);
			db1.close(stmt);
			db1.close(con);
		}
	}
	
	// 내 데이터베이스에 데이터 저장하는 함수
	public int setData() {
		int cnt = 0 ; 
		
		con = db2.getCon();
		String sql = "INSERT INTO member VALUES( " +
					"?, ?, ?, ?, ?, ?, ?, TO_DATE(?, 'yyyy/mm/dd HH:MI:ss'), ?" +
					")";
		
		
		return cnt;
	}
}
