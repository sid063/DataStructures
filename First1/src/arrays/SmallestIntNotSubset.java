package arrays;

// Find the smallest positive integer value that cannot be represented 
// as sum of any subset of a given array
public class SmallestIntNotSubset {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 10, 20, 40 };
		System.out.println("Smallest positive integer: " + getSmallestInt(a));
	}

	private static int getSmallestInt(int[] a) {
		int res = 1;

		for (int i = 0; i < a.length && a[i] <= res; i++)
			res = res + a[i];

		return res;
	}
}
