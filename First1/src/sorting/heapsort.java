package sorting;

public class heapsort {
	public static void main(String[] args) {

		// int arr[] = { 4, 10, 3, 5, 1 };
		int arr[] = { 1, 6, 2, 7, 3, 4, 5 };
		printArray(arr);
		sort(arr);
		System.out.println("After sorting: ");
		printArray(arr);
	}

	private static void sort(int[] a) {
		int n = a.length;

		for (int i = (n / 2 - 1); i >= 0; i--)
			heapify(a, n, i);

		for (int i = n - 1; i >= 0; i--) {
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;

			heapify(a, i, 0);
		}
	}

	private static void heapify(int[] a, int n, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && a[l] > a[largest])
			largest = l;

		if (r < n && a[r] > a[largest])
			largest = r;

		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;

			// To heapify child nodes of the current sub-tree, since this change
			// may affect all child nodes as well.
			heapify(a, n, largest);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
