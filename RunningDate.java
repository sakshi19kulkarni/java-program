package sakshidemo1;

import java.util.Scanner;

public class RunningDate {
	public static void main(String args[]){
	
	int year,month,days,minute,second;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Year:");
	
	year = sc.nextInt();
	month = 12 * year;
	days = 365 * year;
	minute = days * 24 * 60;
	second = minute * 60;
	
	System.out.println("the months are :" +month);
	System.out.println("the days are :" +days);
	System.out.println("the minutes are :" +minute);
	System.out.println("the seconds are :" +second);
	
	
	
	
	

}
}
