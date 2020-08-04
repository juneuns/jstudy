package day14;

public class Test03 {
	
	public Test03() {
		Object[] obj = new Object[5];
		obj[0] = "문자열";
		obj[1] = 100;
		obj[2] = 'a';
		obj[3] = 3.14;
		obj[4] = true;
		
		for(int i = 0 ; i < obj.length ; i++ ) {
			String str = "";
			if(obj[i] instanceof String) {
				str = "문자열";
			} else if(obj[i] instanceof Integer) {
				str = "정수";
			} else if(obj[i] instanceof Character) {
				str = "문자";
			} else if(obj[i] instanceof Double) {
				str = "실수";
			} else if(obj[i] instanceof Boolean) {
				str = "논리";
			}
			System.out.println(obj[i] + " : " + str + " 데이터");
		}
	}
	public static void main(String[] args) {
		new Test03();
	}

}
