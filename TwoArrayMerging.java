package progarray1;

import java.util.Scanner;

public class TwoArrayMerging {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		int len1=sc.nextInt();
		
		System.out.println("Enter the size of second array");
		int len2=sc.nextInt();
		
	    int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		
		System.out.println("Enter the elements of first array");
		for(int i=0;i<len1;i++) {
		 arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array");
		for(int i=0;i<len2;i++) {
		 arr2[i]=sc.nextInt();
		}
		
		int len=len1+len2;
		int arr[]=new int[len];
		
		for(int i=0;i<len1;i++) {
	     	arr[i]=arr1[i];
		}
		
		for(int i=0;i<len2;i++) {
	     	arr[len1+i]=arr2[i];
		}
		
		System.out.println("After merging both arrays");
		for(int i=0;i<len;i++) {
			System.out.println("arr["+i+"]=" +arr[i]);
		}
		
			
		}

}
