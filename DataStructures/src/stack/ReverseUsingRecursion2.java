package stack;

import java.util.Stack;

public class ReverseUsingRecursion2 {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(6);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println(stack.toString());
		reverseStack2(stack);
		System.out.println(stack.toString());
	}

	private static void reverseStack2(Stack<Integer> stack) {
	}
}
