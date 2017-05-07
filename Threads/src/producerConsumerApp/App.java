package producerConsumerApp;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
	
	//Thread safe
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	public static void producer() throws InterruptedException
	{
		Random random = new Random();
		
		while(true)
		{
			int value = random.nextInt(100);
			System.out.println(queue);
			//System.out.println("Value in producer: "+value);
			queue.put(value);
		}
	}
	
	public static void consumer() throws InterruptedException
	{
		Random random = new Random();
		
		while(true)
		{
			Thread.sleep(100);
			int value = random.nextInt(10);
			//System.out.println("Value in consumer : "+value);
			if(value == 0)
			{
				Integer value2= queue.take();
				System.out.println("Value taken: "+value2 +"; Queue size is: "+queue.size());
			}
		}
	}
}
