package progarray1;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//int a[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
	    System.out.println("Enter array elements:");
	     for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after bubble sort");
		for(int j=0;j<=n-1;j++) {
			System.out.println(a[j]+" ");
		}

	
	}
}
