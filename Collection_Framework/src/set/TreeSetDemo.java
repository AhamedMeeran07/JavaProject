package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> set=new TreeSet<>();
		set.add("def");
		set.add("abc");
		set.add("jgh");
		set.add("psg");
		
		for (String obj : set) {
			System.out.println(obj);
		}
		

		
	}

}
