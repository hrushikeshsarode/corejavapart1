package basicprogram;

import java.util.Scanner;

class MinimumAccountBalance extends Exception{
	String message;
	public MinimumAccountBalance(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "MinimumAccountBalance [message=" + message + "]";
	}
}
public class UserDefinedException {
	static double current_balance = 100;
	public static void main(String[] args) throws MinimumAccountBalance {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to withdraw ");
		int n = s.nextInt();
		try {
			if (current_balance < n) {
				throw new MinimumAccountBalance("Insufficient funds ! Your current Balance is " + current_balance);
			}
			else {
				System.out.println("Please Take the Money: "+n);
			}
		}
		catch(MinimumAccountBalance mab) {
			mab.printStackTrace();
		}
	}

}
