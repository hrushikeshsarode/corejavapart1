package basicprogram;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Lines: ");
		int n = sc.nextInt();
		
		// Print number of lines number of times
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		// Starting from 1 to line number
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		// Starting from 1 
		int count = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}

}
