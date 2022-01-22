package oopsconceptclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Details{
	String name;
	int id;
	String dep_name;
	float salary;
	char gen;
	
	void input() throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("enter name,id,dep_name,salary,gender:");
      name=br.readLine();
      id=Integer.parseInt(br.readLine());
      dep_name=br.readLine();
      salary=Float.parseFloat(br.readLine());
      gen=br.readLine().charAt(0);
      
		
	}
	void display() {
		System.out.println("name=" +name);
		System.out.println("emp_id=" +id);
	    System.out.println("dep_name="+dep_name );
	    System.out.println("salary= "+salary);
	    System.out.println("gen=" +gen);
		
	}
}

public class ExampleArray {

	public static void main(String[] args) throws IOException{
		
		Details arr[]=new Details[5];
		for(int i=0;i<5;i++) {
			arr[i]=new Details();
			arr[i].input();
			arr[i].display();
		}
		

	}

}
