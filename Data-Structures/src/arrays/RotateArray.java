package arrays;

// Left Rotate an array.
public class RotateArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		PrintArrays.printArray(a);
		rotate(a, 3);
		PrintArrays.printArray(a);
	}

	//Left Rotates an array n-times.
	private static void rotate(int[] a, int n) {
		while (n > 0) {
			leftShift(a);
			n--;
		}
	}

	private static void leftShift(int[] a) {
		int temp = a[0];
		int i;
		for (i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[i] = temp;
	}
}
