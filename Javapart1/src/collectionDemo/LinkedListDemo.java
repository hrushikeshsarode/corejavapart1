package collectionDemo;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.addFirst(30);
		list.addLast(5);
		list.add(40);
		list.add(50);
		System.out.println("unsorted list "+list);
		list.sort(Comparator.naturalOrder());
		System.out.println("sorted list "+list);
		
		int element = 10;
		int ans = -1;
		for(int i=0; i< list.size(); i++) {
			int listElement = list.get(i);
			if(listElement == element) {
				ans = i;
				break;
			}
		}
		if(ans == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Element found in linked list at "+ans+" Position");
		}
		
	}

}