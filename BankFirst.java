package bank.app;

import java.sql.SQLException;
import java.util.Scanner;

public class BankFirst {
	public static void main(String args[]) throws SQLException {
		Scanner sc=new Scanner(System.in);
		OperationBank ob=new OperationBank();
		while(true) {
			System.out.println("**************WELCOME BANK**************");
			System.out.println("1.Open Account");
			System.out.println("2.Show Accounts");
		    System.out.println("3.Deposit Amount");
			System.out.println("4.Withdraw Amount");
			System.out.println("5.Show particular Account");
			
			System.out.println("Enter the Option");
			int ch =sc.nextInt();
			switch(ch) {
			case 1:ob.openAccount();
			      break;
			case 2:ob.showAccounts();
			      break;
			case 3:ob.depositAmount();
			      break;
			case 4:ob.withdrawAmount();
			      break;
			case 5:ob.showparticularAccount();
			      break;
			
			}
			System.out.println("Do you want to continue Y/N");
			char choice=sc.next().charAt(0);
			if(choice=='N'|| choice=='n') {
				break;
			}
			
		}
	}
	

}
