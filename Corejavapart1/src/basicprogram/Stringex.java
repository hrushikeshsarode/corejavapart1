package basicprogram;

import java.util.Arrays;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "hello";
		System.out.println(st);
		
		String s1 = "Core ";
		String s2 = "Java";
		String s3 = "   Hrushikesh Sarode   ";
		String s4 = "";
		String s = "java";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Length: "+ s2.length());
		System.out.println("Substring: "+ s3.substring(3, 9));
		System.out.println("Uppercase: "+ s2.toUpperCase());
		System.out.println("String is Null: "+s4.isBlank());
		char arr[] = new char[4];
		s2.getChars(0, 4, arr, 0);
		System.out.println("GetChars: "+Arrays.toString(arr));
		System.out.println("Comparison: "+s.compareTo(s2));
		System.out.println("Equals: "+s.equals(s2));
		System.out.println("Equals: "+s.equalsIgnoreCase(s2));
		System.out.println("Strats with: "+s2.startsWith("Ja"));
		System.out.println("Ends with: "+s3.endsWith("  "));
		System.out.println("Replace: "+s3.replace(s3, "Hrushi Sarode"));
		System.out.println("Repeat: "+s1.repeat(5));
		System.out.println("CharAt: "+s3.charAt(0));
		System.out.println("Trim: "+s3.stripLeading());
		System.out.println("Trim: "+s3.stripTrailing());
	}

}
