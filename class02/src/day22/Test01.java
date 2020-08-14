package day22;

/*
	10개의 문자열 데이터를 입력하고 
	내용을 확인해 보자.
 */
import java.util.*;
public class Test01 {

	public Test01() {
		HashSet set = new HashSet();
		set.add("고길동");
		set.add("둘리");
		set.add("고길동");
		set.add("희동이");
		set.add("철수");
		set.add("영희");
		set.add("마이콜");
		set.add("또치");
		set.add("도우너");
		set.add("마이콜");
		
		// 저장된 갯수 확인하고
		System.out.println("set.size() : " + set.size());
		
		// 데이터를 꺼내서 출력
		/*
			Set 계열은 데이터를 꺼내는 함수는 존재하지 않는다.
			따라서 Iterator 로 변환하던지 
			아니면 List 계열로 변환해서 사용해야 한다.
		 */
		
		
		// 방법 1 ] Iterator 로 변환해서 사용하는 방법
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String name = (String)itor.next();
			// Iterator 에서 데이터를 꺼내는 함수는 next() 함수인데 반환값 타입이 Object 이다.
			System.out.println(name);
		}
		
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 정렬한다.
		Collections.sort(list);
		System.out.println("\n# 정렬 후 출력");
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println("\n# 정렬 후 출력 2");
		for(Object o : set) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
