package day23.source;

public class Student {
	private int no, java, db, web, jsp, total;
	private String name;
	
	public Student() {}
	public Student(int no, String name, int java, int db, int web, int jsp) {
		this.no = no;
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.jsp = jsp;
		setTotal();
	}
	public Student(int no, String name, int...score) {
		this.no = no;
		this.name = name;
		this.java = score[0];
		this.db = score[1];
		this.web = score[2];
		this.jsp = score[3];
		setTotal();
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		total = java + db + web + jsp;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student : no=" + no + ", name=" + name + 
				", java=" + java + ", db=" + db + ", web=" + web + ", jsp=" + jsp + 
				", total=" + total;
	}
	
}
