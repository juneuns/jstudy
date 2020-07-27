package day08;

public class Test05 {

	public static void main(String[] args) {
		// 문자열 만드는 방법 1
		String str1 = "abcd";
		// 문자열 만드는 방법 2
		String str2 = new String("efgh");
		
		// 문자열 결합연산 : + 연사자를 사용하면 된다.
		String str3 = str1 + str2; // ==> "abcdefgh"
		
		// charAt
		char ch = str3.charAt(5);
		System.out.println("str3.charAt(5) : " + ch);
		
		// length()
		int len = str3.length();
		System.out.println("str3 length : " + len);
		
		// indexOf("cde")
		int idx = str3.indexOf("cde");
		System.out.println("indexOf cde : "  + idx);
		
		// indexOf("cb")
		idx = str3.indexOf("cb");
		System.out.println("indexOf cb : " + idx);
		
		// indexOf('z')
		idx = str3.indexOf('z');
		System.out.println("indexOf z : " + idx);
		
		
		// str3에서 "cdefgh" 추출하기
		 System.out.println("str3.substring(2) : " + str3.substring(2));
		 
		 // str3에서 "def" 문자열 추출하기
		 System.out.println("str3.substring(str3.indexOf('d'), str3.indexOf('f') + 1) : " + str3.substring(str3.indexOf('d'), str3.indexOf('f') + 1));
		 
		 // str1 == new String("abcd")
		 System.out.println("str1 == new String(\"abcd\") : " + (str1 == new String("abcd")));
		 
		 // str1.equals("abcd")
		 System.out.println("str1.equals(\"abcd\") : " + str1.equals("abcd"));
	}

}
