package prognestedloop;

import java.util.Scanner;

public class PrimeUsingInputValueNes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,s;
		System.out.println("Enter the Starting range:");
		s=sc.nextInt();
		System.out.println("Enter the ending range");
		n=sc.nextInt();
		
		int i,j,c=0;
		for(i=1;i<n;i++) {
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i+"");
			}
			
		}

	}

}
