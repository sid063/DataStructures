package Thread;

public class deadlockDemo extends Thread {
	A a = new A();
	B b = new B();

	private void m1() throws InterruptedException {
		this.start();
		a.d1(b);
	}

	@Override
	public void run() {
		try {
			b.d2(a);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		deadlockDemo d1 = new deadlockDemo();
		d1.m1();
	}
}

class A {
	public synchronized void d1(B b) throws InterruptedException {
		System.out.println("Inside A class.");
		Thread.sleep(3000);
		System.out.println("Trying to call B's last method.");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A's last method.");
	}
}

class B {
	public synchronized void d2(A a) throws InterruptedException {
		System.out.println("Inside B class");
		Thread.sleep(3000);
		System.out.println("Trying to call A's last method.");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B's last method.");
	}
}