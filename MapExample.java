package ExampleSetProg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<Long, String> ab=new HashMap <Long,String>();
		ab.put(9123827456l, "kirti");
		ab.put(9543222889l,"riya");
		ab.put(9765987654l, "aarya");
		
		for(Map.Entry<Long,String>b:ab.entrySet())
		System.out.println(b.getKey() + " : " + b.getValue());
		*/
		
		/*LinkedHashMap<Long, String> ab=new LinkedHashMap <Long,String>();
		ab.put(9123827456l, "kirti");
		ab.put(9543222889l,"riya");
		ab.put(9765987654l, "aarya");
		
		for(Map.Entry<Long,String>b:ab.entrySet())
		System.out.println(b.getKey() + " : " + b.getValue());
		*/
		
		TreeMap<Long, String> ab=new TreeMap <Long,String>();
		ab.put(9123827456l, "dipti");
		ab.put(9543222889l,"vaishu");
		ab.put(9765987654l, "aarya");
		
		for(Map.Entry<Long,String> b:ab.entrySet())
		System.out.println(b.getKey() + " : " + b.getValue());
		
		


	}

}
