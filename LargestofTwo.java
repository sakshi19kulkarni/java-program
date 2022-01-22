package conditional;

import java.util.Scanner;

public class LargestofTwo {
	public static void main(String args[]) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		num1=sc.nextInt();
		
		System.out.println("Enter the second number:");
		num2=sc.nextInt();
		
		System.out.println("Enter the third number:");
		num3=sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
		System.out.println("the largest Number="+num1 );	
		}
		else if(num1<num2 && num3<num2) {
			System.out.println("the largest Number="+num2);	
		}
		else {
			System.out.println("they are equal");
		}
			
		}
		
		

}
