package ExampleSetProg;

import java.util.Iterator;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al= new TreeSet<String>();
		al.add("aarti");
		al.add("sneha");
		al.add("reema");
		al.add("kavya");
		//Traversing elements ascending order
		
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		System.out.println("Traversing elements through Iterator in descending order");
		Iterator it=al.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
    }
}