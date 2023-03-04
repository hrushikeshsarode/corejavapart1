package oops;

public class Student {

	private int rno;
	private String name;
	private String city;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int rno, String name, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.city = city;
	}
}
