package demo1;

class Runner extends Thread
{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Hello "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Thread2 extends Runner{
	
	public static void main(String[] args) {
		Runner r1 = new Runner();
		Runner r2 = new Runner();
		
		r1.start();
		r2.start();
	}
}
