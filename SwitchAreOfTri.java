package sakshidemo1;

import java.util.Scanner;

public class SwitchAreOfTri {
	public static void main(String args[]) {
		
		int base,height,areatri,length,breadth,arearect,r,ch;
		float pi=3.14f,areacir;

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.area of rectangle");
		System.out.println("2.area of triangle");
		System.out.println("3.area of circle");
		System.out.println("4.area of square");
		ch=sc.nextInt();
		
		switch(ch){
		case 1:
			
			System.out.println("Enter value of length and breadth:");
		    length=sc.nextInt();
		    breadth=sc.nextInt();
		    arearect=length*breadth;
		    System.out.println("Area of rectangle is" +arearect);
		    break;
		    
		case 2:
			System.out.println("Enter value of length and breadth:");
		    length=sc.nextInt();
		    breadth=sc.nextInt();
		    areatri=length*breadth;
		    System.out.println("Area of triangle is" +areatri);
		    break;
		    
		case 3:
			System.out.println("Enter value of radius:");
		    r=sc.nextInt();
		    areacir=3.14f*r*r;
		    System.out.println("Area of circle is" +areacir);
		    break;
		    
		default:
			System.out.println("Invalid");
		
		
	}

}
}
