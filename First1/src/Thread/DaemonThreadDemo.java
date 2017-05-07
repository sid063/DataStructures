package Thread;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main thread.");
	}
}

class DaemonThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Child thread.");
			try {
				//Thread.sleep(2000);
			} catch (Exception e) {
			}
		}
	}
}