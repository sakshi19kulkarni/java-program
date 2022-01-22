package sakshidemo1;
import java.util.Scanner;

public class DemoUserDetails {
	
	public static void main(String args[]) {
		
		int age;
		String name;
		float fees;
		char gen;
		double loan;
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter your name");
		//name = input.next();
		
		System.out.println("Enter your age");
		age = input.nextInt();
		
		System.out.println("Enter your fees");
		fees = input.nextFloat();
		
		System.out.println("Enter your gender M/F");
		gen = input.next().charAt(0);
		
		
		//System.out.println("Name ="+name);
		System.out.println("age ="+age);
		System.out.println("fees ="+fees);
		System.out.println("gender ="+gen);
		
	}

}
