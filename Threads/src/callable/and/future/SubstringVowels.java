package callable.and.future;

import java.util.Scanner;

class SubstringVowels {
	public static void main(String args[]) throws Exception {

		// Scanner
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			System.out.println("String: " + s);
			
			s.substring(0, N);
		}

	}
}
