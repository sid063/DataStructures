package stack;

import java.util.Stack;

//Program to reverse a stack using recursion.
public class ReverseUsingRecursion {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(6);
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println(stack.toString());
		reverseStack(stack);
		System.out.println(stack.toString());
	}

	public static void reverseStack(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			int bottom = popBottom(stack);
			
			//now reverse the stack without the bottom element in the current stack.
			reverseStack(stack);
			
			//This will come in the end ==> its FILO call. Hence this bottom with be pushed in the end.
			stack.push(bottom);
		}
	}

	//Opposite of push method. Push the element at the bottom of the stack.
	private static Integer popBottom(Stack<Integer> stack) {
		int top = stack.pop();
		if (stack.isEmpty())
			return top;
		else {
			int bottom = popBottom(stack);
			stack.push(top);
			return bottom;
		}
	}
}
