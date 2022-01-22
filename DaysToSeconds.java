package sakshidemo1;
import java.util.Scanner;

public class DaysToSeconds {
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		int days, sec;
		System.out.println("Enter the Days :");
		days = input.nextInt();
		
		System.out.println("Convert Days to Seconds :");
		int ans = days*60*60;
		
		System.out.println(ans);
	}

}
