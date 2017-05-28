package numbers;

public class Replace0With5 {
	public static void main(String[] args) {
		int num = 1020;
		num = replace0with5(num);
		System.out.println(num);
	}

	private static int replace0with5(int num) {
		if (num == 0)
			return 5;
		return replace0with5Recur(num);
	}

	// This method alone won't work in only 1 case, where the number is 0
	// itself.
	private static int replace0with5Recur(int num) {
		if (num == 0)
			return 0;
		int digit = num % 10;
		if (digit == 0)
			digit = 5;

		return replace0with5Recur(num / 10) * 10 + digit;
	}

}
