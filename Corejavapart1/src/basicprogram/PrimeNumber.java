package basicprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 31;
		boolean a = false;
		for (int i = 2; i <= num/2; ++i) {
			if(num % i == 0) {
				a = true;
				break;
			}
		}
		if(a) {
			System.out.println("It is a not a prime number");
		}
		else {
			System.out.println("It is a prime number");
		}
		
		
		int n = 50, count;
		for (int j = 2; j <= n; ++j) {
			count = 0;
			for(int b = 2; b <= j/2; ++b) {
				if (j % b == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(j);
			}
		}
	}

}
