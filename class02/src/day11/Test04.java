package day11;

public class Test04 {
	public Test04() {
		// 사각형을 하나 만들고 면적을 출력해보자.
		Sagak s01 = new Sagak();
		int width = (int)(Math.random()*9 + 2);
		int height = (int)(Math.random()*9 + 2);
		
		s01.width = width;
		s01.height = height;
		s01.area = s01.width * s01.height;
		
		System.out.println("사각형 s01의 \n\t\t가로는 " + s01.width + 
							" 이고\n\t\t세로는 " + s01.height + 
							" 이고 \n\t\t면적은 " + s01.area + " 입니다.");
		System.out.println();
		
		
		Sagak s02 = new Sagak();
		s02.width = (int)(Math.random()*16 + 5);
		s02.height = (int)(Math.random()*16 + 5);
		s02.area = s02.width * s02.height;
		System.out.println("사각형 s02의 \n\t\t가로는 " + s02.width + 
				" 이고\n\t\t세로는 " + s02.height + 
				" 이고 \n\t\t면적은 " + s02.area + " 입니다.");
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

class Sagak {
	int width, height, area;
}
