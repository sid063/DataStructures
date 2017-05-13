package arrays;

/*
 * Find the square root of a number.
 * If the number is not a perfect square, then return the square root of the 
 * closest perfect square smaller than that number. 
 * 
 */
public class SquareRoot {
	public static void main(String[] args) throws InterruptedException {
		int x = 10;
		int sqrt = getSquareRoot(x, 0, x);
		System.out.println("Square root of " + x + " is: " + sqrt);
	}

	private static int getSquareRoot(int x, int start, int end) {
		int mid = (start + end) / 2;

		if (start == mid)
			return start;

		if (mid * mid == x)
			return mid;
		else if (mid * mid > x)
			return getSquareRoot(x, start, mid);
		else
			return getSquareRoot(x, mid, end);
	}
}
