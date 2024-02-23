package collection;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		try {
			queue.put("ipad");
			queue.put("laptop");
			queue.put("mobile");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
