package basicprogram;

import java.util.Scanner;

public class MarksSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner scanner;
		scanner=new Scanner(System.in);
		System.out.println("Enter your marks: ");
		m=scanner.nextInt();
		switch (m/10) {
		case 10: 
			System.out.format("Your scored A+ grade");
		    break;
		case 9:
			System.out.format("Your scored A grade");
			break;
		case 8:
			System.out.format("Your scored B grade");
			break;
		case 7:
			System.out.format("Your scored C grade");
			break;
		case 6:
			System.out.format("Your scored D grade");
			break;
		case 5:
			System.out.format("Your scored E grade");
			break;
		default:
			System.out.println("You Failed");
		}
	}
}
