package day28.dao;

import DB.*;
import day28.sql.*;
import day28.vo.*;

import java.util.*;

public class MemberDao {
	MyJDBC db;
	MemberSQL mSQL;
	
	public MemberDao() {
		db = new MyJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원리스트 가져오기 데이터베이스 작업 전담 처리함수
	public ArrayList<MemberVO> getList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		
		
		return list;
	}
}
