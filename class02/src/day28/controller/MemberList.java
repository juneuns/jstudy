package day28.controller;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemberList extends JFrame {
	public JPanel mainPan;
	public MemberList() {
		this.setTitle("### 회원 리스트 ###");
		
		mainPan = new JPanel();
		
		JPanel titleP = new JPanel(new GridLayout(1, 4));
		titleP.setPreferredSize(new Dimension(380, 15));
		JLabel noLbl = new JLabel("회원번호");
		noLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel idLbl = new JLabel("아 이 디");
		idLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel nameLbl = new JLabel("회원이름");
		nameLbl.setHorizontalAlignment(JLabel.CENTER);
		JLabel mailLbl = new JLabel("메일주소");
		mailLbl.setHorizontalAlignment(JLabel.CENTER);
		
		// 라벨 크기 지정
		Dimension dim1 = new Dimension(60, 15);
		Dimension dim2 = new Dimension(100, 15);
		Dimension dim3 = new Dimension(120, 15);
		noLbl.setPreferredSize(dim1);
		idLbl.setPreferredSize(dim2);
		nameLbl.setPreferredSize(dim3);
		mailLbl.setPreferredSize(dim3);
		
		titleP.add(noLbl);
		titleP.add(idLbl);
		titleP.add(nameLbl);
		titleP.add(mailLbl);
		
		JPanel hPan = new JPanel();
		hPan.setPreferredSize(new Dimension(380, 1));
		hPan.setBackground(Color.LIGHT_GRAY);
		
		mainPan.add(titleP);
		mainPan.add(hPan);
		
		this.add(mainPan);
		
		this.setSize(400, 300);
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new MemberList();
	}
}
