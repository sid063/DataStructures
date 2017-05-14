package arrays;

/* 
 * Print all possible strings that can be made by placing spaces.
 * Example:
 * Input String: ABC
 * Output String:
 * ABC
 * AB C
 * A BC
 * A B C
 */
public class PrintPatternSpace {
	public static void main(String[] args) {
		String str = "ABC";
		printPattern(str);
	}

	private static void printPattern(String str) {
		int n = str.length();
		char[] c = str.toCharArray();
		char[] newC = new char[2 * n];

		newC[0] = c[0];

		recursivePrintPattern(c, newC, 1, 1, n);
	}

	private static void recursivePrintPattern(char[] c, char[] newC, int i, int j, int n) {
		if (i == n) {
			System.out.println(newC);
			return;
		}

		newC[j] = c[i];
		recursivePrintPattern(c, newC, i + 1, j + 1, n);

		newC[j] = ' ';
		newC[j + 1] = c[i];
		recursivePrintPattern(c, newC, i + 1, j + 2, n);
	}

}
