package practice;

import arrays.PrintArrays;

public class sorts {
	public static void main(String[] args) {
		sorts s = new sorts();
		int[] a = { 1, 6, 2, 7, 3, 4, 5 };
		PrintArrays.printArray(a);
		s.sort(a, 0, a.length - 1);
		PrintArrays.printArray(a);
	}

	// Quick Sort.
	private void sort(int[] a, int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	private int partition(int[] a, int low, int high) {
		int pi = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] < a[high]) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}
}
