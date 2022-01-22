package progarray1;

import java.util.Scanner;

public class MergeOfThreeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of first array:");
		int len1=sc.nextInt();
		
		System.out.println("Enter size of second array");
		int len2=sc.nextInt();
		
		System.out.println("Enter size of third array:");
		int len3=sc.nextInt();
		
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		int arr3[]=new int[len3];
		
		System.out.println("Enter the elements of first array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of third array");
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();
		}
		
		int len=len1+len2+len3;
		int arr[]=new int[len];
		
		for(int i=0;i<len1;i++) {
			arr[i]=arr1[i];
		}	
		for(int i=0;i<len2;i++) {	
		    arr[len1+i]=arr2[i];
		}
		for(int i=0;i<len3;i++) {
			arr[len1+len2+i]=arr3[i];
		}
		System.out.println("After merging three arrays:");
		for(int i=0;i<len;i++) {
			System.out.println("arr["+i+"]=" +arr[i]);
		}

	}

}
