package arrays;

/*
 * Given a sorted array with possibly duplicate elements, the task is to find 
 * indexes of first and last occurrences of an element x in the given array.
 */
public class FirstAndLastIndex {
	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 5, 5, 5, 7 };
		getFirstAndLastIdx(a, 5);
	}

	private static void getFirstAndLastIdx(int[] a, int x) {
		// Print first index.
		System.out.println(getFirst(a, x, 0, a.length - 1));

		// Print last index.
		System.out.println(getLast(a, x, 0, a.length - 1));
	}

	private static int getLast(int[] a, int x, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (mid == 0 || a[mid] == x && a[mid + 1] > x)
				return mid;
			else if (x < a[mid])
				return getLast(a, x, low, mid - 1);
			else
				return getLast(a, x, mid + 1, high);

		}
		return -1;
	}

	private static int getFirst(int[] a, int x, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (mid == 0 || x > a[mid - 1] && a[mid] == x)
				return mid;
			else if (x > a[mid])
				return getFirst(a, x, mid + 1, high);
			else
				return getFirst(a, x, low, mid - 1);
		}
		return -1;
	}
}
