package linked.list.ops;

public class SegregateOddEvenNodes {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		LinkedList.pushAtFront(list1, 7);
		LinkedList.pushAtFront(list1, 6);
		LinkedList.pushAtFront(list1, 5);
		LinkedList.pushAtFront(list1, 4);
		LinkedList.pushAtFront(list1, 3);
		LinkedList.pushAtFront(list1, 2);
		LinkedList.pushAtFront(list1, 1);

		LinkedList.printList(list1);
		System.out.println();
		list1.head = segregateEvenOddNodes(list1.head);
		LinkedList.printList(list1);
	}

	private static Node segregateEvenOddNodes(Node head) {
		Node odd = head;
		Node even = head.next;
		Node evenFirst = even;

		while (true) {
			if (odd == null || even == null || even.next == null) {
				odd.next = evenFirst;
				break;
			}
			odd.next = even.next;
			odd = even.next;

			if (odd.next == null) {
				even.next = null;
				odd.next = evenFirst;
				break;
			}

			even.next = odd.next;
			even = odd.next;

		}
		return head;
	}
}
