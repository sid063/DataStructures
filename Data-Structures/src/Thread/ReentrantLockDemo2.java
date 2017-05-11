package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {
	public static void main(String[] args) {
		display d = new display();
		ReentrantThread t1 = new ReentrantThread(d,"Dhoni");
		ReentrantThread t2 = new ReentrantThread(d,"Yuvraj");
		t1.start();
		t2.start();
	}
}

class ReentrantThread extends Thread {
	
	display d;
	String name;
	
	public ReentrantThread(display d, String name) {
		this.d = d;
		
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}

class display {
	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			System.out.println(name);
		}
		l.unlock();
	}
}