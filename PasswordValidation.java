package my18program;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		
		if(username.equalsIgnoreCase("sak") && password.equals("sak19"))
			System.out.println("Login successful");
		else
			System.out.println("Invalid credentials");
				
		
		

	}

}
