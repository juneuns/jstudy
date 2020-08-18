package day24.memo;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Memo01 {
	JFrame frame;
	JPanel pan;
	JScrollPane span;
	JTextArea area;
	JButton btn1, btn2;
	
	public Memo01() {
		setFrame();
		// 이벤트 추가
		addEvent();
	}
	
	public void setFrame() {
		frame = new JFrame("메모장");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		area = new JTextArea();
		area.setBackground(Color.WHITE);
//		area.setEditable(true);
//		area.setEnabled(true);
		span = new JScrollPane(area);
		
		pan = new JPanel(new GridLayout(1,2));
		
		btn1 = new JButton("save");
		btn2 = new JButton("close");
		
		pan.add(btn1);
		pan.add(btn2);
		
		frame.add(span, BorderLayout.CENTER);
		frame.add(pan, BorderLayout.SOUTH);
		
		frame.setSize(500, 530);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public void addEvent() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = JOptionPane.showConfirmDialog(frame, "저장하시겠습니까?", "파일 저장", JOptionPane.YES_NO_OPTION);
				if(num == 0) {
					toSave();
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	// 파일 저장 함수
	public void toSave() {
		String str = area.getText();
		byte[] buff = str.getBytes();
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {
			fout = new FileOutputStream("src/day24/memo/test01.txt");
			bout = new BufferedOutputStream(fout);
			bout.write(buff);
			bout.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Memo01();
	}

}
