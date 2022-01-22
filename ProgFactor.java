package firstprogram;

import java.util.Scanner;

public class ProgFactor {

	public static void main(String[] args) {
		int num,i,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		System.out.println("Factors of the given number");
		
		for(i=1;1<=num;i++)
		{
			if(num%i!=0)
			{
				continue;
			}
			else {
				System.out.println(i+"");
			}
		}
		

	}

}
