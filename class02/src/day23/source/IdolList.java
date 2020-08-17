package day23.source;

import java.util.ArrayList;

public class IdolList {
	private ArrayList<Integer> noList;
	private ArrayList<String> names;
	
	public IdolList() {
		noList = new ArrayList<Integer>();
		names = new ArrayList<String>();
	}
	
	public ArrayList<Integer> setNoList(){
		for(int i = 0 ; i < 5 ; i++ ) {
			noList.add(1001 + i);
		}
		return noList;
	}
	
	public ArrayList<String> setNames(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("우지윤");
		names.add("안지영");
		names.add("린다G");
		names.add("아이린");
		names.add("조이");
		
		return names;
	}
}
