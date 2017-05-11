package Thread;

public class SyncDemo2 {
	public static void main(String[] args) {
		Display2 d = new Display2();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		try {
			d.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	Display2 d;
	
	public final static void m1(Display2 d)
	{
	}

	public MyThread1(Display2 d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayc();
	}
}

class MyThread2 extends Thread {
	Display2 d;

	public MyThread2(Display2 d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayn();

	}
}

class Display2 {
	public synchronized void displayn() {
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void displayc() {
		for (int i = 65; i <= 70; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}