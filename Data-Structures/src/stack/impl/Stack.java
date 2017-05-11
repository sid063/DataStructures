package stack.impl;

/*
 * Push
 * Pop
 * Peek
 * isEmpty
 */

public class Stack {
	int top;
	int a[] = new int[5];
	
	Stack()
	{
		top=-1;
	}
	
	public void push(int item)
	{
		if(top>10)
		{
			System.out.println("Stack overflow.");
			return;
		}
		else
		{
			a[++top]=item;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack already empty.");
			return 0;
		}
		int item = a[top];
		top--;
		return item;
	}
	
	public int peek()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return (top<0);
	}
}

class test
{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

		while(!s.isEmpty())
		{
		System.out.println(s.pop());
		}

		if(s.isEmpty())
			System.out.println("Stack is empty.");
	}
}
