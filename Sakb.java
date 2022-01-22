package edubridge;

import java.util.Scanner;

public class Sakb {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter the Number1:");
		a = input.nextInt();
		
		System.out.println("Enter the Number2:");
		b = input.nextInt();
		
		
		c = (a>b)? a:b;
		System.out.println("largest =" +c);
	}

}
