package basicprogram;

public class StaticVariable {
	public static void main(String args[]) {
		//static int z = 12;
		Student1 s1 = new Student1();
		s1.showData();
		Student1 s2 = new Student1();
		s2.showData();
		Student1 s3 = new Student1();
		s3.showData();
		Student1 s4 = new Student1();
		s4.showData();
		//System.out.println("z = " + z);
	}
}

class Student1 {
	int a;
	static int b; // initialized to zero only when class is loaded not for each object created.

	Student1() {

		b++;
	}

	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
}
