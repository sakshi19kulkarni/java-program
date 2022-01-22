package twodarrayprog;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of rows & column:");
		int r=sc.nextInt();
		int c=r;
		
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	int sum=0;
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			if(i==j) {
				sum=sum+a[i][j];
			}
		}
		
	}
	System.out.println("sum is :"+sum);
	
	}

}
