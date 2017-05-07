package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo4 {
	public static void main(String[] args) {
		
		ReentranLockThread t1 = new ReentranLockThread();
		ReentranLockThread t2 = new ReentranLockThread();
		t1.start();
		t2.start();
	}
}

class ReentranLockThread extends Thread {
	static ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		do {
			try {
				if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "Got the lock, sleeping for 10 sec.");
					Thread.sleep(10000);
					lock.unlock();
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "Did not get the lock, trying again.");
				}
			} catch (Exception e) {

			}
		} while (true);
	}
}