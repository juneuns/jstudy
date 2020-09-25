package chatting.dbsetting;


public class DbSetting {
	MemberDao mDao;
	
	public DbSetting() {
		mDao = new MemberDao();
		
		// 데이터꺼내고
		mDao.getData();
		// 데이터 저장하고
		int cnt = mDao.setData();
		System.out.println(cnt + " 행의 데이터가 입력되었습니다.");
	}

	public static void main(String[] args) {
		new DbSetting();
	}

}
