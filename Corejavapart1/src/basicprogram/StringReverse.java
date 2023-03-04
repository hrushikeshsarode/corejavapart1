package basicprogram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.next();
		String rev ="";
		int b = st.length();
		int c = b - 1;
		char ch;
		for (int i = 0; i <= c; i++) {
			ch = st.charAt(i);
			rev = ch + rev;
		}
		System.err.println(rev);*/
		
		String s = "Hello";
		String rev ="";
		for(int i=0; i<=s.length()-1; i++) {
			rev=s.charAt(i) + rev;
		}
		System.out.println(rev);
		
		// using StringBuilder
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder rev1=s1.reverse();
		System.out.println(rev1);
		
		// using toCharArray
		char[] arr=s.toCharArray();
		//System.out.println(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
