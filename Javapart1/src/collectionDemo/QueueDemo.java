package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		System.out.println("Poll method "+q.poll());
		q.add("abc");
		q.add("efg");
		q.add("ijk");
		q.add("lmn");
		q.add("pqr");
		q.add("xyz");
		System.out.println(q);
		
		System.out.println("Poll method: "+q.poll());
		System.out.println(q);
		
		System.out.println("Peeked: "+q.peek());
		System.out.println("Poll method: "+q.poll());
		System.out.println(q);
		
		System.out.println("Peeked: "+q.peek());
		System.out.println(q);
		
		System.out.println("Element: "+q.element());
		System.out.println(q);
		
		System.out.println("Iterator Method: ");
		Iterator itr = q.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
