package string;

public class allPermutations {
	public static void main(String[] args) {
		String s = "abc";

		printAllPerm(s, 0, s.length() - 1);
	}

	private static void printAllPerm(String s, int start, int end) {
		if (start == end)
			System.out.println(s);
		else {
			for (int i = start; i <= end; i++) {
				s = swap(s, i, start);
				printAllPerm(s, start + 1, end);
				s = swap(s, i, start);
			}
		}
	}

	private static String swap(String s, int i, int j) {
		char[] cc = s.toCharArray();
		char t = cc[i];
		cc[i] = cc[j];
		cc[j] = t;
		return String.valueOf(cc);
	}
}
