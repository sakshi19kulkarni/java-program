package arrayprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		
		ArrayList<Float> ob1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements of floating point value you want");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter element");
			float val=sc.nextFloat();
			ob1.add(val);
		}
		
		/*for(Float f:ob1) {   //wrapper class  //enhanced for
			System.out.println(f);
		}*/
		
		for(int i=0;i<ob1.size();i++) {    //normal for loop
			System.out.println(ob1.get(i));
		}
		//System.out.println(Collections.min(ob1));
		//Collections.sort(ob1);
		//System.out.println(ob1);
		//Collections.shuffle(ob1);
		//System.out.println(ob1);
		
		
		//display
		/*Iterator it=ob1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		

		
		
		
		

	}

}
