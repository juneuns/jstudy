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
	JButton sendB;
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
	}

	public static void main(String[] args) {

	}

}
