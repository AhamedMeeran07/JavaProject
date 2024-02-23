package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<String> queue=new ArrayBlockingQueue<String>(1024);
		
		OrderProducer op=new OrderProducer(queue);
		OrderConsumer oc=new OrderConsumer(queue);
		
		new Thread(op).start();
		new Thread(oc).start();


		
		
	}

}
