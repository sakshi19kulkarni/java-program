package MapProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIte {

	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<>();
		
		hm.put("Cricket", "Sachin");
		hm.put("Football", "Zidane");
		hm.put("Tennis", "Federer");
		
		Iterator<Map.Entry<String,String>> entrySet= hm.entrySet().iterator();
        
		while(entrySet.hasNext())
		{
			Map.Entry<String, String> entry=entrySet.next();
			System.out.println("Key :"+entry.getKey()+" Value : "+entry.getValue());
		}
	}

}
