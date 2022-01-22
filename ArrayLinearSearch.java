package progarray1;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		
		System.out.println("Enter element to search:");
		int find=sc.nextInt();
		int c=0;
	
	    for(int i=0;i<arr.length;i++) {
		if(arr[i]==find) {
			System.out.println("Element found at position:" +(i+1));
			c=1;
			break;
		}
	}
	    if(c==0)
	    	System.out.println("Element not found");
	    sc.close();
		

	}

}
