package day15;

public class Dahyungsung {
	public Dahyungsung() {
		Korean k = new Seoul();
		Korean k1 = new South();
		Korean k2 = new North();
		
		Seoul s1 = (Seoul) k;
		South s2 = (South) k;
	}

	public static void main(String[] args) {
		new Dahyungsung();
	}

}

class Korean {
	String local = "한반도";
}

class South extends Korean {
	String nam = "남쪽";
}

class North extends Korean {
	String buk = "북쪽";
	
}

class Seoul extends South {
	String city = "서울";
}
