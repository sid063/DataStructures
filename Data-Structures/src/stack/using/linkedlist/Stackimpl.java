package stack.using.linkedlist;

public class Stackimpl {
	Node top;
	Node prev;

	public Stackimpl() {
		top = null;
		prev=null;
	}

	public static void main(String[] args) {
		Stackimpl st = new Stackimpl();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(50);
		st.push(50);
		st.push(50);
		st.push(50);
		st.push(50);

		System.out.println("Now popping stack elemnets: ");
		while (!st.isEmpty()) {
			st.pop();
		}
		
		System.out.println("Stack empty: "+st.isEmpty());
	}

	private void pop() {
		if(top==null)
		{
			System.out.println("Stack underflow.");
			return;
		}
		else
		{
			System.out.println(top.data+" ");
			top = top.next;
		}
	}

	private void push(int data) {
		Node node = new Node(data);
		if(top==null)
		{
			top = node;
		}
		else
		{
			node.next = top;
			top = node;
		}
	}
	
	private boolean isEmpty() {
		return (top==null);
	}
}

