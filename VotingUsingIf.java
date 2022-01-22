package conditional;
import java.util.Scanner;

public class VotingUsingIf {
	public static void main(String args[]) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age= sc.nextInt();
		
		if(age<18) {
			System.out.println(age+ "is not eligible for voting");
		}
		if(age>=18) {
			System.out.println(age+ "is it eligible for voting");
			
		}
	}

}
