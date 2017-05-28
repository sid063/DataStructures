package numbers;

/*
 * Given an array of positive integers. 
 * All numbers occur even number of times except one number which occurs odd number of times. 
 * Find the number in O(n) time & constant space.
 */
public class OddOccurrenceNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 3, 1, 3 };
		System.out.println("Odd occurrence number: " + getOddOccurrence(a));
	}

	// Using XOR operator to find the missing number.
	// XOR of two numbers is 0, if they both are same.
	// Hence all even numbers XOR will become 0.
	private static int getOddOccurrence(int[] a) {
		int res = a[0];
		for (int i = 1; i < a.length; i++) {
			res = res ^ a[i];
		}
		return res;
	}
}
