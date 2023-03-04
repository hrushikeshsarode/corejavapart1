package collectionDemo;
import java.util.Stack;

public class StackRev {

	public String revStr(String s) {
		if (s.equals("") || s == null) {
			return s;
		}
		Stack<Character> c = new Stack<>();
		char a[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			c.push(s.charAt(i));	//	using StringBuilder
//			c.push(a[i]);		//	using array

		}
		StringBuilder sb = new StringBuilder();
		while (!c.isEmpty()) {
		 sb.append(c.pop());
		}
		return sb.toString();
		
//		int i = 0;
//		while (!c.isEmpty()) {
//			a[i++] = c.pop();
//		}
//		return String.copyValueOf(a); // to convert array to String format
	}

	public static void main(String[] args) {
//		String s ="";
		String s = "Welcome JAVA.";
//		System.out.println("Reverse String : "+StackRev.revStr(s));
		StackRev sr = new StackRev();
		System.out.println(sr.revStr(s));
//		String str = revStr(s);
//		System.out.println(str);

	}

}