package basicprogram;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, x, rem, a = 0;
		System.out.println("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		x = num;
		while(num>0) {
			rem = num % 10;
			num = num/10;
			a = a + rem * rem * rem;
		}
		if (x == a) {
			System.out.println("It is armstrong number");
		}else {
			System.out.println("It is not armstrong number");
		}
	}

}
