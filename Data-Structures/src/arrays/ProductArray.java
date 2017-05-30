package arrays;

// Given an array arr[] of n integers, construct a Product Array prod[] (of same size),
// such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
// Solve it without division operator and in O(n).

public class ProductArray {
	public static void main(String[] args) {
		int[] a = { 10, 3, 5, 6, 2 };
		PrintArrays.printArray(a);
		int[] prod = getProductArray(a);
		PrintArrays.printArray(prod);
	}

	// The idea is to construct two arrays, left and right.
	// Left array contains elements which is the product of all elements to the
	// left of its index.
	// Right array contains elements which is the product of all elements to the
	// right of its index.
	private static int[] getProductArray(int[] a) {
		int[] prod = new int[a.length];
		int[] left = new int[a.length];
		int[] right = new int[a.length];

		// First element of left array is 1, since there are no left elements
		// for this index.
		left[0] = 1;

		// Last element of right array is 1, since there are no right elements
		// to the right of this index.
		right[a.length - 1] = 1;

		// Fill up left array.
		for (int i = 1; i < a.length; i++) {
			left[i] = getLeftProd(a, i - 1);
		}

		// Fill up right array.
		for (int i = 0; i < a.length - 1; i++) {
			right[i] = getRightProd(a, i + 1);
		}

		// Get product of left and right arrays.
		for (int i = 0; i < a.length; i++)
			prod[i] = left[i] * right[i];

		return prod;
	}

	private static int getRightProd(int[] a, int i) {
		int prod = 1;
		for (int j = i; j < a.length; j++)
			prod = prod * a[j];
		return prod;
	}

	private static int getLeftProd(int[] a, int i) {
		int prod = 1;
		for (int j = 0; j <= i; j++) {
			prod = prod * a[j];
		}
		return prod;
	}
}
