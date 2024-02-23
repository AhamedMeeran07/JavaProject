package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(60);
		list.add(80);
		System.out.println("The element are: " + list);
		// list.removeAll(list);

		Iterator<Integer> itr = list.iterator();

		// System.out.println(itr.hasNext()); check teh list have value or not
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("After removing: " + list);

	}

}
