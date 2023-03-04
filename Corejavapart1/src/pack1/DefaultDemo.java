package pack1;
class DefaultClass{			// parent class
	int a = 12;
	void display() {
		System.out.println("Default Class Variable "+a);
	}
}
class DefaultSub extends DefaultClass{		// child class
	void displaySub() {
		System.out.println("Default SubClass Variable "+a);
	}
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultSub d = new DefaultSub();		// Object of child class
		d.display();
		d.displaySub();
	}

}
