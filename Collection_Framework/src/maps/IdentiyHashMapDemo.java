package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentiyHashMapDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		Map <Integer,String> map=new HashMap<>(); // it will override the id and value because it use dot equals method
		                                          //to check the values are same

		Map <Integer,String> map2=new IdentityHashMap<>();
		
		
		Integer id1=new Integer(10);
		Integer id2=new Integer(10);
		
		Integer id3=new Integer(10);
		Integer id4=new Integer(10);
		
		map.put(id1, "bharath");
		map.put(id2, "ram");
		
		map2.put(id1, "bharath");
		map2.put(id2, "ram");
		
		System.out.println("HashMap value "+map);
		System.out.println("Identity HashMap Value: "+map2);
		
		
		
	}

}
