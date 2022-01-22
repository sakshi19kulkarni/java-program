package edubridge;

public class Sak2 {
	public static void main(String args[]) {
		int a,b,c;
		a=10;
		b=2;
		c=5;
		boolean t;
		t =	(a>b && a>c);
		System.out.println("a && b = " +t);
		
		t = (a>b || a>c);
		System.out.println("a || b = "+t);
		
		t = !(a>b);
		System.out.println("!(a && b)= "+t);
		
		
		
	}

}
