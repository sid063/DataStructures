package linked.list.ops;

public class MergeSortedList {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		LinkedList.pushAtFront(list1, 6);
		LinkedList.pushAtFront(list1, 4);
		LinkedList.pushAtFront(list1, 2);

		LinkedList.pushAtFront(list2, 5);
		LinkedList.pushAtFront(list2, 3);
		LinkedList.pushAtFront(list2, 1);

		System.out.print("Printing List1: ");
		LinkedList.printList(list1);
		System.out.print("Printing List2: ");
		LinkedList.printList(list2);

		LinkedList list = mergeLists(list1, list2);
		LinkedList.printList(list);
		printReverseListRecur(list.head);
		LinkedList.printList(list);
	}

	private static void printReverseListRecur(Node node) {
		if (node == null)
			return;
		printReverseListRecur(node.next);
		System.out.print(node.data + "  ");
	}

	private static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
		if (list1.head == null)
			return list2;
		if (list2.head == null)
			return list1;

		LinkedList list = new LinkedList();
		Node node1 = list1.head;
		Node node2 = list2.head;

		while (node1 != null && node2 != null) {
			if (node1.data < node2.data) {
				LinkedList.pushAtFront(list, node1.data);
				node1 = node1.next;
			} else {
				LinkedList.pushAtFront(list, node2.data);
				node2 = node2.next;
			}
		}

		while (node1 != null) {
			LinkedList.pushAtFront(list, node1.data);
			node1 = node1.next;
		}

		while (node2 != null) {
			LinkedList.pushAtFront(list, node2.data);
			node2 = node2.next;
		}

		return list;
	}
}
