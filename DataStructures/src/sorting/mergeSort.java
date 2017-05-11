package sorting;

public class mergeSort {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 2, 7, 3, 4, 5 };
		printArray(arr);
		mergeSorting(arr, 0, arr.length - 1);
		System.out.println("After sorting: ");
		printArray(arr);
	}

	public static void mergeSorting(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSorting(arr, l, m);
			mergeSorting(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int i = 0; i < n2; i++) {
			R[i] = arr[m + 1 + i];
		}
		int i = 0, j = 0;

		// You make mistake Here. k=l, not zero.
		// Keep this in mind.
		int k = l;

		while (i < n1 && j < n2) {
			// You make mistake Here. Watch these loop.
			if (L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
