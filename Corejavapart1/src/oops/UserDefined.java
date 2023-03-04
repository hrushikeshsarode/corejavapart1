package oops;

import java.util.Scanner;

class Addition{
	int a, b;
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.println("Enter the numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}
}
class Subtract extends Addition{
	//int a, b;
	//Scanner s = new Scanner(System.in);
	void sub() {
		//System.out.println("Enter the numbers: ");
		//a = s.nextInt();
		//b = s.nextInt();
		int sub = a-b;
		System.out.println("Sub is "+sub);
	}
}
public class UserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subtract s = new Subtract();
		s.add();
		s.sub();
	}

}
