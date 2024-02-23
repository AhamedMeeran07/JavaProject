package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[1000000];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		List<Object> list = new LinkedList<>();

		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		
//		long start1 = System.currentTimeMillis();
//		for (Object object : objects) {
//			list.remove(object);
//		}
//		long end1 = System.currentTimeMillis();

		System.out.println("Time Taken: " + (end - start));
		
		//System.out.println("Time Taken: " + (end1 - start1));


	}

}
