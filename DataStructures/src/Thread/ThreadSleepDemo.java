package Thread;

public class ThreadSleepDemo {
	public static void main(String[] args) {
		SleepThread t = new SleepThread();
		t.start();
		t.interrupt();
	}
}

class SleepThread extends Thread
{
	@Override
	public void run(){
		for(int i=0;i<2;i++)
			System.out.println("Child thread.");
		System.out.println("I am Sleeping");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println("I got interruped.");
		}
		System.out.println("Run completed.");
	}
}