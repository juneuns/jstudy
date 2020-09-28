package chatting.client;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import chatting.client.ui.*;
public class ClientController {
	public ChattingFrame frame;
	public LoginFrame loginFr;
	
	// 통신에 관련된 변수
	public Socket socket;
	public PrintWriter prw;
	public BufferedReader br;
	
	public ClientController() {
		frame = new ChattingFrame(this);
		loginFr = new LoginFrame(this);
	}

	public static void main(String[] args) {
		new ClientController();
	}
	
	public void close() {
		try {
			prw.close();
			br.close();
			socket.close();
		} catch(Exception e) {}
		System.exit(0);
	}
}
