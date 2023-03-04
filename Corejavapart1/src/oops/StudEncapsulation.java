package oops;

public class StudEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student s = new Student();
//		s.setRno(10);
//		s.setName("Hrushikesh");
//		s.setCity("Karjat");
//		System.out.println("Student rno: "+s.getRno());
//		System.out.println("Student name: "+s.getName());
//		System.out.println("Student city: "+s.getCity());
		
		Student s = new Student(20, "Hrushi", "KJT");
		System.out.println("Student rno: "+s.getRno());
		System.out.println("Student name: "+s.getName());
		System.out.println("Student city: "+s.getCity());
		
		s.setRno(30);
		System.out.println("Student rno: "+s.getRno());
	}

}
