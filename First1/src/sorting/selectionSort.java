package sorting;

import arrays.PrintArrays;

public class selectionSort {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 12, 11 };
		int n = arr.length;

		System.out.println("Before sorting.......");
		PrintArrays.printArray(arr);

		selectionSortIt(arr, 0);
		System.out.println();
		System.out.println("After sorting.......");
		PrintArrays.printArray(arr);
	}

	private static void selectionSortIt(int[] arr, int i) {
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

		selectionSortIt(arr, i + 1);
	}
}
