package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetDemo extends Thread {
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>(); // static so only main static
																						// method can access

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("plsql");
	}

	public static void main(String[] args) throws InterruptedException {

		ArraySetDemo arrayListDemo = new ArraySetDemo(); //cretae new intance on thi class
		arrayListDemo.start();

		courses.add("java");
		courses.add("python");
		courses.add("php");

		Iterator<String> itr = courses.iterator();

		while (itr.hasNext()) {
			Thread.sleep(2000);
			String course = itr.next();
			// courses.add("sql");
			System.out.println(course);

		}
		System.out.println(courses);
	}

}
