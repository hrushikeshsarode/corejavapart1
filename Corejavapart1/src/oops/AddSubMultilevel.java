package oops;

import java.util.Scanner;

class Add {
	int a, b;
	Scanner s = new Scanner(System.in);

	void add() {
		System.out.println("Enter the numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		int c = a + b;
		System.out.println("Addition = "+c);
	}
}

class Sub extends Add {
//	int a, b;
//	Scanner s = new Scanner(System.in);

	void subb() {
		
//		System.out.println("a and b");
//		a = s.nextInt();
//		b = s.nextInt();
//		int c = a - b;
		System.out.println("Subtraction = "+(a-b));
	}
}

class Mul extends Sub {
//	int a, b;
//	Scanner s = new Scanner(System.in);

	void mul() {
//		System.out.println("a and b");
//		a = s.nextInt();
//		b = s.nextInt();
//		int c = a * b;
		System.out.println("Multiplication = "+(a*b));
	}
}

public class AddSubMultilevel {

	public static void main(String[] args) {
		Mul s = new Mul();
		s.add();
		s.subb();
		s.mul();
	}
}