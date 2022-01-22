package sakshidemo1;

import java.util.Scanner;

public class SwitchCaseSevenDays {
	public static void main(String args[]) {
		int day;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the day num");
		day=sc.nextInt();
		
		switch(day) {
		case 1: 
			System.out.println("monday");
		    break;
		
		case 2: 
			System.out.println("tuesday");
		    break;
		
		case 3: 
			System.out.println("wednesday");
		    break;
	
		case 4: 
			System.out.println("thursday");
		    break;
		
		case 5: 
			System.out.println("friday");
		    break;
		
		case 6: 
			System.out.println("saturday");
		    break;
		
		case 7: 
			System.out.println("sunday");
		    break;
		
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
