package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<>();  //ctrl+shift+o delete unused imports
		map.put("Tom", 87);
		map.put("jack", 47);
		map.put("ram", 84);
		map.put("peter", 67);
		
		System.out.println(map.keySet()+" "+map.values());
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys are: "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values are: "+values);
		
		for(String key:keySet) {
			System.out.println("key value is: "+key+" Values are: "+map.get(key));
		}

		
		
	}

}
