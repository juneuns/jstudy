package day30.network;

import java.net.*;
/*
	네트워크에서 가장 중요한 요소는 ip 주소이다.
	자바는 ip 주소의 정보를 관리하는 클래스를 제공하고 있다.
		
		 InetAddress
		 
	실습 ]
		
		1. 내 컴퓨터의 아이피를 알아내자.
		2. naver 서버의 ip 주소를 알아내자.
 */
public class Test01 {

	public Test01() {
		/*
			생성방법
		 		==> 이 클래스는 생성자를 감춰놓은 클래스 형태이고
		 			이런 경우는 객체를 만드는 방법은 
		 				1. 상속받아서 클래스를 제작하고
		 					상속받은 클래스를 new 시켜서 그 클래스 타입으로 받아서 사용하는 방법
		 					
		 				2. 소속함수중 속성이 static 이고 반환값이 자기자신인 함수를 찾아서 사용하는 방법
		 				
		 			우리는 2 방법을 사용해서 처리하기로 한다.
		 			
		 			따라서
		 			
		 			getByName(String host)
		 			==> 지정한 주소를 이용해서 IP 주소를 관리
		 			getLocalHost()
		 			==> 현재 시스템의 IP 주소를 관리
		 */
		System.out.println("### 내 컴퓨터 정보 ###");
		getMyIp();
		System.out.println("### 네이버 서버 정보 ###");
		getNaverIp();
	}
	
	// 내 컴퓨터 아이피 알아내고 출력해주는 함수
	public void getMyIp() {
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
			/*
				InetAddress 클래스는 정보를 관리하는 클래스이므로
				정보를 꺼내는 함수가 중요함수
				
				1. IP 주소
					getHostAddress()
					
				2. 도메인 주소(장비에 부여된 이름)
					getHostName()
			 */
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			System.out.println("아이피 : " + ip);
			System.out.println("도메인 : " + name);
			
		} catch(Exception e) {}
		
		
	}
	
	// 네이버 아이피 알아내고 출력해주는 함수
	public void getNaverIp() {
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName("www.naver.com");
//			inet = InetAddress.getByName("Class02T01");
			
			String ip = inet.getHostAddress();
			String name = inet.getHostName();
			
			System.out.println("아이피 : " + ip);
			System.out.println("도메인 : " + name);
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
