package day28.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import day28.controller.*;
import day28.dao.*;
public class MemberEvent implements ActionListener {
	Member main;
	MemberDao mDao;
	public MemberEvent() {}
	
	public MemberEvent(Member main) {
		this.main = main;
		mDao = new MemberDao();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand(); // 버튼의 내용 읽어온다.
		// 내용에 따라 처리를 다르게 해준다.
		
		if(str.equals("회원리스트")) {
			getList();
		} else {
			// 이 경우는 닫기 버튼을 누른 경우다.
			System.exit(0);
		}
	}
	
	// 회원 정보 리스트 전담 처리함수
	public void getList() {
		// 여기서 회원 리스트 내용 처리한다.
		System.out.println("디비작업 시켰지롱~~~!");
	}
	
}
