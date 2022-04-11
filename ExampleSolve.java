package ExceptionDemo;

public class ExampleSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
			int ar[]=new int[4];
			ar[7]=56;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

