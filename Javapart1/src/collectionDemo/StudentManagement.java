package collectionDemo;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentCRUD> studentArray = new ArrayList<StudentCRUD>();
		int choice;
		String name, age;
		Scanner scanner = new Scanner(System.in);
		//Creating infinite while loop
		while(true) {
			//Creating menu
			System.out.println("Press 1 for Add Student Details");
			System.out.println("Press 2 for Show Student Details");
			System.out.println("Press 3 to Quit\n");
			
			// Asking user to make choice
			System.out.println("Make your choice");
			choice = scanner.nextInt();
			
			// Creating switch case branch
			switch(choice) {
			
			//First case for finding the addition
			case 1:
				System.out.println("Enter the Student Name ");
				name = scanner.next();
				System.out.println("Enter the Student age ");
				age = scanner.next();
				StudentCRUD sc = new StudentCRUD();
				sc.setAge(age);
				sc.setName(name);
				studentArray.add(sc);
				System.out.println("Student Record has been added");
				break;
				
			//Second case for finding the difference
			case 2:
				System.out.println("------------------------------");
				for(int i=0; i<studentArray.size(); i++) {
					System.out.println("Student Record: "+(i+1));
					System.out.println("Student Name: "+studentArray.get(i).getName());
					System.out.println("Student Age: "+studentArray.get(i).getAge());
					System.out.println("-----------------------------------------");
				}
				break;
				
			case 3:
				System.exit(0);
				
			default:
				System.out.println("Invalid choice !!! Please make a valid choice\n \n");
			}
		}
	}

}
