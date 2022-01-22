package my18program;

import java.util.Scanner;

public class ReverseStringFun {

	public static void main(String[] args) {
		/*String s="hello sakshi";
		char ch;
		System.out.println("the string is:");
		System.out.println("hello sakshi");*/
	  
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter a sentence:");
	    String s=sc.nextLine();
	    for(int i=s.length()-1;i>=0;i--) {
		  System.out.print(s.charAt(i));
	  }

	}

}
