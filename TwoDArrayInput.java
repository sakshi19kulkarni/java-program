package twodarrayprog;

import java.util.Scanner;

public class TwoDArrayInput {

	public static void main(String[] args) {
	
		int a[][];
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter matrix:");
		System.out.println("enter number of rows");
		int r=sc.nextInt();
		
		System.out.println("enter number of columns");
		int c=sc.nextInt();
		
	    a=new int[r][c];
		System.out.println("enter "+r+ "x" +c+" matrix elements");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
}
		
		
		
