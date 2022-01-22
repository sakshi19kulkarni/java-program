package my18program;

public class Hello_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1="Hi";
		System.out.println(s);
		System.out.println(s1);
		
		if(s==s1) {
			System.out.println("reference is same");
		}
		if(s.equals(s1)) {
			System.out.println("information is same");
		}
		String ed=new String("Edubridge");
		String ed1=new String("Edubridge");
		
		System.out.println(ed);
		System.out.println(ed1);
		
		if(ed==ed1) {
			System.out.println("inside if");
		}
		else {
			System.out.println("outside if");
		}
    if(ed.equals(ed1)) {
    	System.out.println("string are same");
    }
    else {
    	System.out.println("string are not same");
    }
    System.out.println( s+" "+s1);
    s1=s1+" hi";
    System.out.println("s1="+s1);
    
    if(s==s1) {
    	System.out.println("same");
    }
    }
    }
