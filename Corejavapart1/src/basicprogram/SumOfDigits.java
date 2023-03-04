package basicprogram;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum = 0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num > 0) {
			
			int rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println("Sum is "+sum);
	}

}
