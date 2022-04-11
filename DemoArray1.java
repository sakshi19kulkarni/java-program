package arrayprog;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ob=new ArrayList<>();
		
		ob.add(23);
		ob.add(78);
		ob.add(44);
		ob.add(34);
		ob.add(56);
		
		Iterator it=ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
