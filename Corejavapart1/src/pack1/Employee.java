package pack1;

public class Employee {
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	
	public void display() {
		System.out.println("ENo. "+eno+" Ename "+ename);
	}
}
