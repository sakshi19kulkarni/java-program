package ExceptionDemo;

//Java program to demonstrate user defined exception

//This program throws an exception whenever balance
//amount is below Rs 1000
class MyException extends Exception
{
	MyException(String s){
		super(s);
	}
}
class bank{
	int []acno= {1001,1002,1003,1004,1005};
	String []acnm= {"ava","ani","Ana","Ash","Aacbalnu"};
	double[]acbal= {10000.00,12000.00,560.0,999.00,1100.55};
	void show()
	{
		System.out.println("ACNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
		for(int i=0;i<5;i++)
		{
			try {
				if(acbal[i]<1000)
					throw new MyException(acnm[i]+" "+"balance is less than 1000");
				System.out.println(acno[i]+" \t"+acnm[i]+ "\t \t" +acbal[i]);
			}
			catch(MyException e) {
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
		}
	}
				
public class SecondCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank b1=new bank();
		b1.show();
		
	}
}
}