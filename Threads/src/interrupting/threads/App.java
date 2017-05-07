package interrupting.threads;

import java.util.Random;

public class App {
		public static void main(String[] args) {
			Random ran = new Random();
			System.out.println("Started...");
			for(int i=0; i<20E7 ; i++)
			{
				Math.sin(ran.nextDouble());
			}
			System.out.println("Finished.");
		}
}
