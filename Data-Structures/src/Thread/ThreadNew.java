package Thread;

public class ThreadNew extends Thread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread.currentThread().join()::::");
		Thread.currentThread().join();
	}
}

class ThreadDemo extends Thread {

	@Override
	public void run() {
		System.out.println("Current Thead: " + Thread.currentThread().getName());
		System.out.println("Current Thead: " + Thread.currentThread().getPriority());
		System.out.println("Child thread.");
	}

}
