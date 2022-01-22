package progarray1;

import java.util.Scanner;

public class ArrayStored {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the array size:");
	  int n=sc.nextInt();
	  
	  //declare an array
	  int ar[]=new int[n];
	  
	  //accept the values
	  System.out.println("Enter "+n+" elements");
	  for(int i=0;i<ar.length;i++) {
		  ar[i]=sc.nextInt();
	  }
	  
	  System.out.println("Array is Stored");
	  System.out.print("{");
	  for(int i=0;i<ar.length;i++) {
		  System.out.print(ar[i]+",");
	 }
	  System.out.print("}");
	  
	  

	}

}
