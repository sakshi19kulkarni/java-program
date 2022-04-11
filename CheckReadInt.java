package ExampleSetProg;

import java.util.Scanner;

public class CheckReadInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter value:");
        
        if(scan.hasNextInt())
        {
        	int x = scan.nextInt();
        	System.out.println("your entered value:" + x);
        }
        else {
        	System.out.println("please entered the interger value:");
        }
        scan.close();
        
	}

}
