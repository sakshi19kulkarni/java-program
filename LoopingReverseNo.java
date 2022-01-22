package sakshidemo1;

import java.util.Scanner;

public class LoopingReverseNo {

	public static void main(String[] args) {
		int num,i,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		while(num>0) {
			digit = num%10;
			System.out.println(digit);
			num=num/10;
		}
		

	}

}
