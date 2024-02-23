package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
//	static HashMap<String,String> hashMap=new HashMap<>();
	static ConcurrentHashMap<String,String> hashMap=new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashMap.put("php","8.5");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentHashMapDemo ch=new ConcurrentHashMapDemo();
		ch.start();

		hashMap.put("java", "9.0");
		hashMap.put("python", "7.0");
		hashMap.put("sql", "6.0");
		hashMap.put("c", "4.0");
		
		Iterator<String> iterator = hashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			String itr = iterator.next();
			System.out.println(hashMap.get(itr));
		}

		System.out.println(hashMap.keySet());
		System.out.println(hashMap);
	}

}
