package basicprogram;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		String number = a % 2 == 0 ? "even" : "odd";
		System.out.println("Number is "+number);
		
		// Voting program
		int age = 25;
		String Message = (age>18) ? "You are eligible" : "You are not eligible";
		System.out.println("Voting : "+Message);
	}

}
