package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q=new PriorityQueue<>();
		
		System.out.println(q.peek());   //null if empty
		//System.out.println(q.element());  // Give Exception if empty
		
		for (int i = 20; i <= 30; i++) {
			q.offer(i);
		}
		System.out.println("It maintain natural order at firsttiem inertion "+q);
		
		System.out.println(q.element());
		
		System.out.println("Get first element in th queue "+q.peek());   //null if empty
		
		System.out.println("Get first and remove "+q.poll()); //null if element empty
		
		System.out.println("Get First and remove "+q.remove()); ////Exception throw  if element empty
		
		System.out.println("Final element are: "+q);
		
	}

}
