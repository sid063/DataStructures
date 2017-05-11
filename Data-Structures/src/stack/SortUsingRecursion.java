package stack;

import java.util.Stack;

public class SortUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(3);

		System.out.println(stack.toString());
		recursiveSort(stack);
		System.out.println(stack.toString());
	}

	private static void recursiveSort(Stack<Integer> stack) {
		if (stack.isEmpty())
			return;
		else {
			int element = stack.pop();
			recursiveSort(stack);
			sortedInsert(stack, element);
		}
	}

	private static void sortedInsert(Stack<Integer> stack, int element) {
		if (stack.isEmpty() || element > stack.peek())
			stack.push(element);
		else {
			int temp = stack.pop();
			sortedInsert(stack, element);
			stack.push(temp);
		}
	}
}
