package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class CallableFutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] callables = { 	new MyCallable(10), 
								  	new MyCallable(20), 
								  	new MyCallable(30), 
								  	new MyCallable(40),
								  	new MyCallable(50), 
								  	new MyCallable(60) };
		
		//ThreadPoolExecutor tpe = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable call : callables) {
			Future<Integer> f = service.submit(call);
			System.out.println(f.get());
		}
		service.shutdown();

	}
}

class MyCallable implements Callable<Integer> {
	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws InterruptedException, ExecutionException {
		int sum = 0;
		System.out.print("Sum of first " + num + " numbers by Thread: " + Thread.currentThread().getName() + ": ");
		for (int i = 1; i <= num; i++)
			sum = sum + i;
		
		Thread.sleep(1000);

		return sum;
	}
}