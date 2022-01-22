package twodarrayprog;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);{
		System.out.println("Enter rows of matrix:");
		int r=sc.nextInt();
		
		System.out.println("Enter columns of matrix:");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		System.out.println("Enter matrix elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
        int trans[][]=new int[c][r];
        
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			 trans[j][i]=a[i][j];
			}
		}
		System.out.println("transpose of matrix : ");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println(" ");
			
			}
		}
		

	}

}
