package oopsconceptclasses;

import java.util.Scanner;

class Employee{
	String name;
	int emp_id;
	float salary;
	int age;
	char gen;
	
	//methods
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,emp_id,salary,age,gen");
		name=sc.nextLine();
		emp_id=sc.nextInt();
		salary=sc.nextFloat();
		age=sc.nextInt();
		gen=sc.next().charAt(0);
	}
		
		void display() {
			System.out.println("name=" +name);
			System.out.println("emp_id=" +emp_id);
		    System.out.println("salary=" +salary);
		    System.out.println("age= "+age);
		    System.out.println("gen=" +age);
	}
}
	
public class DemoOopsProg {

	public static void main(String[] args) {
		Employee ep=new Employee();
		Employee ep1=new Employee();
        ep.input();
        ep1.input();
		ep.display();
		ep1.display();
	}
}
		
