package collectionDemo;
import java.util.Comparable;
import java.util.PriorityQueue;
class Student1{
	String name;
	int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Student1(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
}
class GradeComparable implements Comparable<StudentCRUD>{
	public int compareTo(StudentCRUD s1, StudentCRUD s2) {
		if(s1.grade<s2.grade) {
			return 1;
		}
		else if(s1.grade>s2.grade) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<StudentCRUD> pr = new PriorityQueue<StudentCRUD>(2, new GradeComparator());
		StudentCRUD s = new StudentCRUD("Hrushikesh",10);
		StudentCRUD s1 = new StudentCRUD("Rutik",10);
		StudentCRUD s2 = new StudentCRUD("Meghraj",10);
		StudentCRUD s3 = new StudentCRUD("Shreyas",10);
		StudentCRUD s4 = new StudentCRUD("Siddhesh",10);
		StudentCRUD s5 = new StudentCRUD("Anand",10);
		pr.add(s);
		pr.add(s1);
		pr.add(s2);
		pr.add(s3);
		pr.add(s4);
		pr.add(s5);
		while(!pr.isEmpty()) {
			System.out.println(pr.poll().getName());
		}
	}

}
