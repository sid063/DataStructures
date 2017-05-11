package Thread;

public class waitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.start();
		synchronized (a) {
			a.wait();
		}
		System.out.println("Total: " + a.total);
	}
}

class ThreadA extends Thread {
	int total = 0;

	@Override
	public void run() {
			for (int i = 0; i <= 100; i++)
				total = total + i;

			this.notify();
	}
}