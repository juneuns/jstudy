package day11;

import java.sql.Date;

public class Test07 {
	public Test07() {
		String[] name = {"홍길동", "고길동", "둘리", "희동이", "도우너"};
		String[] id = {"hong", "gho", "dooly", "donyee", "dounu"};
		
		Memb[] memb = new Memb[name.length];
		
		for(int i = 0 ; i < name.length ; i++ ) {
			memb[i] = new Memb();
			memb[i].setName(name[i]);
			memb[i].setMno(1001 + i);
			memb[i].setId(id[i]);
		}
		
		for(Memb m : memb) {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		/*
		int[] num; // 변수만 준비한 상태
		num = new int[5]; // 데이터를 기억할 공간을 준비한 상태...
		*/
		
		new Test07();
	}

}

class Memb {
	private int mno;
	private String name;
	private String id;
	private String pw;
	private String mail;
	private String tel;
	private String addr;
	private char gen;
	private String birth;
	private Date joinDate;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		return "Memb  : mno=" + mno + ", name=" + name + ", id=" + id + ", pw=" + pw + ", mail=" + mail + ", tel=" + tel
				+ ", addr=" + addr + ", gen=" + gen + ", birth=" + birth + ", joinDate=" + joinDate ;
	}
	
}
