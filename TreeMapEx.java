package MapProg;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map=new TreeMap<Integer,String>();
		map.put(100, "Ankita");
		map.put(102, "Radha");
		map.put(101, "Vidya");
		
		for(Map.Entry<Integer,String>m :map.entrySet())
		System.out.println(m.getKey() + " : " +m.getValue());

	}

}
