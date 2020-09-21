package day28.evt;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import day28.vo.*;
import day28.controller.*;
import day28.dao.*;
public class JoinEvent implements ActionListener {
	public MemberJoin join;
	MemberDao mDao;
	public JoinEvent(MemberJoin join) {
		this.join = join;
		mDao = new MemberDao();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("가입")) {
			
		} else {
			// join 창을 닫고 main 창을 띄워줘야 한다.
			join.setVisible(false);
			join.main.fr.setVisible(true);
		}
	}
	
	// 회원가입 이베트 처리함수
	public void joinProc() {
		// 입력된 아이디 읽어온다.
		String sid = join.id.getText();
		// 질의명령 보내서 카운트 받아온다.
		int cnt = mDao.idCount(sid);
		// 카운트 값에 따라 적당히 처리해준다.
		if(cnt == 1) {
			// 이때는 입력한 아이디를 사용하는 사람이 이미 있는 경우다.
			// 따라서 다시 입력받아야 한다.
			join.id.setText("");
			JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: red\">" + sid + " 는 이미 사용중인 아이디 입니다.</h2></html>");
			return;
		} else {
			JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: blue\">" + sid + " 는 사용가능한 아이디 입니다.</h2></html>");
		}
		
		// 데이터 꺼내온다.
		// 1. 이름
		String sname = join.name.getText();
		String spw = join.pw.getText();
		String smail = join.mail.getText();
		String stel = join.tel.getText();
		String sgen = join.gen.getText();
		int sno = Integer.parseInt(join.avt.getText());
		
		// vo 에 담는다.
		MemberVO mVO = new MemberVO();
		mVO.setId(sid);
		mVO.setName(sname);
		mVO.setPw(spw);
		mVO.setMail(smail);
		mVO.setTel(stel);
		mVO.setGen(sgen);
		mVO.setAno(sno);
		
		// 다 채워진 VO 채로 데이터베이스 처리함수에게 넘겨준다.
		cnt = 0 ;
//		cnt = mDao.addMemb(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: blue\">" + sid + " 님 가입이 완료되었습니다.</h2></html>");
		} else {
			JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: red\">" + sid + " 님 가입이 취소되었습니다.</h2></html>");
		}
	}
}
