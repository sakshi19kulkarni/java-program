package sakshidemo1;

import java.util.Scanner;

public class LoopAndIfRevPalin {
	public static void main(String args[]) {
		int rev=0,num,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num= sc.nextInt();
		
		int num1 =num;
		while(num !=0) {
			digit = num%10;
			rev =rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed number"+rev);
		if(num1 == rev)
		{
			System.out.println(num1+" is pallandrome");
		}
		else {
			System.out.println(num1+" is not pallandrome");
		}
	}

}
