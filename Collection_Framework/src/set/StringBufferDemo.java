package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringBufferDemo {

	public static void main(String[] args) {

		Set<StringBuffer> set=new TreeSet<>(new SbComparator());
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("hjs"));
		set.add(new StringBuffer("iuh"));
		set.add(new StringBuffer("djd"));
		
	for (StringBuffer stringBuffer : set) {
		System.out.println(stringBuffer);
	}
	}

}
