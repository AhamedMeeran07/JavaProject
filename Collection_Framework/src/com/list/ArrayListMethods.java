package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}
		System.out.println("List elements are: " + list);

		list.add(3, 120);
		System.out.println("After insertion: " + list);

		list.set(0, 200);
		System.out.println("After Replace: " + list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(121);
		list2.add(213);
		list2.add(234);
		System.out.println("Second list element are: " + list2);

		// list.addAll(list2); it will add all element at the end of the firt list

		list.addAll(2, list2);
		System.out.println("After adding all element in the list " + list);

		System.out.println("Element in the list are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Check the list contains the element " + list.contains(10));

		System.out.println("The size of the list :" + list.size());

		System.out.println("Retrive element from the list: " + list.get(2));

		System.out.println("Remove the element from the list: " + list.remove(4));
		list.removeAll(list2);
		System.out.println("After Remove the second list  from the  first list: " + list2);

		System.out.println("Final list elements are :" + list);

	}

}
