package day27.event;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

import day27.ui.*;
import day27.dao.*;
public class MemberEvt implements ActionListener{
	MemberUI main;
	MemberDao mDao;
	public MemberEvt() {
	}
	public MemberEvt(MemberUI main) {
		this.main = main;
		mDao = new MemberDao();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("회원리스트")) {
			getList();
		} else {
			System.exit(0);
		}
	}
	
	// 리스트 가져오기 처리함수
	public void getList() {
		ArrayList<String> list = mDao.getList();
		
		main.span = new JScrollPane();
		for(int i = 0 ; i < list.size(); i++ ) {
			main.span.add(new JButton(list.get(i)));
		}
		
		main.add(main.span, BorderLayout.CENTER);
	}
}
