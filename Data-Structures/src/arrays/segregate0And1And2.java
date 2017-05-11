package arrays;

public class segregate0And1And2 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
		segregate0sAnd1s.printArray(a);
		segregate(a);
		segregate0sAnd1s.printArray(a);
	}

	private static void segregate(int[] a) {
		int low = 0, mid = 0;
		int high = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			switch (a[mid]) {
			case 0: {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
				break;
			}
			}
		}
	}
}
