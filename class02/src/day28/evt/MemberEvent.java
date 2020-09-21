package day28.evt;

import java.util.*;
import java.awt.event.*;

import day28.controller.*;
import day28.dao.*;
import day28.vo.*;
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
		} else if(e.getActionCommand().equals("회원가입")) {
			addMemb();
		} else {
			// 이 경우는 닫기 버튼을 누른 경우다.
			System.exit(0);
		}
	}
	
	// 회원 정보 리스트 전담 처리함수
	public void getList() {
		// 여기서 회원 리스트 내용 처리한다.
		ArrayList<MemberVO> list = mDao.getList();
		System.out.printf("%6s | %6s | %6s | %6s\n", "회원번호", "회원아이디", "회원이름", "메일주소");
		System.out.println("-------------------------------------------------------------");
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			MemberVO mVO = list.get(i);
			int mno = mVO.getMno();
			String id = mVO.getId();
			String name = mVO.getName();
			String mail = mVO.getMail();
			
			System.out.printf("%10s | %11s | %7s | %11s\n", mno + "", id, name, mail);
		}
		System.out.println("-------------------------------------------------------------");
	}
	
	// 회원가입 처리함수
	public void addMemb() {
		// 메인폼 감추고
		main.fr.setVisible(false);
		// 조인폼 보이게 하고
		main.join.setVisible(true);
	}
}
