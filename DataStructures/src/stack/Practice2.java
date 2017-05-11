package stack;

import java.util.Stack;

//Reverse a stack using recursion.
public class Practice2 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		System.out.println(s.toString());
		reverseStack(s);
		System.out.println(s.toString());
	}

	private static void reverseStack(Stack<Integer> s) {
		if (!s.isEmpty()) {
			int bottom = popBottom(s);
			reverseStack(s);
			s.push(bottom);
		}
	}

	private static int popBottom(Stack<Integer> s) {
		int top = s.pop();
		if (s.isEmpty())
			return top;
		else {
			int bottom = popBottom(s);
			s.push(top);
			return bottom;
		}
	}

}
