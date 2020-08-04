package day13;

public class Test08 {
	public Test08() {
		/*
		Square nemo1 = new Square(5);
		Rectangle nemo2 = new Rectangle(10, 5);
		nemo1.toPrint();
		nemo2.toPrint();
		Nemo n1 = nemo1;
		Nemo n2 = nemo2;
		n1.toPrint();
		n2.toPrint();
		
		Nemo[] nArr = {n1, n2};
		
		for(int i = 0 ; i < nArr.length ; i++ ) {
			nArr[i].toPrint();
		}
		 */
		
		/*
		 	문제 1 ]
		 		
		 		0 ~ 10 사이의 수를 랜덤하게 10개를 발생시켜서
		 		홀수가 나오면 정사각형(Square), 
		 		짝수가 나오면 사각형 (Rectangle)
		 		을 만들어서 Nemo 타입의 배열에 입력하고
		 		하나씩 꺼내서 출력하세요.
		 */
		int[] pb = new int[10];
		for(int i = 0 ; i < pb.length ; i++ ) {
			pb[i] = (int)(Math.random()*11);
		}
		
		Nemo[] nemo = new Nemo[10]; // Nemo라는 데이터가 들어가 공간만 확보한 상태
		// Nemo n = new Square(3);	----- O
		/*
		Nemo n1 = new Square(5);
		Rectangle r1 = (Rectangle) n1;
		*/
		// 각 방에 상속받은 클래스의 인스턴스 를 만들고 채워넣으면 된다.
		for(int i = 0 ; i < nemo.length ; i++ ) {
			int no1 = (int)(Math.random()*13 + 3);
			Nemo n = null;
			if(pb[i] % 2 == 1) { // 홀수인 경우. 정사각형을 만들어서 넣어준다.
				n = new Square(no1);
//				nemo[i] = new Square(no1);
			} else { // 짝수인 경우고 직사각형을 만들어서 넣어주면 된다.
				int no2 = (int)(Math.random()*13 + 3);
				n = new Rectangle(no1, no2);
//				nemo[i] = new Rectangle(no1, no2);
			}
			nemo[i] = n;
		} // 이러면 Nemo 배열이 완성이 됬고
		
		// 출력을 해주면 된다. 
		// 그런데 우리는 출력하는 함수를 만들어 놨고 
		// 그 함수의 기능을 상속받은 클래스에서 수정을 했으므로
		// 그 함수만 호출하면 해당 인스턴스의 내용이 출력이 될 것이다.
		for(int i = 0 ; i < nemo.length ; i++ ) {
//			nemo[i].toPrint();
			Nemo n = nemo[i];
			n.toPrint();
		}
		
	}
	public static void main(String[] args) {
		new Test08();
	}

}

class Nemo {
	public void toPrint() {
		System.out.println("이것은 네모입니다.");
	}
}

class Square extends Nemo { // 정사각형
	int size;
	int area;
	
	public Square() {}
	public Square(int size) {
		this.size = size;
		area = size * size;
	}
	
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로와 세로가 %4d 이고, 넓이가 %8d 인 정사각형입니다.\n", 
							size, area
						);
	}
}

class Rectangle extends Nemo { // 직사각형
	int width;
	int height;
	int area;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		area = width * height;
	}
	
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %4d 이고, 세로가 %4d 이고 넓이가 %8d 인 사각형입니다.\n", 
				width, height, area
				);
	}
}