package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(30);
		a.add(2);
		a.add(23);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.remove(2));
		System.out.println(a);
		System.out.println(a.size());
		a.set(1, 34);
		System.out.println(a);
		a.add(2, 0);
		System.out.println(a);
		for(int i : a) {
			System.out.println(i + " ");
//			System.out.println();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(2);
		al.add(23);
		al.addAll(a);
		System.out.println(al);
	}

}
