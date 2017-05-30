package queue;

//Implement Queue using LL.
public class QueueLL {

	LinkedList ll;
	int front, rear, size, capacity;

	public QueueLL(int capacity) {
		ll = new LinkedList();
		this.capacity = capacity;
		front = rear = -1;
		size = 0;
	}

	public static void main(String[] args) {
		QueueLL q = new QueueLL(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		while (q.size != 0) {
			System.out.print(q.dequeue() + " ");
		}
	}

	public void enqueue(int item) {
		if (size == capacity) {
			System.out.println("Overflow.");
			return;
		}
		System.out.println("Enqueueing " + item);
		if (front == -1) {
			front = 0;
			size++;
			ll.push(item);
		} else {
			rear++;
			size++;
			ll.push(item);
		}

	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Underflow.");
			return -1;
		} else {
			front++;
			size--;
			return ll.delete();
		}
	}
}

class LinkedList {
	Node head;

	public LinkedList() {
		head = null;
	}

	public void push(int item) {
		if (head == null) {
			head = new Node(item);
		} else {
			Node next = head;
			while (next.next != null) {
				next = next.next;
			}
			next.next = new Node(item);
		}
	}

	public int delete() {
		int item = head.data;
		head = head.next;
		return item;
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}