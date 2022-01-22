package sakshidemo1;

import java.util.Scanner;

public class AreaOperations {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		int base,height,areatri,length,breadth,arearect,r;
		float pi=3.14f,areacir;
		
		
		//Area of square
		System.out.println("Enter the base of triangle:");
	    base = sc.nextInt();
	    
	    System.out.println("Enter the height of triangle:");
	    height = sc.nextInt();
	    
		areatri= base*height/2;
		System.out.println("the area of triangle="+areatri);
		
		//Area of rectangle
		System.out.println("Enter the length of rectangle:");
	    length = sc.nextInt();
	    
	    System.out.println("Enter the breadth of rectangle:");
	    breadth = sc.nextInt();
	    
	    arearect = length*breadth;
	    System.out.println("the area of rectangle="+arearect);
		
	    //Area of circle
	    System.out.println("Enter the radius of circle:");
	    r= sc.nextInt();
	    
	    areacir = pi*r*r;
	    System.out.println("the area of circle="+areacir);
	    
	    
	    

	    
		
		
	}
		
	
}

