package stack;

public class Practice1 {
	public static void main(String[] args) {
		int[] a = { 7, 6, 5, 4, 2, 1 };
		printArray(a);
		sort(a);
		printArray(a);
	}

	private static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int b = i - 1;
			while (b >= 0 && a[b] > key) {
				a[b + 1] = a[b];
				b--;
			}
			a[b + 1] = key;
		}
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
