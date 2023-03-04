package oops;

public class Constructorex {

	String name;
	String city;
	int rollno;
	String course;
	
	//private Constructorex()
	public Constructorex() {
		System.out.println("Default");
		name = "Hrushikesh";
	}
//	Constructorex(String c){
//		city = c;
//		System.out.println("I stay at "+ city);
//	}
	Constructorex(String city){
		this.city = city;
		System.out.println("I stay at "+ city);
	}
	Constructorex(int r, String cr){
		rollno = r;
		course = cr;
		System.out.println("Roll no. "+rollno+" Course is "+course);
	}
	Constructorex(Constructorex a){
		System.out.println("Copy Constructor");
		rollno = a.rollno;
		course = a.course;
		System.out.println("copy2Roll no. "+rollno+" Course is "+course);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorex c = new Constructorex();
		System.out.println("My name is "+c.name);
		Constructorex c1 = new Constructorex("Mumbai");
		Constructorex c2 = new Constructorex(10, "Java");
		Constructorex c3 = new Constructorex(c2);
		System.out.println("Roll no.copy "+c3.rollno+" Course is "+c3.course);
	}

}
