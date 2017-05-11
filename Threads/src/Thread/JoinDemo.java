package Thread;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread2Demo t = new Thread2Demo();
		t.start();
		//t.join();
		
		for(int i=0;i<3;i++)
		{
			System.out.println("main thread.");
		}
	}
}

class Thread2Demo extends Thread
{
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread demo.");
		}
	};
}