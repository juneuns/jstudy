package day10;

/*
	랜덤하게 알파벳을 만들어서 출력하는데
		0을 입력받으면 대문자를
		1을 입력받으면 소문자를 
	만들어서 출력하는 프로그램을 작성하세요.
 */
import javax.swing.*;
public class Test03 {
	
	
	
	public Test03() {
		/*
		// 무한반복하는 프로그램을 만들어보자.
		// q가 입력이 되면 종료가 되게 종료 조건을 입력한다.
		while(true) {
			String msg = JOptionPane.showInputDialog("대문자는 [ 0 ], \n소문자는  [ 1 ], \n종료는 [ q ] 를 \n입력하세요.");
			if(msg.equals("q")) {
				JOptionPane.showMessageDialog(null, "*** 프로그램이 종료 됩니다. ***");
				break;
			}
			
			// 잘못 입력하는 경우를 대비해서 조건처리를 한다.
			if(!(msg.equals("0") || msg.equals("1"))) {
				// 이 경우는 0 또는 1 또는 q를 입력하지 않은 경우이므로 다시 반복시킨다.
				JOptionPane.showMessageDialog(null, "*** 잘못입력해서 다시 반복합니다. ***");
				continue;
			}
			
			// 함수 호출해서 문자 만들어내고
			char ch = getChar(msg);
			
			// 만들어진 문자 출력하고
			JOptionPane.showMessageDialog(null, "랜덤하게 발생된 문자는 " + ch + " 입니다.");
		}
		*/
		
		displayChar();
	}
	
	
	// 코드를 입력받아서 코드에 해당하는 문자를 보여주는 함수
	public void displayChar() {
		// 무한반복하는 프로그램을 만들어보자.
		// q가 입력이 되면 종료가 되게 종료 조건을 입력한다.
		while(true) {
			String msg = JOptionPane.showInputDialog("대문자는 [ 0 ], \n소문자는  [ 1 ], \n종료는 [ q ] 를 \n입력하세요.");
			if(msg.equals("q")) {
				JOptionPane.showMessageDialog(null, "*** 프로그램이 종료 됩니다. ***");
				break;
			}
			
			// 잘못 입력하는 경우를 대비해서 조건처리를 한다.
			if(!(msg.equals("0") || msg.equals("1"))) {
				// 이 경우는 0 또는 1 또는 q를 입력하지 않은 경우이므로 다시 반복시킨다.
				JOptionPane.showMessageDialog(null, "*** 잘못입력해서 다시 반복합니다. ***");
				continue;
			}
			
			// 함수 호출해서 문자 만들어내고
			char ch = getChar(msg);
			
			// 만들어진 문자 출력하고
			JOptionPane.showMessageDialog(null, "랜덤하게 발생된 문자는 " + ch + " 입니다.");
		}
	}
	
	// 랜덤하게 알파벳 만들어주는 함수
	public char getChar(String s) {
		// 랜덤하게 0 ~ 25 사이의 숫자를 발생시킨다.
		// 입력되는 문자열이 "0" 이면 발생된 숫자에 'A' 더해서 문자로 변환한다.
		int tmp = (int)(Math.random() * 26);
		char ch = s.equals("0") ? (char)(tmp + 'A') : (char)(tmp + 'a');
		
		return ch;
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
