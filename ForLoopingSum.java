package sakshidemo1;

import java.util.Scanner;

public class ForLoopingSum {
	public static void main(String args[]) {
		int i,sum=0,n;
		i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number to find sum of all number:");
		n=sc.nextInt();
		
		for(i=2;i<=n;i++)
		{
			System.out.println("result is" +sum);
		}
	}

}
