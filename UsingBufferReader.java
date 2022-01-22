package oopsconceptclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class EmployeeDetail{
	String name;
	int emp_id;
	float salary;
	int age;
	char gen;
	
	//methods
	void input() throws IOException{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		/*Scanner sc=new Scanner(System.in);*/
		//first create InputStreamReader
	
		
		System.out.println("enter name");
		name=br.readLine();
		System.out.println("enter emp_id");
		emp_id=Integer.parseInt(br.readLine());
		System.out.println("enter salary");
		salary=Float.parseFloat(br.readLine());
		System.out.println("enter age");
		age=Integer.parseInt(br.readLine());
		System.out.println("enter gen");
		gen=br.readLine().charAt(0);
	}
	void display() {
		System.out.println("name=" +name);
		System.out.println("emp_id=" +emp_id);
	    System.out.println("salary=" +salary);
	    System.out.println("age= "+age);
	    System.out.println("gen=" +age);
}
}

public class UsingBufferReader {

	public static void main(String[] args) throws IOException{
		//System.out.println("Main method");
		
		Employee ep=new Employee();
		
		
	    ep.input();
	    
		ep.display();
		

	}

}
