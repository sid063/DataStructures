package Thread;

public class JoinMainThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo3.mainThread = Thread.currentThread();
		ThreadDemo3 t = new ThreadDemo3();
		t.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main thread.");
			Thread.sleep(2000);
		}
	}
}

class ThreadDemo3 extends Thread {
	static Thread mainThread;

	@Override
	public void run() {
		try {
			mainThread.join();
			for (int i = 0; i < 3; i++) {
				System.out.println("Child Thread.");
			}
		} catch (InterruptedException e) {

		}
	}

}