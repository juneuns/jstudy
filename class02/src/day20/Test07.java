package day20;

/*
	MessageFormat 를 사용해서 형식에 맞는 문자열을 만들어 보자.
	
	"Name : 전은석, Tel : 010-3175-9042, Mail : euns@increpas.com"
	"Name : 윤요셉, Tel : 010-5069-8600, Mail : joseph@increpas.com"
 */

import java.text.*;

import javax.swing.JOptionPane;

public class Test07 {

	public Test07() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Mail : {2}");
		/*
			동일한 내용은 그대로 쓰고
			변화되는 부분만 {0}, {1}, {2} 로 기록한다.
			이때 번호는 입력되는 데이터의 순서를 의미한다.
		 */
		
		/*
		String[] data = {"전은석", "010-3175-9042", "euns@increpas.com"};
		
		String result = form.format(data);
		
		JOptionPane.showMessageDialog(null, result);
		 */
		
		String[][] data = {
							{"전은석", "010-3175-9042", "euns@increpas.com"},
							{"윤요셉", "010-5069-8600", "joseph@increpas.com"}
						};
		String result = "";
		for(int i = 0 ; i < data.length ; i++ ) {
			result = result + form.format(data[i]);
			
			if(i < data.length - 1) result += "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
