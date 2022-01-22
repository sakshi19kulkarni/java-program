package edubridge;
import java.util.Scanner;

public class FactorOfInputNo {

	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println("factor of number=" +i);
			}
		}

	}

}
