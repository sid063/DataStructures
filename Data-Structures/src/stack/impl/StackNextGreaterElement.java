package stack.impl;

import java.util.Stack;

public class StackNextGreaterElement {
	public static void main(String[] args) {
		int a[] = { 4, 5, 2, 3, 25 };
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();

		printNGE(a);
	}

	private static void printNGE(int[] a) {
		java.util.Stack<Integer> s = new Stack<Integer>();
		s.push(a[0]);
		int element, next;

		for (int i = 1; i < a.length; i++) {
			next = a[i];
			if (!s.isEmpty()) {
				element = s.pop();
				while (element < next) {
					System.out.println(element + "-->" + next);
					if (s.isEmpty())
						break;
					element = s.pop();
				}

				if (element > next) {
					s.push(element);
				}
			}
			s.push(next);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop() + "-->-1");
		}
	}
}
