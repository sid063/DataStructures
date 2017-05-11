package Thread;

public class ThreadLocalDemo{
	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal(){
			@Override
			protected String initialValue() {
				return "defaultValue";
			}
		};
		System.out.println(tl.get());
		tl.set("sid2");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}

class MyRunnable1 implements Runnable
{
	@Override
	public void run() {
		ThreadLocal l = new ThreadLocal<>();
		
	}
}