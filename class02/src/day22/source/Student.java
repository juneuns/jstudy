package day22.source;

public class Student implements Comparable {
	private String name;
	private int ban, score;
	
	public Student() {}
	public Student(String name, int ban, int score) {
		this.name = name;
		this.ban = ban;
		this.score = score;
	}
	
	public int compareTo(Object o) {
		return name.compareTo(((Student) o).getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "[ Student ] name = " + name + ", ban = " + ban + ", score = " + score;
	}
	
}
