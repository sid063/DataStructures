package Thread;

public class OddEvenThreads {
	public static void main(String[] args) {
		OddThread ot = new OddThread();
		EvenThread et = new EvenThread();

		ot.setT(et);
		et.setT(ot);

		ot.start();
		et.start();
	}
}

class OddThread extends Thread {
	Thread t;

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	@Override
	public synchronized void run() {
		synchronized (this) {
			try {
				for (int i = 1; i < 100; i++) {
					System.out.println("Odd thread: " + i);
					while (!t.getState().equals(Thread.State.WAITING))
						t.notify();
					Thread.currentThread().wait();
				}
			} catch (Exception e) {

			}
		}
	}
}

class EvenThread extends Thread {
	Thread t;

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	@Override
	public synchronized void run() {
		synchronized (this) {
			try {
				for (int i = 2; i <= 100; i = i + 2) {
					System.out.println("Even thread: " + i);
					while (!t.getState().equals(Thread.State.WAITING))
						t.notify();
					Thread.currentThread().wait();
				}
			} catch (Exception e) {

			}
		}
	}
}
