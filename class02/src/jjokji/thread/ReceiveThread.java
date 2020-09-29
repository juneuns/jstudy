package jjokji.thread;

import java.io.*;
import java.net.*;

import jjokji.*;

/*
	이 클래스는 쪽지를 받기 위한 클래스이다.
	TCP에서와 마찬가지로 쪽지는 언제 도착할지 알 수 없으므로
	독립적으로 쪽지를 받기 위한 프로그램을 따로 만들어서 처리해야 한다.
 */
public class ReceiveThread extends Thread {
	Jjokji main;
	
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	
	public void receiveProc(DatagramPacket pack) {
		// 할일
		// 포장을 뜯어서 내용물을 확인하고
		// 메세지 꺼내고
		byte[] buff = pack.getData();
		String msg = new String(buff, 0, buff.length);
		
		// 보낸사람 주소 꺼내고
		InetAddress addr = pack.getAddress();
		String ip = addr.getHostAddress();
		
		// 그 내용물을 화면에 출력하고
		// 보낸사람의 아이디를 출력하고
		//	우리가 만든 Map(ipToId)
		String sid = (String) main.ipToId.get(ip);
		
		// 화면에 보여줄 내용을 모두 만들었으므로 출력한다.
		ReceiveFrame rFr = new ReceiveFrame(main);
		rFr.field.setText(sid);
		rFr.area.setText(msg);
		
		// 창을 보이게 처리하고
		rFr.wframe.setVisible(true);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				// 할일
				// 쪽지를 받는다.
				// 문제는 도착하는 쪽지는 패킷으로 도착을 한다.
				// *****
				// 반드시 패킷을 준비해서 받아야 한다.
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				main.rSocket.receive(pack);
				/*
					이 함수 역시 블럭킹 함수이므로
					패킷ㄷ이 도착하면 실행되는 함수이다.
					도착한 패킷을 대화상자를 이용해서 출력한다.
				 */
				receiveProc(pack);
			}
		} catch(Exception e) {
		} finally {}
	}
}
