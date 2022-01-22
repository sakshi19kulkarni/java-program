package sakshidemo1;

import java.util.Scanner;

public class SmallestNumber {
	
	public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
	int a,b,c,d;
	
	System.out.println("Enter the first number:");
	a = input.nextInt();
	
	System.out.println("Enter the second number:");
	b = input.nextInt();
	
	System.out.println("Enter the third number:");
	c = input.nextInt();
	
	
	d = (a<b && a<c)? a:(b<a && b<c)?b:c;
	System.out.println("the smallest number is:" +d);


}
}
