package working.example;

import java.util.LinkedList;

public class Processor {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private final Object lock = new Object();
	
	public  void produce() throws InterruptedException {
		int value = 0;
		//System.out.println("Value initially: "+value);
		while(true)
		{
			synchronized (lock) {
				while(list.size()==LIMIT)
				{
					lock.wait();
				}
				list.add(value);
				System.out.println("Value added: "+value);
				value++;
				lock.notify();
			}
		}
	}
	
	public void consume() throws InterruptedException {
		while(true)
		{
			synchronized (lock) {
				while(list.size()==0)
				{
					lock.wait();
				}
				System.out.print("List size: "+list.size());
				int value = list.removeFirst();
				System.out.println("; Value removed: "+value);
				lock.notify();
			}
			
			//This thread sleep is important since we dont want to remove elements as fast as it adds. 
			//Otherwise it will start giving you garbage values if the list runs out of elements,
			// specially in the beginning.
			Thread.sleep(500);
		}
	}

}
