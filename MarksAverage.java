package sakshidemo1;
import java.util.Scanner;

public class MarksAverage {
	public static void main(String args[]) {
	int eng,che,comp,phy,math;
	float total, average;
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("enter the name:");
	 String name= sc.next();
	 
	 
	 System.out.println("enter marks of english sub:");
	 eng= sc.nextInt();
	 
	 System.out.println("enter marks of chemistry sub:");
	 che= sc.nextInt();
	
	 System.out.println("enter marks of computer sub:");
	 comp= sc.nextInt();
	
	 System.out.println("enter marks of physics sub:");
	 phy= sc.nextInt();
	
	 System.out.println("enter marks of mathmatics sub:");
	 math= sc.nextInt();
	 
	 total=eng+che+comp+phy+math;
	 average=total/5;
	 
	
	 System.out.println("total marks=" +total);
	 System.out.println("average marks=" +average);
	 
	 
	
	

}
}