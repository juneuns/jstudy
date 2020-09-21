package day28.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberList extends JFrame {
	public Member main;
	public JPanel mainPan, topPan;
	public Dimension dim1 = new Dimension(60, 20);
	public Dimension dim2 = new Dimension(100, 20);
	public Dimension dim3 = new Dimension(120, 20);
	public Dimension dim4 = new Dimension(160, 20);
	
	public MemberList(Member main) {
		this.main = main;
		
		this.setTitle("### 회원 리스트 ###");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mainPan = new JPanel();
		mainPan.setPreferredSize(new Dimension(370, 270));
		topPan = new JPanel(new BorderLayout());
		topPan.setPreferredSize(new Dimension(370, 20));
		
		JPanel titleP = new JPanel(new BorderLayout());
		titleP.setPreferredSize(new Dimension(380, 20));
		
		JPanel cPan = new JPanel(new BorderLayout());
		cPan.setPreferredSize(dim4);
		
		JLabel noLbl = new JLabel("회원번호");
		noLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel idLbl = new JLabel("아 이 디");
		idLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel nameLbl = new JLabel("회원이름");
		nameLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel mailLbl = new JLabel("메일주소");
		mailLbl.setHorizontalAlignment(JLabel.CENTER);
		
		// 라벨 크기 지정
		noLbl.setPreferredSize(dim1);
		idLbl.setPreferredSize(dim1);
		nameLbl.setPreferredSize(dim1);
		mailLbl.setPreferredSize(dim4);
		
		
		cPan.add(idLbl, BorderLayout.WEST);
		cPan.add(nameLbl, BorderLayout.CENTER);
		
		titleP.add(noLbl, BorderLayout.WEST);
		titleP.add(mailLbl, BorderLayout.EAST);
		titleP.add(cPan, BorderLayout.CENTER);
		/*
		 * titleP.add(noLbl); titleP.add(idLbl); titleP.add(nameLbl);
		 * titleP.add(mailLbl);
		 */
		
		JPanel hPan = new JPanel();
		hPan.setPreferredSize(new Dimension(380, 1));
		hPan.setBackground(Color.LIGHT_GRAY);
		
		topPan.add(titleP, BorderLayout.CENTER);
		topPan.add(hPan, BorderLayout.SOUTH);
		
		JScrollPane span = new JScrollPane(mainPan);
		span.setPreferredSize(new Dimension(380, 280));
		
		this.add(topPan, BorderLayout.NORTH);
		this.add(span, BorderLayout.CENTER);
		
		this.setSize(400, 300);
		this.pack();
		this.setVisible(false);
		this.setResizable(false);
	}
	
}
