package arrays;

public class Top2Numbers {
	public static void main(String[] args) {
		int[] a = { 1000, 92, 20, 34, 21, 87 };
		getTop2Numbers(a);
	}

	private static void getTop2Numbers(int[] a) {
		int max1; // Greater
		int max2;
		if (a[0] > a[1]) {
			max1 = a[0];
			max2 = a[1];
		} else {
			max2 = a[0];
			max1 = a[1];
		}
		for (int j = 2; j < a.length; j++) {
			if (a[j] > max1) {
				max2 = max1;
				max1 = a[j];
			}
		}
		
		System.out.println("Top 2 elts are: " + max1 + " and " + max2);
	}
}
