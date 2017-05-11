package stack;

public class fact {
	public static void main(String[] args) {
		System.out.println("Factoral of 6 is: " + findFactorial(6));
	}

	private static int findFactorial(int i) {
		if(i<=1)
			return 1;
		else
		{
			return i*findFactorial(i-1);
		}
	}
}
