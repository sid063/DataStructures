package Thread;

public class syncDemo {
	public static void main(String[] args) {
		Display3 d = new Display3();
		Display3 d2 = new Display3();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d2, "Yuvraj");
		t1.start();
		t2.start();
	}
}

class Display3 {
	
	public static synchronized void wish(String name) {

		for (int i = 0; i < 3; i++) {
			System.out.print("Good morning: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	
	}
}

class MyThread extends Thread {
	Display3 d;
	String name;

	public MyThread(Display3 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}
