package MapProg;

import java.util.HashMap;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(100, "Aishu");
		map.put(101, "Vidya");
		map.put(102, "Rani");
		map.put(103, "Gauri");
		
		System.out.println("Initial list of elements: "+map);
		//Key-based removal
		map.remove(100);
		System.out.println("Updated list of elements: "+map);
		//value-based removal
		map.remove(101);
		System.out.println("Updated list of elements: "+map);
		//key-value pair based removal
		map.remove(102,"Rani");
		System.out.println("Updated list of elements: "+map );
		

	}

}
