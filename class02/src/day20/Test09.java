package day20;

import java.util.*;
public class Test09 {

	public Test09() {
		Vector vec = new Vector();
		
		int size = vec.size();
		System.out.println("vec size : " + size);
		
		for(int i = 0 ; i < 10 ; i++ ) {
			vec.add(10);
		}
		
		int len = vec.capacity(); // 데이터 입력 가능한 공간 수...
		System.out.println("1. " + len);
		
		vec.add(10);
		for(int i = 0 ; i < 9 ; i++ ) {
			vec.add(10);
		}
		len = vec.capacity(); // 데이터 입력 가능한 공간 수...
		System.out.println("2. " + len);
		
		vec.add(10);
		len = vec.capacity(); // 데이터 입력 가능한 공간 수...
		System.out.println("3. " + len);
		System.out.println("4. vec size : " + vec.size());
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
