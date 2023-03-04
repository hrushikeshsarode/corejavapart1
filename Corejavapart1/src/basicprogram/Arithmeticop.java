package basicprogram;

import java.util.Scanner;

public class Arithmeticop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter value of a and b: ");
//		int a = s.nextInt();
//		int b = s.nextInt();
//		System.out.println("Enter your percentage: ");
//		float per = s.nextFloat();
		System.out.println("Enter your name: ");
		String name = s.nextLine();
		char ch = name.charAt(0);
//		System.out.println("Sum = "+(a+b));
//		System.out.println("Percentage = "+per);
		System.out.println("Name = "+name);
		System.out.println("Char = "+ch);
	}

}
