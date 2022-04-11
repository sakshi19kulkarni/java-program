package ExceptionDemo;

import java.util.Scanner;

class SbiException extends Exception{
	SbiException(String s){
		super(s);
	}
}
class SbiBank{
	int balanceAmount;
	public SbiBank() {
		balanceAmount=5000;
	}
	

public void WithDrawAmount(int wa) {
	if(wa<5000) {
		System.out.println("you can withdraw");
	}
	else {
		System.out.println("not able to withdraw");
		try {
			throw new SbiException("not able to withdraw");
		}catch(SbiException e) {
			e.printStackTrace();
		}
	}
}
	
}

public class BankingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int wamount;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter amount to withdraw");
         wamount=sc.nextInt();
         SbiBank sob=new SbiBank();
         sob.WithDrawAmount(wamount);
	}

}
