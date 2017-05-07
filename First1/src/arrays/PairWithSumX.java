package arrays;

public class PairWithSumX {
	public static void main(String[] args) {
		int[] a = { 2, 5, 3, 4, 1, 6, 7, 8 };
		int x = 9;

		findPairAsX(a, x, 8);
	}

	private static void findPairAsX(int[] a, int x, int n) {
		sorting.mergeSort.mergeSorting(a, 0, n - 1);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

		int l = 0;
		int h = n - 1;

	}
}
