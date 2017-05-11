package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo3 {
	public static void main(String[] args) {
		ReentrantThread1 t1 = new ReentrantThread1("FirstThread.");
		ReentrantThread1 t2 = new ReentrantThread1("SecondThread.");
		t1.start();
		t2.start();
	}
}

class ReentrantThread1 extends Thread {
	static ReentrantLock lock = new ReentrantLock();

	public ReentrantThread1(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + "......got the lock, performing safe operations.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("Unlocking this.");
			lock.unlock();
		} else {
			System.out.println(
					Thread.currentThread().getName() + "......did not get the lock, performing alternate operations.");
		}
	}
}