package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {
	public static void main(String[] args) {
		MyRunnable[] runnables = { new MyRunnable("Sid-0"), new MyRunnable("Sid-1"), new MyRunnable("Sid-3"),
				new MyRunnable("Sid-4") };
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(MyRunnable r : runnables)
		{
			service.submit(r);
		}
		service.shutdown();
	}
}

class MyRunnable implements Runnable {
	String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " ....service executed by: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " ....service execution completed by: " + Thread.currentThread().getName());
	}
}