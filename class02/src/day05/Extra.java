package day05;

/*
	정수를 랜덤하게 발생 시키고
	숫자를 입력 받아서 
	같은 숫자가 입력될 경우 종료시키는 
	프로그램을 작성하세요.
 */
import javax.swing.*;
public class Extra {

	public static void main(String[] args) {
		int no = (int)(Math.random() * 90 + 10);
		
		for(;;) {
			String sno = JOptionPane.showInputDialog("두자리 숫자를 입력하세요!");
			int tmp = Integer.parseInt(sno);
			
			String msg = "";
			if(tmp > no) {
				msg = "큰 수";
			} else if( tmp < no) {
				msg = "작은수";
			} else {
				msg = "같은수";
			}
			
			JOptionPane.showMessageDialog(null, "입력한 수는 발생된 수보다 " + msg + " 입니다.");
			if(tmp == no) break;
		}
	}

}
