package basicprogram;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int result = a>b? a: b;
		System.out.println("max " +result);
		
		int c =  3;
	
		
		int res = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max " + res);
	}

}
