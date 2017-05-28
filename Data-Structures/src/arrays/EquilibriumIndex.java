package arrays;

/*
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes 
 * is equal to the sum of elements at higher indexes.
 */
public class EquilibriumIndex {
	public static void main(String[] args) {
		int[] a = { -7, 1, 5, 2, -4, 3, 0 };
		int idx = getEquilibriumIndex(a);
		if (idx == -1) {
			System.out.println("No equilibrium index.");
		} else {
			System.out.println("Equilibrium index: " + idx);
		}
	}

	private static int getEquilibriumIndex(int[] a) {
		int sum = getSum(a);
		int leftSum = 0;
		int k = -1;
		for (int i = 0; i < a.length; i++) {
			sum = sum - a[i];
			if (leftSum == sum) {
				return i;
			}
			leftSum = leftSum + a[i];
		}
		return k;
	}

	private static int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
