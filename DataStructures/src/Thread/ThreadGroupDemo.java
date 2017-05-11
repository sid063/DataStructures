package Thread;

public class ThreadGroupDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup g = new ThreadGroup("ParentGroup");
		ThreadGroup c = new ThreadGroup(g, "ChildGroup");
		ThreadGroupThreads t1 = new ThreadGroupThreads(g, "ChildThread1");
		ThreadGroupThreads t2 = new ThreadGroupThreads(g, "ChildThread2");
		Thread[] t = new Thread[10];
		System.out.println("Enumerate: " + g.enumerate(t));
		t1.start();
		t2.start();
		System.out.println("Active count:" + g.activeCount());
		System.out.println("Active group count:" + g.activeGroupCount());
		g.list();

		Thread.sleep(3000);
		System.out.println("Active count:" + g.activeCount());
		System.out.println("Active group count:" + g.activeGroupCount());
		g.list();
	}
}

class ThreadGroupThreads extends Thread {
	public ThreadGroupThreads(ThreadGroup g, String name) {
		super(g, name);
	}

	@Override
	public void run() {
		System.out.println("Child thread.");
	}
}