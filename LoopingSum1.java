package sakshidemo1;

import java.util.Scanner;

public class LoopingSum1 {
	public static void main(String args[]) {
		int i,sum=0,n;
		i=2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input the value of n");
		n=sc.nextInt();
		
		while(i<=n)
		{
			sum=sum+i;
			i=i+2;
		}
		System.out.println("result is :" +sum);
	}

}
