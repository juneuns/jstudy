package day14;

/*
	Figure 배열을 만들고 배열에 
	Figure, Sagak, Semo, Dongle 을 랜덤하게 만들어서
	0		1		2		3
	10개를 기억시킨다.
	
	그리고 하나씩 꺼내서
	꺼낸것이 어떤 타입의 클래스인지를 판별해서 출력하세요.
 */

import static java.lang.Math.*;
public class Test05 {
	public Test05() {
		Figure[] fg = new Figure[10];
		for(int i = 0 ; i < fg.length ; i++ ) {
			int num = (int)(random()*11);
			Figure tmp = null;
			switch(num % 4) {
			case 0:
				tmp = new Figure();
				break;
			case 1:
				tmp = new Sagak();
				break;
			case 2:
				tmp = new Semo();
				break;
			case 3:
				tmp = new Dongle();
				break;
			}
			
			fg[i] = tmp;
		} // 배열이 완성 됬고...
		
		// 하나씩 꺼내서 검사하고 출력한다.
		for(int i = 0 ; i < fg.length ; i++ ) {
			String sType = "";
			if(fg[i] instanceof Sagak) {
				sType = "Sagak";
			} else if(fg[i] instanceof Semo) {
				sType = "Semo";
			} else if(fg[i] instanceof Dongle) {
				sType = "Dongle";
			} else if(fg[i] instanceof Figure) {
				sType = "Figure";
			}
			System.out.println(sType + " | " + fg[i]);
		}
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
