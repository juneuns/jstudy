package day27.event;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day27.ui.*;
import day27.vo.MemberVO;
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
		
		main.mPan.removeAll();
		main.mPan.setLayout(new FlowLayout());
		main.mPan.setAlignmentY(JComponent.CENTER_ALIGNMENT);
		
		for(int i = 0 ; i < list.size(); i++ ) {
			JButton tmp = new JButton(list.get(i));
			tmp.setPreferredSize(new Dimension(300, 37));
			tmp.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String sid = e.getActionCommand();
					getInfo(sid);
				}
			});
			main.mPan.add(tmp);
		}
		
		main.pack();
		main.repaint();
	}
	
	// 회원 정보 가져오기 전담 처리함수
	public void getInfo(String sid) {
		MemberVO mVO = mDao.getInfo(sid);
		main.mPan.removeAll();
		main.mPan.setLayout(main.blout);
		main.mPan.add(main.tPan, BorderLayout.NORTH);
		main.mPan.add(main.wPan, BorderLayout.WEST);
		main.mPan.add(main.cPan, BorderLayout.CENTER);
		
		main.icon = new ImageIcon("src/day27/img/avatar/"+ mVO.getAvatar());
		main.img = main.icon.getImage();
		
		main.wPan.removeAll();
		main.wPan.add(main.picPan);
		main.wPan.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		main.wPan.setAlignmentY(JPanel.CENTER_ALIGNMENT);
		
		main.ttl.setText(mVO.getName() + " 회원 정보");
		
		main.cno.setText(mVO.getMno()+ "");
		main.cname.setText(mVO.getName());
		main.cid.setText(mVO.getId());
		main.cmail.setText(mVO.getMail());
		main.ctel.setText(mVO.getTel());
		main.cjoin.setText(mVO.getSdate());
		main.cano.setText(mVO.getAname());
		main.cgen.setText(mVO.getGen());
		
		
		main.pack();
		main.repaint();
	}
}
