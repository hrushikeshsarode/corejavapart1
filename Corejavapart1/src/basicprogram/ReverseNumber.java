package basicprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 123456, reverse = 0;
		// we have not mentioned the initialization part of the for loop
		for (; number != 0; number = number / 10) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of the given number is: " + reverse);

		// pallindrome
		int num2 = 343, rem2, rev2 = 0, num2copy = num2;
		while (num2 > 0) {
			rem2 = num2 % 10;
			rev2 = rev2 * 10 + rem2;
			num2 /= 10;
		}
		System.out.println(rev2);
		if (num2copy == rev2)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
