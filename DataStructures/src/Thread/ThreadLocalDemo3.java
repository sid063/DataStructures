package Thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalDemo3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ThreadPoolExecutor ec = new ThreadPoolExecutor(0, 0, 0, TimeUnit.DAYS, new LinkedBlockingQueue<Runnable>());

		ParentThread pt = new ParentThread();
		pt.start();
	}
}

class ParentThread extends Thread {

	@SuppressWarnings("rawtypes")
	static InheritableThreadLocal tl = new InheritableThreadLocal() {
		@Override
		protected Object childValue(Object parentValue) {
			return parentValue + " cc";
		}
	};

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		tl.set("pp");
		System.out.println("Parent Thread TL value: " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread {

	@Override
	public void run() {
		System.out.println("Parent Thread Value in child thread: " + ParentThread.tl.get());
	}

}