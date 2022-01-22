package sakshidemo1;

import java.util.Scanner;

public class GraStud {
	public static void main(String args[]) {
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the subject grade");
		grade=sc.next().charAt(0);
		
		if(grade=='A') {
			System.out.println(grade + " marks range between 90-100");
		}
		else if(grade=='B') {
			System.out.println(grade + " marks range between 50-89");
		}
		else if(grade=='C') {
			System.out.println(grade + " marks range between 30-49");
		}
		else if(grade=='D') {
			System.out.println(grade + " marks range between 0-29");
		}
		else {
			System.out.println(grade + " invalid input");
		}
		
			
		}
		

}
