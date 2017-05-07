package sorting;

public class selectionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 12, 11 };
		int n = arr.length;

		System.out.println("Before sorting.......");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		selectionSort(arr, 0);
		System.out.println();
		System.out.println("After sorting.......");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr, int i) {
		int k = i;
		if (i == arr.length)
			return;

		int min = arr[i];
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
				k = j;
			}
		}

		if (k != i) {
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
		}

		selectionSort(arr, i + 1);
	}
}
