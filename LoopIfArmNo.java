package sakshidemo1;

import java.util.Scanner;

public class LoopIfArmNo {

	public static void main(String[] args) {
		int num,d,backnum;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		backnum = num;
		
		while(num>0)
		{
			d = num % 10;
			sum = sum+d*d*d;
			num = num/10;
		}
		if(sum == backnum) {
			System.out.println(backnum+ " is an Armstrong number");
		}
		else {
			System.out.println(backnum+" is not an Armstrong number");
		}

	}

}
