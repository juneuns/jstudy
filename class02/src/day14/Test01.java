package day14;

import static java.lang.Math.*;

import java.util.Arrays;
public class Test01 {
	public Test01() {
		Test01_01 t1 = new Test01_01();
		System.out.println(t1.no);
		System.out.println(t1.getRndm());
		System.out.println(t1); // 변수를 바로 출력하게 되면 해당 변수가 가지고있는 toString() 함수가 호출이 된다.
	}
	public static void main(String[] args) {
		new Test01();
	}

}

class Test01_01 {
	int no = 100;
//	Object o = new Object();
	public int getRndm() {
//		System.out.println(Arrays.toString(new int[] {1, 2}));
//		System.out.println(o.toString());
		return (int)(random()*13 + 3);
	}
	
	public String toString() {
		return "이 클래스는 변수 no가 " + no + " 이고 getRndm() 를 멤버로 가지는 Test01_01 클래스 입니다.";
	}
}
