package numbers;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Given a number n, write a function that generates 
 * and prints all binary numbers with decimal values from 1 to n.
 */
public class PrintAllBinaryNumbers {
	public static void main(String[] args) {
		int n = 10;
		printAllBinaries(n);
	}

	// Idea is to use a queue.
	// Push 1 into the queue initially.
	// Remove the front, store it in a string and print it.
	// Append '0' to this string and push to queue.
	// Append '1' to this string and push to queue.
	private static void printAllBinaries(int n) {
		Queue<String> q = new LinkedBlockingQueue<String>();
		q.add("1");
		while (n > 0) {
			String s1 = q.remove();
			System.out.println(s1);
			q.add(s1.concat("0"));
			q.add(s1.concat("1"));
			n--;
		}
	}
}
