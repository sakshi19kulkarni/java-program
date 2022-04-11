package ExceptionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter id");
		try {
			i=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
