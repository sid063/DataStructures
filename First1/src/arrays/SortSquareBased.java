package arrays;

import sorting.quickSort;

public class SortSquareBased {
	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, 5, -9, 10 };
		int n = a.length;
		quickSort.printArray(a);
		sort(a, 0, n - 1);
		System.out.print("After sorting:  ");
		quickSort.printArray(a);

		int i = -1;

		while (a[i + 1] < 0) {
			i++;
		}

		System.out.println("Now sorting based of squares....");
		if (i >= 0)
			squareSortedArray(a, i, n - 1);
		else
			squareArray(a);

		quickSort.printArray(a);
	}

	private static void squareArray(int[] a) {

	}

	private static void squareSortedArray(int[] a, int i, int n) {
		int n1 = i + 1;
		int n2 = n - i;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int j = 0; j < n1; j++) {
			L[j] = a[j] * a[j];
		}

		for (int j = 0; j < n2; j++)
			R[j] = a[j + n1] * a[j + n1];

		int l = i, m = 0;
		int k = 0;
		while (l >= 0 && m < n2) {
			if (L[l] < R[m]) {
				a[k] = L[l];
				l--;
			} else {
				a[k] = R[m];
				m++;
			}
			k++;
		}

		while (l >= 0) {
			a[k] = L[l];
			l--;
			k++;
		}

		while (m < n2) {
			a[k] = R[m];
			m++;
			k++;
		}
	}

	private static void sort(int[] a, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(a, l, mid);
			sort(a, mid + 1, r);
			merge(a, l, mid, r);
		}
	}

	private static void merge(int[] a, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = a[l + i];
		}

		for (int i = 0; i < n2; i++) {
			R[i] = a[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}

	}

}
