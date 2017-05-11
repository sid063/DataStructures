package sorting;

public class insertionSort {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		printArray(arr);
		sort(arr);
		System.out.print("\nAfter sorting: ");
		printArray(arr);
	}

	private static void sort(int[] arr) {
		System.out.println();
		for (int a = 1; a < arr.length; a++) {
			int key = arr[a];
			int b = a - 1;

			while (b >= 0 && arr[b] > key) {
				arr[b + 1] = arr[b];
				b--;
			}
			arr[b + 1] = key;
		}
	}

	private static void printArray(int[] arr) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
