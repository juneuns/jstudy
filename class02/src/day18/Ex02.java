package day18;

import javax.swing.JOptionPane;

/*
	삼각형 클래스를 만드는데
	삼각형의 밑변이 같으면 같은 삼각형이 되도록 정의하고
	밑변 높이를 1 ~ 20 사이의 정수로 랜덤하게 만들어서
	삼각형 두개를 만들고
	만들어진 삼각형들을 비교해서
	같은지 여부를 출력하세요. -- equals() 오버라이드
	
	단, 3보다 작은 숫자가 발생하면	- 사용자정의 예외 만들기...
	사용자 정의 예외를 만들어서 처리하세요.
	15보다 큰 숫자는 NumberFormatException 으로 처리하세요.
	+
	클래스를 출력하면 클래스의 내용이 출력되게  - toString() 오버라이드
	함수를 오버라이드하세요.
 */
public class Ex02 {

	public Ex02() {
		int[] size = new int[4];
		for(int i = 0 ; i < 4 ; i++ ) {
			int no = (int)(Math.random()*20 + 1);
			try {
				if(no < 3) {
					// 이 경우도 JVM에게 강제로 예외 처리하라고 알려줘야 하는 경우에 해당한다.
					// 사용자 정의 예외로....
					throw new Excpt02();
				} else if(no > 15) {
					// 이 경우는 사용할 수 없는 숫자이므로 예외를 강제로 발생시켜준다.
					// 일반적인 경우에는 예외가 전혀아니므로 JVM 따로 처리할 수 없다.
					// 다만 이 프로그램의 경우 NumberFormatException 으로 처리하기로 했으니
					// JVM에게 강제로 처리하라고 알려준다.
					throw new NumberFormatException(); // 
				}
				
				size[i] = no;
			} catch(NumberFormatException e) {
				i--;
				e.printStackTrace();
			} catch(Excpt02 e) {
				i--;
				e.printStackTrace();
			}
		}
		
		// 삼각형에 필요한 사이즈는 정해졌으니 이제 삼각형을 만들고 비교해본다.
		Samgak s1 = new Samgak(size[0], size[1]);
		Samgak s2 = new Samgak(size[2], size[3]);
		
		String msg = s1.equals(s2) ? "같은 " : "다른 ";
		JOptionPane.showMessageDialog(null, "삼각형 s1과 s2 는 " + msg + "삼각형입니다.\ns1.width : " + s1.width + "\ns2.width : " + s2.width);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

class Samgak {
	int width, height;
	double area;
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	// 면적 구해주는 함수
	public void setArea() {
		area = width * height / 2.0;
	}
	
	// 밑변이 같으면 같은 삼각형으로 되게 equals() 오버라이드
	public boolean equals(Object o) {
		/*
			boolean bool = false;
			Samgak s1 = (Samgak) o;
			if(this.width == s1.width){
				bool = true;
			}
			return bool;
		 */
		return this.width == ((Samgak) o).width;
	}
}

class Excpt02 extends Exception {
	public String toString() {
		String s = getClass().getName();
        String message = "3보다 작은 숫자입니다.";
        return s + ": " + message;
		/*
		 * return (message != null) ? (s + ": " + message) : s;
		 */	
	}
}
