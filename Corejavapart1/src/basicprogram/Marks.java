package basicprogram;

import java.util.Scanner;

class MarksException extends Exception{
	String s;
	public MarksException(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return s;
	}
	
}
//class MarksException extends Exception{
//	public MarksException(String s) {
//		super(s);
//	}
//}
public class Marks {
	static void marksChecker(int m) throws MarksException{
		if(m<0 || m>100) {
			throw new MarksException("Invalid Marks. ");
		} else {
			System.out.println("Valid Marks. ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int m = sc.nextInt();
		try {
			marksChecker(m);
		} catch(MarksException e) {
//			System.out.println(e);
			System.out.println(e.toString());
		}
	}

}
