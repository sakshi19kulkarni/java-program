package progarray1;

import java.util.Scanner;

public class ArrayBrk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the "+n+" elements:");
		for( int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is stored:");
		System.out.print("{");
		
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-2) {
		     System.out.print(arr[i]+",");
			}
		else if(i==arr.length-1) {
				System.out.print(arr[i]);
			}
		
		}
		System.out.print("}");
		
		

	}

}
