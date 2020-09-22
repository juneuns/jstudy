package day26;

import java.util.*;
import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

import DB.*;
public class Test04 {
	MyJDBC db = null;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	JFrame frame;
	JPanel pan1, pan2;
	JScrollPane span1;
	JTable tab;
	JButton btn1, btn2, btn3;
	JTextArea area;
	DefaultTableModel tableModel = null;
	
	public Test04() {
		db = new MyJDBC();
		setUI();
	}
	public void setUI() {
		frame = new JFrame("회원리스트");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		pan1 = new JPanel(new BorderLayout());
//		pan1.setPreferredSize(new Dimension(500, 570));
		
		String[] header = {"아이디"};
		String[][] idList = {{""}};

		Object[][] data = {{""}}; //적당한 data를 넣으세요.
		Object[] columnNames = {"회원아이디"};
		
		tableModel = new DefaultTableModel( columnNames, 0 );
		tab = new JTable(tableModel);
		
		
		area = new JTextArea();
		area.setEditable(false);
//		span1 = new JScrollPane(area);
		span1 = new JScrollPane(tab);
		span1.setPreferredSize(new Dimension(500, 570));
		pan2 = new JPanel(new GridLayout(1, 3));
		pan2.setPreferredSize(new Dimension(500, 30));
		
		btn1 = new JButton("조회");
		btn2 = new JButton("정보보기");
		btn3 = new JButton("종료");
		
//		이벤트 등록
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getIdList();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tableModel.removeRow(1);
//				tableModel.
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		pan2.add(btn1);
		pan2.add(btn2);
		pan2.add(btn3);
		
		frame.add(span1, BorderLayout.CENTER);
		frame.add(pan2, BorderLayout.SOUTH);
		
		frame.setSize(500, 600);
		frame.setVisible(true);
		
	}
	public void getIdList() {
		area.setText("");
		
		con = db.getCon();
		
		String sql = "SELECT id FROM member01";
		
		stmt = db.getSTMT(con);
		ArrayList<String> list = new ArrayList<String>();
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString("id"));
			}
			
			String[] header = {"아이디"};
			String[][] idList = new String[list.size()][1];
//			idList = list.toArray(idList);
			
			
			if(tableModel.getRowCount() > 0) {
				for(int i = 0 ; i < list.size();i++) {
					System.out.println("########### i : " + i);
					System.out.println("### cnt : " + tableModel.getRowCount());
					tableModel.removeRow(1);
//					new Scanner(System.in).nextLine();
					try {
						Thread.sleep(1000);
					}catch(Exception e) {}
				}
			}
			
			for(int i = 0 ; i < list.size() ; i++ ) {
				area.append(list.get(i));
				area.append("\n");
				idList[i][0] = list.get(i);
				
				tableModel.addRow(idList[i]);
			}
			
//			tab = new JTable(idList, header);
			
//			span1 = new JScrollPane(tab);
			span1.repaint();
//			frame.remove(span1);
//			frame.add(span1, BorderLayout.CENTER);
//			frame.pack();
			frame.repaint();
			System.out.println(tab.getRowCount());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
