package twodarrayprog;

import java.util.Scanner;

public class TwoDArrayProg {

	public static void main(String[] args) {
		
		int a[][]=new int[3][6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
				
		}

	}
}