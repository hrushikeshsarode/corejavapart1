package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp(1, "Rutik", "Developer", 45000));
		al.add(new Emp(2, "Shreyas", "Manager", 350000));
		al.add(new Emp(3, "Meghraj", "Developer", 40000));
		al.add(new Emp(4, "Siddhesh", "Analyst", 65000));
		al.add(new Emp(5, "Hrushi", "Developer", 25000));
		
		List<String> li = al.stream().map(e->e.toString()).collect(Collectors.toList());
		System.out.println("Elements in employee list: "+li);
		
		Set<String> hs = al.stream().map(e->e.toString()).collect(Collectors.toSet());
		System.out.println("Elements in employee set: "+hs);
		
		Long count = al.stream().count();
		System.out.println("total count of employee:"+count);
		
		long count1 = al.stream().filter(b->b.getEname().startsWith("P")).count();
		System.out.println("Emp start eith S:"+count1);
		
		Object salary = al.stream().collect(Collectors.maxBy(Comparator.comparingInt(s->s.salary)));
		System.out.println("Emp max salary:"+salary);
		
		double salary3 = al.stream().collect(Collectors.averagingInt(s->s.salary));
		System.out.println("Emp avg salary:"+salary3);
		
		System.out.println("sort Emp by name:");
		al.stream().sorted((e1,e2) -> (e1.getEname().compareTo(e2.getEname()))).forEach(System.out::println);;
	}
	

}