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
	JButton btn1, btn2, obtn;
	String path = "D:\\";
	JFileChooser choice;
	
	public Memo01() {
		choice = new JFileChooser(path);
		
		// 윈도우 셋팅...
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
		
		pan = new JPanel(new GridLayout(1,3));
		
		btn1 = new JButton("save");
		btn2 = new JButton("close");
		obtn = new JButton("open");
		
		pan.add(obtn);
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
		
		obtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = choice.showOpenDialog(frame);
				if( no == 0) {
					File file = choice.getSelectedFile();
					FileInputStream fin = null;
					BufferedInputStream bin = null;
					StringBuffer buffer = new StringBuffer();
					try {
						fin = new FileInputStream(file);
						bin = new BufferedInputStream(fin);
						byte[] buff = new byte[1024];
						while(true) {
							int len = bin.read(buff);
							if(len == -1) break;
							buffer.append(new String(buff, 0, len));
						}
						
						String str = new String(buffer.toString().getBytes());
						area.setText(str);
					} catch(Exception e1) {
						e1.printStackTrace();
					} finally {
						try {
							bin.close();
							fin.close();
						} catch(Exception e1) {}
					}
				}
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
			int num = choice.showSaveDialog(frame);
			if(num == 0) {
				File file = choice.getSelectedFile();
				
				path = file.getPath();
				String sfile = file.getName();
				
				fout = new FileOutputStream(file);
				bout = new BufferedOutputStream(fout);
				bout.write(buff);
				bout.flush();
				
				JOptionPane.showMessageDialog(null, sfile + "\n파일을 저장했습니다." );
			}
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
