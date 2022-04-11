package ExceptionDemo;

public class ExcpProgUsingUnchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24,den=0;
		int ans=0;
		int a[]=new int[4];
		
		try {
		ans=num/den;//run time error //unchecked exception
		System.exit(0);//terminate program here
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {//java 7
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e);
		}
	/*	try {
			a[4]=8;
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		finally {
			System.out.println("executes always");
			//resource closing
		}
		System.out.println(ans);
		System.out.println("after division");

	}

}
