package day10;

/*
	정수 두 수를 입력받고 계산방식을 입력받아서
	산술연산의 결과를 보여주는 프로그램을 작성하세요.
	
	각 연산 별로 함수를 만들어서 처리한다.
 */

import javax.swing.*;
public class Test04 {
	// 전역변수만들고
	int num1 = 0;
	int num2 = 0;
	String mark = "";
	
	public Test04() {
		
/*		
		JOptionPane.showMessageDialog(null, "입력된 숫자는" + num1 + " 과 " + num2 + 
											" 이고 두 숫자의 " + mark + " 연산 결과는 " + calc() + " 입니다.\nnum1 : " + num1);
*/		
		int gap = calc();
		JOptionPane.showMessageDialog(null, "입력된 숫자는" + num1 + " 과 " + num2 + 
				" 이고 두 숫자의 " + mark + " 연산 결과는 " + gap + " 입니다.");
	}
	
	
	// 전체 계산하는 함수
	public int calc() {
		// 반환 데이터 기억할 변수 만들고
		int result = 0 ;
		
		// 숫자 두개 입력받아서 기억하고
		int no1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요."));
		num1 = no1; // 전역변수에 직접 데이터를 입력해도 상관이 없다. 오히려 더 좋다.
		int no2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요."));
		num2 = no2;
		while(true) {
			String giho = JOptionPane.showInputDialog("연산 기호를 입력하세요!");
			
			switch(giho) {
			case "+":
				result = plus(no1, no2);
				break;
			case "-":
				result = minus(no1, no2);
				break;
			case "*":
				result = gop(no1, no2);
				break;
			case "/":
				result = nanum(no1, no2);
				break;
			case "%":
				result = namuji(no1, no2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "입력이 잘못되었습니다!");
				continue;
			}
			
			mark = giho;
			break;
		}
		
		return result;
	}
	
	// 더하기 연산 전담 처리 함수
	public int plus(int no1, int no2) {
		/*
		int result = no1 + no2;
		return result;
		 */
		return no1 + no2;
	}
	// 빼기 연산 전담 처리 함수
	public int minus(int no1, int no2) {
		return no1 - no2;
	}
	// 곱하기 연산 전담 처리 함수
	public int gop(int no1, int no2) {
		return no1 * no2;
	}
	// 나누기 연산 전담 처리 함수
	public int nanum(int no1, int no2) {
		return no1 / no2;
	}
	// 나머지 연산 전담 처리 함수
	public int namuji(int no1, int no2) {
		return no1 % no2;
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
