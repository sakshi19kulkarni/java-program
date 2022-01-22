package sakshidemo1;

import java.util.Scanner;

public class SwitchEvenOdd {
	public static void main(String args[]) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		switch(num%2) {
		case 0:
			  System.out.println("number is even");
			  break;
			  
		case 1:
			  System.out.println("number is odd");
			  break;
		}
		
	}

}
