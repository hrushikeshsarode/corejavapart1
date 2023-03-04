package oops;
final class FinalClass{
	public void display() {
	    System.out.println("final class");
	  }
}

class FinalMethods extends FinalClass{
	public final void display() {
	      System.out.println("final method");
	}
}

public class Final extends FinalMethod{
	public final void display() {
	    System.out.println("The final method is overridden.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Final f = new Final();
		final int AGE = 20;
		AGE = 25;
		System.out.println("Age "+AGE);
	}
}
