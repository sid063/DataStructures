package arrays;

public class SquareRoot {
	public static void main(String[] args) throws InterruptedException {
		int x = 17;
		int sqrt = getSquareRoot(x);
		System.out.println("Square root of " + x + " is: " + sqrt);
	}

	private static int getSquareRoot(int x) throws InterruptedException {
		int start = 0;
		int end = x;
		int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (mid * mid == x)
				return mid;
			if (start == mid)
				return mid;
			else if (mid * mid > x)
				end = mid;
			else
				start = mid;
		}

		return -1;
	}
}
