package collectionDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(5);
		hs.add(10);
		hs.add(2);
		System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("ABC");
		hs1.add("PQR");
		hs1.add("LMN");
		hs1.add("XYZ");
		System.out.println(hs1);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		System.out.println(ts);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "abc");
		hm.put(2, "ijk");
		hm.put(3, "xyz");
		hm.putIfAbsent(4, "Java");
		hm.putIfAbsent(2, "Python");
		
		hm.put(6, "abc");
		hm.put(2, "xyz");
		hm.put(3, "mno");
		hm.remove(2);
		System.out.println(hm);
		hm.putIfAbsent(2, "xyz");
		hm.putIfAbsent(1, "xyz");
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm);
	}

}
