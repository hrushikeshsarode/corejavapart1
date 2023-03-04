package basicprogram;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("For Loop");
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("While Loop");
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Do While Loop");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j<=5);
	}

}
