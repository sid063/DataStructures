package sorting;

public class bubbleSort {

	public static void main(String[] args) {
		// int arr[] = { 64, 25, 12, 13, 11 };
		int arr[] = { 11, 12, 10, 14, 15 };
		int n = arr.length;
		System.out.println("Length: " + n);
		printArray(arr, n);
		sort(arr, n);
		System.out.println("After sorting: ");
		printArray(arr, n);
	}

	private static void sort(int[] a, int n) {

		boolean swap = false;
		if (n < 0)
			return;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				swap = true;
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}

		if (!swap) {
			System.out.println("\nNo more swaps so exiting.");
			return;
		}

		System.out.println();
		printArray(a, n);

		sort(a, n - 1);
	}

	private static void printArray(int[] arr, int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
