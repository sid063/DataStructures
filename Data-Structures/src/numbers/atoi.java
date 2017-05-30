package numbers;

// The atoi() function takes a string (which represents an integer) as an argument and returns its value.
public class atoi {
	public static void main(String[] args) {
		String str = "89789";
		int val = myAtoi(str);
		System.out.println(str + " : " + val);
	}

	private static int myAtoi(String str) {
		char[] c = str.toCharArray();
		int value = 0;
		for (int i = 0; i < c.length; i++) {
			value = value * 10 + Character.getNumericValue(c[i]);
		}
		return value;
	}
}
