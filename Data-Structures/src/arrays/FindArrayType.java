package arrays;

/*
	Given an array, it can be of 4 types
	(a) Ascending
	(b) Descending
	(c) Ascending Rotated
	(d) Descending Rotated
	Find out which kind of array it is and return the maximum of that array.
*/

public class FindArrayType {
	public static void main(String[] args) {
		// int[] arr = { 12, 5, 6, 7, 8, 9 };
		// int[] arr = { 4, 5, 6, 7, 8, 1, 2, 3 };
		// int[] arr = { 6, 5, 4, 3, 2, 1, 8, 7 };
		// int[] arr = { 1, 2, 3, 4, 5, 6 };
		// int[] arr = { 6, 5, 4, 3, 2, 1 };

		int[] arr = { 4, 5, 6, 7, 8, 1, 2, 3 };
		int indexWithLargestNum = findIndexWithLargestNum(arr, 0, arr.length - 1);
		int largestNum = arr[indexWithLargestNum];
		String order = findOrder(arr, arr.length, indexWithLargestNum);
		System.out.println("Largest Sum: " + largestNum);
		System.out.println("Order: " + order);
	}

	private static int findIndexWithLargestNum(int a[], int l, int r) {
		if (l == r)
			return l;
		int m = (l + r) / 2;
		if (m == r) {
			if (a[m] > a[l])
				return m;
			else
				return l;
		}

		if (a[m] > a[m + 1]) {
			if (a[m] > a[m - 1])
				return m;
			else if (a[r] > a[m])
				return findIndexWithLargestNum(a, m + 1, r);
			else
				return findIndexWithLargestNum(a, l, m - 1);
		} else {
			if (a[r] < a[m])
				return findIndexWithLargestNum(a, m + 1, r);
			else {
				if (a[l] > a[r])
					return findIndexWithLargestNum(a, l, m - 1);
				else
					return findIndexWithLargestNum(a, m + 1, r);
			}
		}

	}

	private static String findOrder(int a[], int size, int largestIndex) {
		if (size == 1) {
			return "ascending";
		}
		if (largestIndex == 0) {
			if (a[largestIndex + 1] >= a[size - 1]) {
				return "descending";
			} else
				return "ascendingRotated";
		}
		if (largestIndex == size - 1) {
			if (a[0] <= a[largestIndex - 1]) {
				return "ascending";
			} else
				return "descendingRotated";
		} else {
			if (a[largestIndex + 1] > a[largestIndex - 1])
				return "descendingRotated";
			else
				return "ascendingRotated";
		}
	}
}
