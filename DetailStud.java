package sakshidemo1;

import java.util.Scanner;

public class DetailStud {
public static void main(String args[]) {
		int marks;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks");
		marks=sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=60 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=40 && marks<=59) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Invalid Input");
		}

}
}