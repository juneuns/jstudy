package jjokji;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class Jjokji {
	// Map 이 두개가 필요하다.
	// 아이디를 알면 아이피를 찾을 수 있는 Map
	// 아이피를 알면 아이디를 알 수 있는 Map
	Properties idToIp, ipToId;
	
	JList list;
	JButton writeB;
	JFrame fr;
	
	// UDP 통신은 DatagramSocket 으로 통신을 한다.
	DatagramSocket sSocket, rSocket;
	/*
		sSocket : 보내는 소켓
		rSocket : 받는 소켓
		
		참고 ]
			반드시 2개가 필요한 것은 아니다.
			소켓하나만 가지고도 보내기와 받기가 가능하다.
			이 경우는 보내는 도중에는 받지르 못할 수 있다.
			따라서 안전한 통신을 위해서
			보내는 소켓과 받는 소켓을 구분해서 처리하는 것이 좋다.
	 */
	
	public Jjokji() {
		setMap();
		setUI();
	}

	public static void main(String[] args) {
		new Jjokji();
	}
	
	public void close() {
		try {
			sSocket.close();
			rSocket.close();
		} catch(Exception e) {}
	}
	
	public void setUI() {
		fr = new JFrame("*** 쪽 지 ***");
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
				System.exit(0);
			}
		});
		
		// 목록상자안안에 친구 이름을 기록하고
		// Map에서 친구를 아이디로 찾아서 넣어놓자.
		Set tmp = idToIp.keySet();
		Vector<String> v = new Vector<String>(tmp);
		
		list = new JList(v);
		JScrollPane span = new JScrollPane(list);
		
		writeB = new JButton("쪽지쓰기");
		
		// 버튼에 이벤트 추가
		writeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 할일
				// 목록상자에서 선택한 아이디를 알아낸다.
				String sid = (String) list.getSelectedValue();
				
				if(sid == null) {
					JOptionPane.showMessageDialog(null, "*** 아이디를 먼저 선택하세요! ***");
					return;
				}
				
				// 보내기 위한 대화상자를 new 시킨다.
				SendFrame sFr = new SendFrame(Jjokji.this);
				sFr.field.setText(sid);
				
				// 창 보이기 제어
				fr.setVisible(false);
				sFr.wframe.setVisible(true);
			}
		});
		
		fr.add("Center", span);
		fr.add("South", writeB);
		
		fr.setSize(200, 200);
		fr.setResizable(false);
		fr.setVisible(true);
	}
	
	public void setMap() {
		idToIp = new Properties();
		ipToId = new Properties();
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try{
			fin1 = new FileInputStream("src/jjokji/resources/idToIp.properties");
			fin2 = new FileInputStream("src/jjokji/resources/ipToId.properties");
			
			idToIp.load(fin1);
			ipToId.load(fin2);
		} catch(Exception e) {}
		
		/*
		System.out.println(idToIp.get("euns"));
		System.out.println(ipToId.get("192.168.0.21"));
		*/
	}
}
