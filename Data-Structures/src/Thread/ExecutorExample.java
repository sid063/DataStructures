package Thread;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {

	private final ThreadPoolExecutor exec = new ThreadPoolExecutor(3, 4, 2, TimeUnit.SECONDS,
			new LinkedBlockingQueue<Runnable>());

	public static void main(String[] args) {
		new ExecutorExample().getRandom();
	}

	private void getRandom() {
		for (int i = 10; i <= 100; i = i + 10) {
			exec.execute(getRunnable(i));
		}
	}

	private static Runnable getRunnable(final int i) {

		return new Runnable() {

			@Override
			public void run() {
				int randomInt = ReturnRandom.getRandom(i);
				System.out.println("Returned int is: " + randomInt);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		};
	}
}

class ReturnRandom {
	public static int getRandom(int i) {
		Random r = new Random();
		return r.nextInt(i);
	}
}