package basicprogram;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Lines: ");
		int n = sc.nextInt();
		
		// Star Right Triangle Program
//		for(int i=1; i<=n; i++) 
//		{
//			for(int j=1; j<=i; j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// Star Right Triangle Down Program
//		for(int i=n; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// Star Left Triangle Program
		for(int i=1; i<=n; i++)
		{
			for(int j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}