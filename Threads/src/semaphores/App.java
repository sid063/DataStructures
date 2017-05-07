package semaphores;

import java.util.concurrent.Semaphore;

public class App {
	public static void main(String[] args) throws InterruptedException {
		
		//Semaphore with 1 permit.
		Semaphore sem = new Semaphore(1);
		
		//increases the number of permits.
		sem.release();
		
		//decreases the number of permits.
		//waits if no permits available.
		sem.acquire();
		
		System.out.println("Available permits: "+sem.availablePermits());
	}
}
