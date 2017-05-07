package arrays;

public class segregate0And1And2 {

	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 0, 0, 0, 0, 1,1, 1, 1, 1 };
		segregate0sAnd1s.printArray(a);
		segregate(a);
		segregate0sAnd1s.printArray(a);
	}

	private static void segregate(int[] a) {
		int low = 0;
		int high = a.length - 1;
		int mid = 0;

		while (mid <= high) {
			switch (a[mid]) {
			case 0: {
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = a[high];
				a[high] = a[mid];
				a[mid] = temp;
				high--;
				break;
			}
			}
		}
	}
}
