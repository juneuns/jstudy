package day12;

public class Song {
	String songName;
	String singer;
	String writer;
	String runTime; // "00:00:00"
	
	public Song() {
		// 생성자함수는 클래스이름과 동일한 이름을 사용해야하고
		// 반환값이 존재하면 절대로 아니되옵니다.
		
		// 모든 노래는 블랙핑크의 아무거나로 셋팅이 되게 한다.
		songName = "아무거나...";
		singer = "블랙핑크";
		writer = "테디";
		runTime= "00:03:05";
	}
	
	// 기본 생성자 함수를 오버로딩한다.
	// 노래가 가지는 기본 정보를 가지고 객체를 만들도록 할려고 하니....
	public Song(String songName, String singer, String writer, String runTime) {
		this.songName = songName;
		this.singer = singer;
		this.writer = writer;
		this.runTime = runTime;
	}
	
	// 곡의 정보를 출력하는 전담 처리함수
	public void toPrint() {
		// 출력에 필요한 정보는 전역변수에 선언이 되어있으므로
		// 전역변수에 접근해서 출력하면 된다.
		System.out.printf("%-30s - %-25s - %-25s - %-8s\n", songName, singer, writer, runTime);
	}
}
