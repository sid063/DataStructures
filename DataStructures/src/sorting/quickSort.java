package sorting;

public class quickSort {

	public static void main(String[] args) {
		int a[] = { 1, 8, 3, 9, 4, 5, 7 };

		printArray(a);
		sort(a);
		printArray(a);
	}

	public static void sort(int[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int low, int high) {
		if (low < high) {
			int pi = partition(a, low, high);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int i = low - 1;
		int pivot = a[high];
		int temp;

		for (int j = low; j < high; j++) {
			if (a[j] < pivot) {
				i++;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i + 1;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
