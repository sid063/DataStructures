package arrays;

public class RotateArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		PrintArrays.printArray(a);
		rotate(a, 3);
		PrintArrays.printArray(a);
	}

	private static void rotate(int[] a, int n) {
		while (n > 0) {
			leftShiftGFG(a);
			n--;
		}
	}

	// From gfg.
	private static void leftShiftGFG(int[] a) {
		int temp = a[0];
		int i;
		for (i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
	}

	// My own impl.
	private static void leftShift(int[] a) {
		int d = a[a.length - 1];
		for (int i = a.length - 1; i >= 0; i--) {
			if ((i - 1) == -1) {
				int temp = d;
				d = a[a.length - 1];
				a[a.length - 1] = temp;
			} else {
				int temp = d;
				d = a[i - 1];
				a[i - 1] = temp;
			}
		}
	}
}
