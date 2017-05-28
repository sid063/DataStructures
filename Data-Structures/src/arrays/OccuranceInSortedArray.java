package arrays;

/*
 * Given a sorted array.
 * Find the number of occurrence of a given number in O(logn) time.
 */
public class OccuranceInSortedArray {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4 };
		findOccurence(a, 2);
	}

	// The idea is to find the first occurrence index and the last occurrence
	// index using Binary Search and then find the difference.
	private static void findOccurence(int[] a, int x) {
		int n = a.length;
		int first = findFirst(a, x, 0, n - 1);
		System.out.println(first);
		int last = findLast(a, x, 0, n - 1);
		System.out.println("First occurrence of " + x + " is: " + first);
		System.out.println("Last occurrence of " + x + " is: " + last);
		System.out.println("Number of occurrences of " + x + " is: " + (last - first + 1));
	}

	private static int findLast(int[] a, int x, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (mid == high || a[mid] == x && a[mid + 1] > x)
				return mid;
			else if (a[mid] > x)
				return findLast(a, x, low, mid - 1);
			else
				return findLast(a, x, mid + 1, high);
		}
		return -1;
	}

	private static int findFirst(int[] a, int x, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (mid == 0 || x > a[mid - 1] && a[mid] == x)
				return mid;
			else if (x > a[mid])
				return findFirst(a, x, mid + 1, high);
			else
				return findFirst(a, x, low, mid - 1);
		}
		return -1;
	}
}
