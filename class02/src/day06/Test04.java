package day06;

import javax.swing.JOptionPane;

/*
	정수를 랜덤하게 발생 시키고
	숫자를 입력 받아서 
	같은 숫자가 입력될 경우 종료시키는 
	프로그램을 작성하세요.
	
	단, while 반복문을 사용해서 처리하세요.
*/
public class Test04 {
	public static void main(String[] args) {
		// 정수 랜덤하게 발생 시키고
		int no = (int)(Math.random() * 90 + 10);
		
		// 조건식에 사용할 변수 만든다.
//		boolean bool = true;
		String sno = "";
//		while(bool) {
		while(true) {
			// 숫자 입력받고
			sno = JOptionPane.showInputDialog("두자리 숫자 입력!");
			
			if(sno.equals("q")) {
				JOptionPane.showMessageDialog(null, "게임을 포기하겠습니다.");
				break;
			}
			
			// 정수로 변환하고
			int num = Integer.parseInt(sno);
			
			// no와 num을 비교해서 처리한다.
			String msg = "같은 수";
			if(no > num) {
				msg = "작은 수";
			} else if(no < num) {
				msg = "큰 수";
			} 
			/*else {
				msg = "같은 수";
			}
			*/
			
			JOptionPane.showMessageDialog(null, "입력한 숫자는 " + msg + " 입니다.");
			
			// 탈출 조건
			if(no == num) {
				break;			// 명령을 읽는 순간 반복문을 즉시 종료한다.
//				bool = false;	// 조건식으로 가서 조건 처리를 다시 한다.
			}
		}
	}
}
