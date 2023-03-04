package basicprogram;

import java.util.Scanner;

public class SwitchOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char op;
		Scanner scanner;
		scanner=new Scanner(System.in);
		System.out.println("enter value of a :-");
		a=scanner.nextInt();
		System.out.println("enter value of b :-");
		b=scanner.nextInt();
		System.out.println("enter an Operator :-");
		op=scanner.next().charAt(0);
		switch (op) {
		case '+': 
			System.out.format("%d+%d=%d\n", a,b,a+b);
		    break;
		case'-':
			System.out.format("%d-%d=%d\n", a,b,a-b);
			break;
		case'*':
			System.out.format("%d*%d=%d\n", a,b,a*b);
			break;
		case'/':
			System.out.format("%d/%d=%d\n", a,b,a/b);
			break;
		case'%':
			System.out.format("%d%%d=%d\n", a,b,a%b);
			break;
		default:
			System.out.println("invalid");
		}
	}
}
