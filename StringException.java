package ExceptionDemo;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		System.out.println("before length");
		
		//numberformatexception
		
		try {
			int l=s.length();
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		

		System.out.println("after length");

	}

}
