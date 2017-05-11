package Thread;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StringPrinter {

	private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0, TimeUnit.MILLISECONDS,
			new LinkedBlockingQueue<Runnable>());

	public static void main(String[] args) {
		new StringPrinter().printString();
	}

	public void printString() {
		for (int i = 1; i <= 6; i++) {
			threadPoolExecutor.execute(getRunnable(i));
		}
	}

	private Runnable getRunnable(final int i) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String randomString = RandomClass.getRandomString(i);
				System.out.println("String returned is : " + randomString);
			}
		};
		return runnable;
	}
}

class RandomClass {
	private static final String characters = "abcdefghijklmnopqrstuvwxyz0123456789";

	public static String getRandomString(int length) {
		if (length <= 0 || length > 10) {
			return "Random";
		}
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(36);
			stringBuilder.append(characters.charAt(index));
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return stringBuilder.toString();
	}
}