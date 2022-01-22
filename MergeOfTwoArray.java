package progarray1;

import java.util.Scanner;

public class MergeOfTwoArray {

	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of first array");
		int len1=sc.nextInt();
		int arr1[]=new int[len1];
	     
		System.out.println("Enter "+len1+" elements");
		for(int i=0;i<arr1.length;i++) {
		 arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		
		System.out.println("Enter "+len2+" elements");
		 for(int i=0;i<arr2.length;i++) {
			 arr2[i]=sc.nextInt();
		 }
		
		 int len3= len1 + len2;
		 int arr3[]=new int[len3];
		 
		 for(int i=0;i<arr1.length;i++) {
		  arr3[i]=arr1[i];
		 }
		 
		 for(int i=0;i<arr2.length;i++) {
	     	 arr3[len1+i]=arr2[i];
		 }
		 
		 System.out.println("Merge array: ");
		 for(int i=0;i<arr3.length;i++) {
			 System.out.println("arr3["+i+"]=" +arr3[i]);
		 }

		}

	}

