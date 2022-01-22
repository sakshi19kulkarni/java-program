package my18program;

import java.util.Scanner;

public class InitialNameProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence:");
		String s=sc.nextLine();
		//s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			/*if(i==0)
				System.out.print(s.charAt(i) + ". ");
			if(s.charAt(i)==' ')
				System.out.print(s.charAt(i+1) + ". ");
				*/
			s=s.toUpperCase();
			if(Character.isUpperCase(s.charAt(i))) {
				System.out.print(s.charAt(i)+". ");
			}
		}

	}

}
