package day27;

import day27.dao.*;
import day27.vo.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Test02 {
	JFrame frame;
	JTextArea area;
	JTextField id, name, pw, mail, tel, gen, avt;
	JButton btn1, btn2;
	
	MemberDao mDao;
	public Test02() {
		mDao = new MemberDao();
		setUI();
	}
	
	public void setUI() {
		frame = new JFrame("회원가입");
		
//		title 설정
		JLabel title = new JLabel("*** 회원가입 ***");
		title.setFont(new Font("Gulim", Font.BOLD, 22));
		JPanel pan1 = new JPanel();
		pan1.add(title);
		pan1.setPreferredSize(new Dimension(450, 40));
		pan1.setBackground(Color.ORANGE);
		
//		입력폼 만들기
		// id
		JPanel idPan = new JPanel(new BorderLayout());
		idPan.setPreferredSize(new Dimension(420, 30));
		JLabel lid = new JLabel("I D : ");
		lid.setFont(new Font("gulim", Font.BOLD, 18));
		lid.setHorizontalAlignment(JLabel.RIGHT);
		lid.setPreferredSize(new Dimension(80, 30));
		id = new JTextField("아이디를 입력하세요.");
		id.setForeground(Color.ORANGE);
		idPan.add(lid, BorderLayout.WEST);
		idPan.add(id, BorderLayout.CENTER);
		
		// name
		JPanel namePan = new JPanel(new BorderLayout());
		namePan.setPreferredSize(new Dimension(420, 30));
		JLabel lname = new JLabel("NAME : ");
		lname.setFont(new Font("gulim", Font.BOLD, 18));
		lname.setHorizontalAlignment(JLabel.RIGHT);
		lname.setPreferredSize(new Dimension(80, 30));
		name = new JTextField("이름을 입력하세요.");
		name.setForeground(Color.ORANGE);
		namePan.add(lname, BorderLayout.WEST);
		namePan.add(name, BorderLayout.CENTER);
		
		// 비밀번호
		JPanel pwPan = new JPanel(new BorderLayout());
		pwPan.setPreferredSize(new Dimension(420, 30));
		JLabel lpw = new JLabel("P W : ");
		lpw.setFont(new Font("gulim", Font.BOLD, 18));
		lpw.setHorizontalAlignment(JLabel.RIGHT);
		lpw.setPreferredSize(new Dimension(80, 30));
		pw = new JTextField("비밀번호를 입력하세요.");
		pw.setForeground(Color.ORANGE);
		pwPan.add(lpw, BorderLayout.WEST);
		pwPan.add(pw, BorderLayout.CENTER);
		
		// mail
		JPanel mailPan = new JPanel(new BorderLayout());
		mailPan.setPreferredSize(new Dimension(420, 30));
		JLabel lmail = new JLabel("MAIL : ");
		lmail.setFont(new Font("gulim", Font.BOLD, 18));
		lmail.setHorizontalAlignment(JLabel.RIGHT);
		lmail.setPreferredSize(new Dimension(80, 30));
		mail = new JTextField("메일을 입력하세요.");
		mail.setForeground(Color.ORANGE);
		mailPan.add(lmail, BorderLayout.WEST);
		mailPan.add(mail, BorderLayout.CENTER);
		
		// tel
		JPanel telPan = new JPanel(new BorderLayout());
		telPan.setPreferredSize(new Dimension(420, 30));
		JLabel ltel = new JLabel("TEL : ");
		ltel.setFont(new Font("gulim", Font.BOLD, 18));
		ltel.setHorizontalAlignment(JLabel.RIGHT);
		ltel.setPreferredSize(new Dimension(80, 30));
		tel = new JTextField("전화번호를 입력하세요. 예 ] 010-1234-9876");
		tel.setForeground(Color.ORANGE);
		telPan.add(ltel, BorderLayout.WEST);
		telPan.add(tel, BorderLayout.CENTER);
		
		// 성별
		JPanel genPan = new JPanel(new BorderLayout());
		genPan.setPreferredSize(new Dimension(420, 30));
		JLabel lgen = new JLabel("성 별 : ");
		lgen.setFont(new Font("gulim", Font.BOLD, 18));
		lgen.setHorizontalAlignment(JLabel.RIGHT);
		lgen.setPreferredSize(new Dimension(80, 30));
		gen = new JTextField("성별을 입력하세요. 예 ] M");
		gen.setForeground(Color.ORANGE);
		genPan.add(lgen, BorderLayout.WEST);
		genPan.add(gen, BorderLayout.CENTER);
		
		// 아바타
		JPanel avtPan = new JPanel(new BorderLayout());
		avtPan.setPreferredSize(new Dimension(420, 30));
		JLabel lavt = new JLabel("아바타 : ");
		lavt.setFont(new Font("gulim", Font.BOLD, 18));
		lavt.setHorizontalAlignment(JLabel.RIGHT);
		lavt.setPreferredSize(new Dimension(80, 30));
		avt = new JTextField("아바타번호를 입력하세요.");
		avt.setForeground(Color.ORANGE);
		avtPan.add(lavt, BorderLayout.WEST);
		avtPan.add(avt, BorderLayout.CENTER);
		
		JPanel mainPan = new JPanel();
		mainPan.add(idPan);
		mainPan.add(namePan);
		mainPan.add(pwPan);
		mainPan.add(mailPan);
		mainPan.add(telPan);
		mainPan.add(genPan);
		mainPan.add(avtPan);
		
		// 버튼
		btn1 = new JButton("가입");
		btn2 = new JButton("종료");
		// 버튼 이벤트 처리
		joinEvt();
		
		btn1.setPreferredSize(new Dimension(225, 30));
		btn2.setPreferredSize(new Dimension(225, 30));
		
		JPanel btnPan = new JPanel(new GridLayout(1, 2));
		btnPan.add(btn1);
		btnPan.add(btn2);
		
		frame.add(pan1, BorderLayout.NORTH);
		frame.add(mainPan, BorderLayout.CENTER);
		frame.add(btnPan, BorderLayout.SOUTH);
		frame.setSize(450, 370);
		frame.setVisible(true);
	}
	
	// 가입버튼 이벤트 처리함수
	public void joinEvt() {
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력된 아이디 읽어온다.
				String sid = id.getText();
				// 질의명령 보내서 카운트 받아온다.
				int cnt = mDao.idCount(sid);
				// 카운트 값에 따라 적당히 처리해준다.
				if(cnt == 1) {
					// 이때는 입력한 아이디를 사용하는 사람이 이미 있는 경우다.
					// 따라서 다시 입력받아야 한다.
					id.setText("");
					JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: red\">" + sid + " 는 이미 사용중인 아이디 입니다.</h2></html>");
					return;
				} else {
					JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: blue\">" + sid + " 는 사용가능한 아이디 입니다.</h2></html>");
				}
				
				// 데이터 꺼내온다.
				// 1. 이름
				String sname = name.getText();
				String spw = pw.getText();
				String smail = mail.getText();
				String stel = tel.getText();
				String sgen = gen.getText();
				int sno = Integer.parseInt(avt.getText());
				
				// vo 에 담는다.
				MemberVO mVO = new MemberVO();
				mVO.setId(sid);
				mVO.setName(sname);
				mVO.setPw(spw);
				mVO.setMail(smail);
				mVO.setTel(stel);
				mVO.setGen(sgen);
				mVO.setAvt(sno);
				
				// 다 채워진 VO 채로 데이터베이스 처리함수에게 넘겨준다.
				cnt = 0 ;
				cnt = mDao.addMemb(mVO);
				
				if(cnt == 1) {
					JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: blue\">" + sid + " 님 가입이 완료되었습니다.</h2></html>");
				} else {
					JOptionPane.showMessageDialog(null, "<html><h2 style=\"color: red\">" + sid + " 님 가입이 취소되었습니다.</h2></html>");
				}
			}
		});
	}
	public static void main(String[] args) {
		new Test02();
	}

}
