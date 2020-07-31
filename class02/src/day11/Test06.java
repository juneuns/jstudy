package day11;

public class Test06 {
	Person[] friend;
	String[] name, tel, mail;
	int[] age;
	char[] gen;
	
	public Test06() {
//		setOne();
		
		setMany(); // ==> 배열이 초기화 됬다.
//		toPrint();
		
		// 문제 1 ]
		// 친구 이름을 입력하면 친구의 정보만 출력하는 프로그램을 작성하세요.
		
	}
	
	// 친구 이름들만 출력해주는 함수
	public void printName() {
		for(int i = 0 ; i < friend.length ; i++ ) {
			
		}
	}
	
	// 1단계 - 한사람 데이터를 만들어보자. 출력까지 해보자.
	public void setOne() {
		// 객체 만들고
		Person p1 = new Person();
		// 데이터 초기화 하고
		p1.setData("홍길동", "010-1111-1111", "hong@increpas.com", 18, 'M');
		
		// 객체에서 변수 접근해서 출력해본다.
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %3d\n성    별 : %2s", 
							p1.name, p1.tel, p1.mail, p1.age, p1.gen == 'M' ? "남자" : "여자"
							);
	}
	
	// 전역 변수의 데이터를 초기화해주는 함수
	public void setArray() {
		name = new String[] {"아이유", "윤요셉", "유병욱", "오혜찬", "이지우"};
		tel = new String[] {"010-1111-1111", "010-5069-8600", "010-2587-2304", 
												"010-7648-5213", "010-3843-4798"};
		mail = new String[] {"iu@increpas.com", "joseph@increpas.com", "wook@increpas.com", 
												"chan@incerpas.com", "jiwoo@increpas.com"};
		age = new int[] {28, 33, 29, 28, 26};
		gen = new char[] {'F', 'M', 'M', 'M', 'M'};
	}
	
	// 다수의 친구의 정보를 저장해보자.
	public void setMany() {
		// 데이터 배열 초기화 해주고
		setArray();
		// 친구 배열 초기화 해주고 ==> 데이터 기억할 공간만 확보한 상태가 된다.
		friend = new Person[name.length];
		
		// 친구 배열에 데이터 채워주고
		for(int i = 0 ; i < friend.length ; i++ ) {
			// 확보한 공간에 한개씩 인스턴스 채워주고
			friend[i] = new Person();
			
			// 인스턴스의 변수에 데이터를 채워주고
			/*
			friend[i].name = name[i];
			friend[i].tel = tel[i];
			friend[i].mail = mail[i];
			friend[i].age = age[i];
			friend[i].gen = gen[i];
			*/
			friend[i].setData(name[i], tel[i], mail[i], age[i], gen[i]);
		}
	}
	
	// 친구들 정보를 출력해주는 함수
	public void toPrint() {
		for(int i = 0 ; i < friend.length ; i++ ) {
			System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %3d\n성    별 : %2s\n", 
					friend[i].name, friend[i].tel, friend[i].mail, friend[i].age, friend[i].gen == 'M' ? "남자" : "여자");
			System.out.println("-----------------------------------------");
		}
	}
	// 친구들 정보를 출력해주는 함수
	public void toPrint(String name) {
		int idx = 0 ;
		for(;idx < friend.length ; idx++ ) {
			if(friend[idx].name.equals(name)) break;
		}
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %3d\n성    별 : %2s\n", 
				friend[idx].name, friend[idx].tel, friend[idx].mail, friend[idx].age, friend[idx].gen == 'M' ? "남자" : "여자");
		System.out.println("-----------------------------------------");
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}

class Person {
	String name, tel, mail;
	int age;
	char gen;
	
	public void setData(String name, String tel, String mail, int age, char gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.gen = gen;
	}
}