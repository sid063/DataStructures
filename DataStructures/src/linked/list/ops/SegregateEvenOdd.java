package linked.list.ops;

public class SegregateEvenOdd {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		LinkedList.pushAtFront(list1, 8);
		LinkedList.pushAtFront(list1, 1);
		LinkedList.pushAtFront(list1, 3);
		LinkedList.pushAtFront(list1, 4);
		LinkedList.pushAtFront(list1, 2);
		LinkedList.pushAtFront(list1, 5);

		LinkedList.printList(list1);
		System.out.println();
		list1.head = segregateEvenOddNodes(list1.head);
		LinkedList.printList(list1);
	}

	//This method is moving all odd nodes, starting from head, to the end.
	private static Node segregateEvenOddNodes(Node head) {
		Node end = head;
		Node prev = null;
		Node curr = head;

		/* Get pointer to last Node */
		while (end.next != null)
			end = end.next;

		Node new_end = end;

		// Consider all odd nodes before getting first eve node
		while (curr.data % 2 != 0 && curr != end) {
			new_end.next = curr;
			curr = curr.next;
			new_end.next.next = null;
			new_end = new_end.next;
		}

		// do following steps only if there is an even node
		if (curr.data % 2 == 0) {
			head = curr;

			// now curr points to first even node
			while (curr != end) {
				if (curr.data % 2 == 0) {
					prev = curr;
					curr = curr.next;
				} else {
					/* Break the link between prev and curr */
					prev.next = curr.next;

					/* Make next of curr as null */
					curr.next = null;

					/* Move curr to end */
					new_end.next = curr;

					/* Make curr as new end of list */
					new_end = curr;

					/* Update curr pointer */
					curr = prev.next;
				}
			}

		}

		/* We have to set prev before executing rest of this code */
		else
			prev = curr;

		if (new_end != end && end.data % 2 != 0) {
			prev.next = end.next;
			end.next = null;
			new_end.next = end;
		}

		return head;
	}

	private static boolean isOdd(int data) {
		if (data % 2 == 1)
			return true;
		return false;
	}

	private static boolean isEven(int data) {
		if (data % 2 == 0)
			return true;
		return false;
	}
}

