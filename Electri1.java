package conditional;

import java.util.Scanner;

public class Electri1 {
	public static void main(String args[]) {
		int units;
		float amount;
		System.out.println("Enter the electricity units:");
		Scanner sc=new Scanner(System.in);
		units=sc.nextInt();
		if(units<=100) {
			amount=units*0.8f;
		}
		else if(units>=100 && units<=300) {
			amount=100*0.8f+(units-100)*1;
		}
		else {
			amount=100*0.8f+200*1+(units-300)*2.5f;
		}
		System.out.println("the amounts you pay for units "+units+" is" +amount);
	}

}
