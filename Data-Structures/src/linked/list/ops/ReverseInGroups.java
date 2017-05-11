package linked.list.ops;

public class ReverseInGroups {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.pushAtFront(list, 6);
		LinkedList.pushAtFront(list, 5);
		LinkedList.pushAtFront(list, 4);
		LinkedList.pushAtFront(list, 3);
		LinkedList.pushAtFront(list, 2);
		LinkedList.pushAtFront(list, 1);

		LinkedList.printList(list);
		list.head = reverseInGroups(list.head, 3);
		LinkedList.printList(list);
	}

	public static Node reverseInGroups(Node head, int k) {
		Node current = head;
		Node next = null;
		Node prev = null;

		int count = 0;

		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null)
			head.next = reverseInGroups(next, k);

		return prev;
	}
}
