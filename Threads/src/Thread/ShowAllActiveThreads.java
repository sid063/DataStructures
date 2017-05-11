package Thread;

public class ShowAllActiveThreads {	
	public static void main(String[] args) {
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread t1 : t)
		{
			System.out.println("Current thread: "+t1.getName()+" is daemon?: "+t1.isDaemon());
		}
	}
}
