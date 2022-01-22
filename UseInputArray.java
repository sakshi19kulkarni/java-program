package progarray1;

import java.util.Scanner;

public class UseInputArray {

	public static void main(String[] args) {
		int ar[];
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		n=sc.nextInt();
		ar=new int[n];
		
		//input elements
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		
		//displaying
		System.out.println("Array elements ");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		

	}

}
