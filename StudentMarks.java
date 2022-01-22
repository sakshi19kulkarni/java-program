package sakshidemo1;

import java.util.Scanner;

public class StudentMarks {
	
public static void main(String args[]) {
	
	int english,chemistry,math,physics,computer;
	float total,average;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the marks of five subject...");
	System.out.println("Enter the marks of english subject:");
	english=sc.nextInt();
	
	System.out.println("Enter the marks of chemistry subject:");
	chemistry=sc.nextInt();
	
	System.out.println("Enter the marks of math subject:");
	math=sc.nextInt();
	
	System.out.println("Enter the marks of physics subject:");
	physics=sc.nextInt();
	
	System.out.println("Enter the marks of computer subject:");
	computer=sc.nextInt();
	
	total = english+chemistry+math+physics+computer;
	System.out.println("total marks="+total);
	
	average = total/5;
	System.out.println("average marks="+average);
	
	//percentage=(total/500)*100;
	//System.out.println("percentage="+percentage);
    
}   
	
	
 
}		
