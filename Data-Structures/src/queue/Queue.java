package queue;

//Queue implementation using Arrays.
public class Queue {
	int[] a;
	int capacity, size;
	int front, rear;

	public Queue(int capacity) {
		this.capacity = capacity;
		size = 0;
		a = new int[capacity];
		front = rear = -1;
	}

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(5);

		while (q.size != 0)
			System.out.println(q.dequeue() + " ");
	}

	public void enqueue(int item) {
		if (size == capacity) {
			System.out.println("Overflow.");
			return;
		}
		if (front == -1) {
			front = rear = 0;
			size = 1;
			a[front] = item;
		} else {
			rear++;
			size++;
			a[rear] = item;
		}
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Underflow.");
			return -1;
		}
		int item = a[front];
		front++;
		size--;
		return item;
	}
}
