package oops;

class Student1{
	int sid = 62;
	void display() {
		System.out.println("Roll no. "+sid);
	}
}

class EnggStudent extends Student1{
	String spec = "IT";
	void displaySpec() {
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnggStudent e = new EnggStudent();
		e.display();
		e.displaySpec();
	}

}
