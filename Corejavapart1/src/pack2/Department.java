package pack2;

import java.util.Scanner;

import pack1.Employee;

public class Department extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Eno and Ename: ");
		int a = s.nextInt();
		String s1 = s.next();
		
		Employee e = new Employee(a, s1);
		e.display();
	}

}
