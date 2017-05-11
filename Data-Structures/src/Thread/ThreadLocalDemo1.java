package Thread;

public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		CustomerDemo c1 = new CustomerDemo("cust1");
		CustomerDemo c2 = new CustomerDemo("cust2");
		CustomerDemo c3 = new CustomerDemo("cust3");
		CustomerDemo c4 = new CustomerDemo("cust4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}

class CustomerDemo extends Thread {
	static int custId = 0;

	private static ThreadLocal tl = new ThreadLocal() {
		@Override
		protected Object initialValue() {
			return ++custId;
		}
	};

	public CustomerDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" has custId: "+tl.get());
	}
}