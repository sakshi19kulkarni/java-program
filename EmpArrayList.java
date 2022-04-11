package arrayprog;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int empid;
	String name;
	float sal;
	int age;
	String dep_name;
	
	public Employee(int empid,String name,float sal,int age,String dep_name) {
		super();
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		this.age=age;
		this.dep_name=dep_name;
	}
}
public class EmpArrayList {

	public static void main(String[] args) {
		Employee ob1=new Employee(101,"Shreya",21000,24,"IT");
		Employee ob2=new Employee(102,"Reva",22000,25,"Civil");
		Employee ob3=new Employee(103,"Neha",22000,25,"Computer");
		Employee ob4=new Employee(104,"Priya",22000,25,"Mechanical");
		
		ArrayList<Employee> a1=new 	ArrayList<>();
		a1.add(ob1);
		a1.add(ob2);
		a1.add(ob3);
		a1.add(ob4);
		
		Iterator it=a1.iterator();
		System.out.println("ID\tName\tSalary\tAge\tDep_Name");
		while(it.hasNext())
		{
			Employee emp = (Employee)it.next();
			System.out.println(emp.empid+"\t"+emp.name+"\t"+emp.sal+"\t"+emp.age+"\t"+emp.dep_name);
			//System.out.println(emp.empid);
			//System.out.println(emp.name);
			//System.out.println(emp.sal);
			//System.out.println(emp.age);
			//System.out.println(emp.dep_name);
		}
		
	}

}
