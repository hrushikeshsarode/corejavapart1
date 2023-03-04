package basicprogram;

class Subject {
	int javaMarks;
	int pythonMarks;
	static String subName = "Java";
	void displayMarks( ) {
		System.out.println("java marks: "+ javaMarks);
		System.out.println("python marks: "+ pythonMarks);
	}
}
public class Instancevariable {
	public void displayAge() {
		int age = 0;
		age += 10;
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instancevariable instancevariable = new Instancevariable();
		instancevariable.displayAge();
		
		Subject s = new Subject();
		s.javaMarks = 45;
		s.pythonMarks = 44;
	//	System.out.println("java marks: "+ s.javaMarks);
	//	System.out.println("python marks: "+ s.pythonMarks);
		s.displayMarks();
		
		System.out.println("Subject Name: "+ s.subName);
	}

}
