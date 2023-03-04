package basicprogram;

public class ExceptionEx {

	static void Age(int age) {
		if (age<18) {
			throw new ArithmeticException("Access denied must be above 18 years");
		}
		else {
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age(14);
	}

}
