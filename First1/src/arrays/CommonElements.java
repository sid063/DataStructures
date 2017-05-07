package arrays;

// Find common elements in three sorted array.
public class CommonElements {
	public static void main(String[] args) {
		int[] input1 = { 1, 5, 10, 20, 40, 80 };
		int[] input2 = { 6, 7, 20, 80, 100 };
		int[] input3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

		findCommonElt(input1, input2, input3);
	}

	private static void findCommonElt(int[] a, int[] b, int[] c) {
		int i1 = 0, i2 = 0, i3 = 0;
		int n1 = a.length, n2 = b.length, n3 = c.length;
		int max = 0;
		while (i1 < n1 && i2 < n2 && i3 < n3) {
			max = getMax(a[i1], b[i2], c[i3]);
			while (a[i1] < max && i1 < n1)
				i1++;

			while (b[i2] < max && i2 < n2)
				i2++;

			while (c[i3] < max && i3 < n3)
				i3++;

			if (a[i1] == b[i2] && b[i2] == c[i3]) {
				System.out.print(a[i1] + " ");
				i1++;
				i2++;
				i3++;
			}
		}
	}

	private static int getMax(int e1, int e2, int e3) {
		if (e1 > e2) {
			return (e1 > e3) ? e1 : e3;
		} else {
			return (e2 > e3) ? e2 : e3;
		}
	}
}
