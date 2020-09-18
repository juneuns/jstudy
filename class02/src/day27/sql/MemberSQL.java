package day27.sql;

public class MemberSQL {
	public final int SEL_ID_LIST 	= 1001;
	public final int SEL_ID_INFO 	= 1002;
	public final int SEL_ID_CNT 	= 1003;
	
	public final int EDIT_MEMB 		= 2001;
	
	public final int ADD_MEMB 		= 3001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ID_LIST:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y'");
			break;
		case SEL_ID_INFO:
			buff.append("SELECT ");
			buff.append("	mno, name, mail, tel, gen, avt, joinDate ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	id = ?");
			break;
		case SEL_ID_CNT:
			buff.append("SELECT ");
			buff.append("	COUNT(*) cnt ");
			buff.append("FROM ");
			buff.append("	member01 ");
			buff.append("WHERE ");
			buff.append("	id = ?");
			break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member01( ");
			buff.append("		mno, id, name, pw, mail, tel, gen, avt ");
			buff.append("	) ");
			buff.append("VALUES( ");
			buff.append("	(SELECT NVL(MAX(mno) + 1, 1000) FROM member01), ");
			buff.append("	?, ?, ?, ?, ?, ?, ? ");
			buff.append(")");
			break;
		}
		
		return buff.toString();
	}
}
