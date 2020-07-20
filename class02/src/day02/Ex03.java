package day02;

/*
	3. 	74232원을 지불을 해야한다.
		우리나라 화폐단위로 각 화폐단위가 몇개가 필요한지 계산해서 출력하세요.
		단, 화폐는 5만원, 만원, 오천원, 천원, 오백원, 백원, 십원 의 단위만 계산하기로 한다.
		
		산술 연산자를 사용해서 해결하세요.
 */
public class Ex03 {
	public static void main(String[] args) {
		int money = 74232;
		int tmp = money;
		
		// 오만원권
		int oman = tmp / 50000;
		// 오만원권을 빼고 남은 금액
		tmp %= 50000;
		
		// 만원권
		int man = tmp / 10000;
		// 만원권을 빼고 남은 금액
		tmp %= 10000;
		
		// 오천원권
		int ochun = tmp /5000;
		tmp %= 5000;
		
		// 천원권
		int chun = tmp / 1000;
		tmp %= 1000;
		
		// 오백원
		int obeak = tmp / 500;
		tmp %= 500;
		
		// 백원
		int beak = tmp / 100;
		tmp %= 100;
		
		// 십원
		int sip = tmp / 10;
		
		System.out.printf("금액 %7d원은 \n\t오만원권 %2d장,\n\t만원권 %2d장,\n\t오천원권 %2d장,"+
						"\n\t천원권 %2d장,\n\t오백원권 %2d개,\n\t백원권 %2d개,\n\t십원권 %2d개\n를 지불해야합니다.", 
						money, oman, man, ochun, chun, obeak, beak, sip);
	}
}
