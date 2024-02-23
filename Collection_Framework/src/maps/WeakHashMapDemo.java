package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		Map<User, String> map = new HashMap<>();

		User u = new User();
		map.put(u, "Tom");
		System.out.println(map);

		u = null;
		System.out.println(map);

		Map<User, String> map2 = new WeakHashMap<>();
		User u1 = new User();

		map2.put(u1, "Tom");
		System.out.println(map2);

		u1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map2);

	}

}
