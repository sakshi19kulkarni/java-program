package my18program;

import java.util.Scanner;

public class LoginAttempts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname="sak";
		String upass="sak19";
		
		String un,up;
		Scanner sc=new Scanner(System.in);
		int c=1;
		do {
		System.out.println("Enter your name:");
		un=sc.next();
		System.out.println("Enter your password:");
		up=sc.next();
		
		if(un.equalsIgnoreCase(uname) && up.equals(upass)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("invalid user");
		}
		c++;
	  }while(c<=3);
		System.out.println(c+ "attempts are over");
		}
		}
		