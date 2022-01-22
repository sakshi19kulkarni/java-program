package sakshidemo1;

import java.util.Scanner;

public class FactorialNumFor {
	public static void main(String args[]) {
		int i;
		int fact=1;
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		num=sc.nextInt();
		
		/*for(i=num;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println("fact of "+num+" is:" +fact);
		*/
	    i=num;
		while(i>=1) {
			fact=fact*i;
			i--;
		}
		System.out.println("factorial of "+num+" is "+fact);
	}
   
}
