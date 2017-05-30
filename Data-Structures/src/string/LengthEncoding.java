package string;

// Given an input string, write a function that returns the Length Encoded string for the input string.
// Example: if the string is wwwwaaadexxxxxx, it should return w4a3d1e1x6, 
// Since there are 4 w's, 3 a's, 1 d, 1 e and 6 x's.
public class LengthEncoding {
	public static void main(String[] args) {
		String s = "wwwwaaadexxxxxx";
		System.out.println(getLengthEncoded(s));
	}

	private static String getLengthEncoded(String s) {
		String les = "";
		char[] c = s.toCharArray();
		Character temp = c[0];
		Integer len = 1;
		for (int i = 1; i < c.length; i++) {
			if (c[i] == temp)
				len++;
			else {
				les = les.concat(temp.toString());
				les = les.concat(len.toString());
				System.out.println(les);
				temp = c[i];
				len = 1;
			}
		}
		les = les.concat(temp.toString());
		les = les.concat(len.toString());

		return les;
	}
}
