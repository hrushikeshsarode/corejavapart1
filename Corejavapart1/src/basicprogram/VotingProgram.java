package basicprogram;

public class VotingProgram {

	public static void main(String[] args) {
		int a = 19;
		int b = 1;
		int c = 20;
		if (b>=18) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("NO");
		}
		
		
		if(a>b && a>c) {
			System.out.println("max is a");
		} else if (b>a && b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}