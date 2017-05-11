package Thread;

public class EvenOddThreadDemo {

	public static void main(String[] args) {
		// shared class object
		SharedPrinter sp = new SharedPrinter();
		// creating two threads
		Thread t1 = new Thread(new EvenNumProducer(sp, 100));
		Thread t2 = new Thread(new OddNumProducer(sp, 100));
		// starting threads
		t1.start();
		t2.start();
	}

}

// Shared class used by both threads
class SharedPrinter {
	boolean evenFlag = false;

	// Method for printing even numbers
	public void printEvenNum(int num) {
		synchronized (this) {
			// While condition as mandated to avoid spurious wakeup
			while (!evenFlag) {
				try {
					// asking current thread to give up lock
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(num);
			evenFlag = false;
			// Wake up thread waiting on this monitor(lock)
			notify();

		}

	}

	// Method for printing odd numbers
	public void printOddNum(int num) {
		synchronized (this) {
			// While condition as mandated to avoid spurious wakeup
			while (evenFlag) {
				try {
					// asking current thread to give up lock
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(num);
			evenFlag = true;
			// Wake up thread waiting on this monitor(lock)
			notify();

		}
	}
}

// Thread Class generating Even numbers
class EvenNumProducer implements Runnable {
	SharedPrinter sp;
	int index;

	EvenNumProducer(SharedPrinter sp, int index) {
		this.sp = sp;
		this.index = index;
	}

	@Override
	public void run() {
		for (int i = 2; i <= index; i = i + 2) {
			sp.printEvenNum(i);
		}

	}

}

// Thread Class generating Odd numbers
class OddNumProducer implements Runnable {
	SharedPrinter sp;
	int index;

	OddNumProducer(SharedPrinter sp, int index) {
		this.sp = sp;
		this.index = index;
	}

	@Override
	public void run() {
		for (int i = 1; i <= index; i = i + 2) {
			sp.printOddNum(i);
		}
	}
}