package basicprogram;

import java.util.Scanner;

public class AddSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b, res;
		char choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.next().charAt(0);
			switch (choice) {
			case '1': 
				System.out.format("Enter two numbers: ");
				a = sc.nextFloat();
				b = sc.nextFloat();
				res = a + b;
				System.out.println("Result is "+res);
			    break;
			case'2':
				System.out.format("Enter two numbers: ");
				a = sc.nextFloat();
				b = sc.nextFloat();
				res = a - b;
				System.out.println("Result is "+res);
				break;
			case'3':
				System.out.format("Enter two numbers: ");
				a = sc.nextFloat();
				b = sc.nextFloat();
				res = a * b;
				System.out.println("Result is "+res);
				break;
			case'4':
				System.out.format("Enter two numbers: ");
				a = sc.nextFloat();
				b = sc.nextFloat();
				res = a / b;
				System.out.println("Result is "+res);
				break;
			case'5':
				System.exit(0);
			default:
				System.out.println("Invalid Input");
			}
		} while (choice!=5);
	}

}
