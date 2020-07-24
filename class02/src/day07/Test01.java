package day07;

public class Test01 {

	public static void main(String[] args) {
		// main({"abcd", "efgh"});
		
		// 정수 여섯개를 동시에 관리할 배열 noArr 을 만드세요.
		// 배열 선언형시 1 ] 데이터타입[] 변수이름 = new 데이터타입[갯수];
		
		int[] noArr = new int[6];
		
		// 배열의 데이터를 추출하는 방법
		//  	배열변수[위치값];
		// 배열의 길이를 알아내는 방법
		// 		배열변수.length;
		
		// 배열에 담긴 내용을 순차적으로 추출해보자.
		
		int len = noArr.length;
		for(int i = 0 ; i < len ; i++ ) {
			System.out.print(noArr[i] + " | ");
		}
		
		// new 라는 명령은 교과서적으로 Heap 영역에 인스턴스를 만드는 명령이다.
		// ==> new 명령은 힙에 필요한 것을 만들겠습니다. 만들어진 것의 주소는 만들고 알려드릴께요...
		// 
		
		
	}

}
