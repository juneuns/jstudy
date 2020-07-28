package day09;

import javax.swing.JOptionPane;

public class Intoduce_euns {

	public static void main(String[] args) {
		String[][] me = new String[8][2];
		me[0][0] = "이름";
		me[0][1] = "전은석";
		me[1][0] = "생년월일";
		me[1][1] = "1971년 12월 26일";
		me[2][0] = "주소";
		me[2][1] = "경기도 수원시 장안구 정자동";
		me[3][0] = "전화";
		me[3][1] = "010-3175-9042";
		me[4][0] = "메일";
		me[4][1] = "euns_jun@naver.com";
		me[5][0] = "이전 과거";
		me[5][1] = "개발...";
		me[6][0] = "지원동기";
		me[6][1] = "훈련생들 도와주기 위해서...";
		me[7][0] = "포부";
		me[7][1] = "잘부탁합니다!";
		
		String ttl;
		String cont;
		for(int i = 0 ; i < me.length ; i++ ) {
			ttl = me[i][0];
			cont = me[i][1];
			
			JOptionPane.showMessageDialog(null, (i + 1) + " ] " + ttl + " - " + cont);
		}
		JOptionPane.showMessageDialog(null, "<html><h1>Thanks!!!</h1></html>");
		
	}

}
