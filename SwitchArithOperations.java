package sakshidemo1;

import java.util.Scanner;

public class SwitchArithOperations {
	public static void main(String args[]) {
		
		int num1, num2,ans;
		int ch;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the two numbers:");
		num1 = sc.nextInt();
		num2 =sc.nextInt();
		
		System.out.println("enter an choice");
	  
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		ch=sc.nextInt();
		
		
		switch(ch) {
		case 1: 
			    ans=num1+num2;
		        System.out.println("addition is "+ans);
		        break;
		        
		case 2:
			    ans=num1-num2;
			    System.out.println("substraction is" +ans);
                break;
        
		case 3:
			    ans=num1*num2;
		        System.out.println("multiplication is "+ans);
                break;
        
		case 4: 
			    ans=num1/num2;
			    System.out.println("division is" +ans);
                break;
        
        default:
        	   System.out.println("Invalid output:");
		
		
		
		}
	}

}
