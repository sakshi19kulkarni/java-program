package ExceptionDemo;

import java.util.Scanner;

class Age extends Exception{
	int userage;
	Age(String s){
		super(s);
	
	}
}

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age ob=new Age("no elegible for voting");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		ob.userage=sc.nextInt();
		
		try {
			if(ob.userage<19) {
				//System.out.println("");
				throw ob;
			}
		}catch(Age e) {
			e.printStackTrace();
		}

	}

}
