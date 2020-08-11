package day19;

public class Test01 {

	public Test01() {
		Object obj = 10;
		/*
			먼저 리터럴 풀에 담긴 데이터를 클래스 타입으로 변형 시켜줘야 한다.
				int ===> Integer
			자동 형변환이 된다.
				Integer ===> Object 
				
		 */
		
		Object str = "abcd";
		
		String str1 = (String)str;
		
		Integer no = null;
		
		int num = no;
//		int num;
		
		System.out.println(num);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
