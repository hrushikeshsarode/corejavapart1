package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Jack");
		a.add("John");
		a.add("Jill");
		a.add(1, "Jini");
		a.set(3, "abc");
		System.out.println(a);
		System.out.println(a.size());
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList("jack", "jill", "john", "xyz"));
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al);
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
	}

}
