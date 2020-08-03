package day12;

/*
	1. 	노래한곡을 저장할 클래스를 정의하고
			곡명, 가수, 작곡가, 재생시간(문자열)
		앨범 한 장(12곡) 을 저장할 배열을 만들고
		내용을 출력하는 프로그램을 작성하세요.
	
	2. 	곡 명을 입력하면 해당 곡의 정보를 출력하도록 하세요.
	
 */
public class Ex01 {

	public Ex01() {
		Song[] album = new Song[12];
		// 이 상태는 배열의 각 방에 데이터가 채워진 것은 아니고
		// 데이터를 채울 방만 준비해놓은 상태가 된다.
		// 따라서 각방에는 데이터를 new 시켜서 채워줘야한다.
		
		// 데이터 준비하고
		String[] songName = {"INTRO : Calling", "Stay Gold", "Boy With Luv -Japanese ver.-",
							"Make It Right -Japanese ver.-", "Dionysus -Japanese ver.-",
							"IDOL -Japanese ver.-", "Airplane pt.2 -Japanese ver.-",
							"FAKE LOVE -Japanese ver.-", "Black Swan -Japanese ver.-",
							"ON -Japanese ver.-", "Lights", "Your eyes tell"};
		String singer = "방탄소년단";
		String writer = "RM";
		String[] runTime = {
							"00:00:30", "00:03:07", "00:04:25", "00:03:16",
							"00:03:48", "00:04:12", "00:03:27", "00:03:02",
							"00:04:05", "00:03:54", "00:04:12", "00:03:57"
							};
		
		// 각 방에다 데이터를 채워넣는다.
		for(int i = 0 ; i < album.length ; i++ ) {
			album[i] = new Song(songName[i], singer, writer, runTime[i]);
		}
		
		// 출력한다. 
		// 이미 클래스에 자신의 내용을 출력하는 기능을 구현해 놓았으므로 사용하면 된다.
		for(int i = 0 ; i < album.length ; i++) {
			album[i].toPrint();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
