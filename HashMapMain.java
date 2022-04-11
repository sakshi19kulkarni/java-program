package MapProg;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Long, String> ab=new HashMap <Long,String>();
		ab.put(9123827456l, "kirti");
		ab.put(9543222889l,"riya");
		ab.put(9765987654l, "aarya");
		
		for(Map.Entry<Long,String>b:ab.entrySet())
		System.out.println(b.getKey() + " : " + b.getValue());
		
		

	}

}
