package two.stack.one.array;

//Implementing two stacks using a single array.
// The idea is to create two stacks using the same array.
// We will have push1() and pop1() methods for stack1. We will have push2() and pop2() methods for stack2.
// For stack1, the array will start from first index. For stack2, the array will start for last index.
public class TwoStackImpl {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push1(4);
		s.push1(3);
		s.push1(2);
		s.push1(1);

		s.push2(9);
		s.push2(8);
		s.push2(7);
		s.push2(6);

		System.out.println("Print stack array: ");
		s.printArray();

		System.out.print("\nStack1: ");
		System.out.print(s.pop1() + " ");
		System.out.print(s.pop1() + " ");
		System.out.print(s.pop1() + " ");
		System.out.print(s.pop1() + " ");

		System.out.print("\nStack2: ");
		System.out.print(s.pop2() + " ");
		System.out.print(s.pop2() + " ");
		System.out.print(s.pop2() + " ");
		System.out.print(s.pop2() + " ");

	}
}

class Stack {
	int top1;
	int top2;
	int[] a = new int[10];

	public Stack() {
		top1 = -1;
		top2 = a.length;
	}

	public void printArray() {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public void push1(int item) {
		if (top1 < top2) {
			a[++top1] = item;
		} else {
			System.out.println("Stack1 overflow.");
		}
	}

	public void push2(int item) {
		if (top2 > top1) {
			a[--top2] = item;
		} else {
			System.out.println("Stack2 overflow.");
		}
	}

	public int pop1() {
		if (top1 == -1) {
			System.out.println("Stack1 is empty.");
			return -1;
		} else {
			int item = a[top1];
			top1--;
			return item;
		}
	}

	public int pop2() {
		if (top2 == a.length) {
			System.out.println("Stack2 is empty.");
			return -1;
		} else {
			int item = a[top2];
			top2++;
			return item;
		}
	}

}
