package stack;

import java.util.Scanner;

public class recurSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		int k = 2;
		int sum = 0;
		sumRecur(a, k, sum);
		sc.close();
	}

	private static void sumRecur(int a, int k, int sum) {
		sum = sum + a;
		k--;
		if (k > 0) {
			System.out.println("Enter number: ");
			a = sc.nextInt();
			sumRecur(a, k, sum);
		} else {
			System.out.println("Sum is: " + sum);
		}
	}
}
