package basicprogram;
class Student{
	int rollNo;
	String name;
	static String courseName;	//static variable
}

public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student.courseName="Java Full Stack";
		
		s1.rollNo = 1;
		s1.name = "stud1";
		
		s2.rollNo = 2;
		s2.name = "stud2";
		
		s3.rollNo = 3;
		s3.name = "stud3";
		
		System.out.println("S1 Roll No.= "+s1.rollNo+", S1 Name= "+s1.name+", S1 course name= "+s1.courseName);
		System.out.println("S2 Roll No.= "+s2.rollNo+", S2 Name= "+s2.name+", S2 course name= "+s2.courseName);
		System.out.println("S3 Roll No.= "+s3.rollNo+", S3 Name= "+s3.name+", S3 course name= "+s3.courseName);
		
		s2.courseName = "Python";	//course name is changed for every object even if I change it only for s2.
		s2.name = "ABC";
		System.out.println("After Change");
		System.out.println("S1 Roll No.= "+s1.rollNo+", S1 Name= "+s1.name+", S1 course name= "+s1.courseName);
		System.out.println("S2 Roll No.= "+s2.rollNo+", S2 Name= "+s2.name+", S2 course name= "+s2.courseName);
		System.out.println("S3 Roll No.= "+s3.rollNo+", S3 Name= "+s3.name+", S3 course name= "+s3.courseName);
		
	}

}
