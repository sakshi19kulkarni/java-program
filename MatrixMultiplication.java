package twodarrayprog;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int first_matrix[][],second_matrix[][],result[][];
				int r1,r2,c1,c2;
				//addition
				//r1==r2 and c1=c2 then addition is possible
						
				Scanner sc=new Scanner(System.in);
				System.out.println("enter row & column of first matrix");
				r1=sc.nextInt();
				c1=sc.nextInt();
						
				System.out.println("enter row & column of second matrix");
				r2=sc.nextInt();
				c2=sc.nextInt();
						
				//check the condition
						
				if(r1!=r2 && c1!=c2) {
				System.out.println("multiplication is not possible");
				}
				else {
					first_matrix=new int[r1][c1];
				    second_matrix=new int[r2][c2];
					result=new int[r1][c1];
							
					//input first matrix
					System.out.println("enter "+r1+"x"+c1+"elements of first matrix");
					for(int i=0;i<r1;i++) {
					for(int j=0;j<c1;j++) {
					first_matrix[i][j]=sc.nextInt();
					}
				}
					//input second matrix
					System.out.println("enter "+r2+"x"+c2+"elements of second matrix");
					for(int i=0;i<r2;i++) {
					for(int j=0;j<c2;j++) {
					second_matrix[i][j]=sc.nextInt();
					}
				}
					//sub
					for(int i=0;i<r1;i++) {
					  for(int j=0;j<c1;j++) {
						result[i][j]=first_matrix[i][j]*second_matrix[i][j];
						}
					}
					//print the result matrix
					for(int i=0;i<r1;i++) {
					  for(int j=0;j<c1;j++) {
							System.out.print(result[i][j]+" ");
					}
						System.out.println();
								
					}
				}




			}
		}


	