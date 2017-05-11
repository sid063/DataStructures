package linked.list.ops;

public class IntersectionOfSortedLists {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		LinkedList.pushAtFront(list1, 7);
		LinkedList.pushAtFront(list1, 6);
		LinkedList.pushAtFront(list1, 4);
		LinkedList.pushAtFront(list1, 3);
		LinkedList.pushAtFront(list1, 2);
		LinkedList.pushAtFront(list1, 1);

		LinkedList.pushAtFront(list2, 8);
		LinkedList.pushAtFront(list2, 7);
		LinkedList.pushAtFront(list2, 6);
		LinkedList.pushAtFront(list2, 4);
		LinkedList.pushAtFront(list2, 2);

		System.out.print("List1: ");
		LinkedList.printList(list1);
		System.out.print("List2: ");
		LinkedList.printList(list2);

		LinkedList intersectionList = getIntersection(list1, list2);
		System.out.print("Intersection List: ");
		LinkedList.printList(intersectionList);
	}

	private static LinkedList getIntersection(LinkedList list1, LinkedList list2) {
		if (list1 == null)
			return null;

		if (list2 == null)
			return null;

		LinkedList list = new LinkedList();

		Node node1 = list1.head;
		Node node2 = list2.head;

		while (node1 != null && node2 != null) {
			if (node1.data < node2.data)
				node1 = node1.next;
			else if (node1.data > node2.data)
				node2 = node2.next;
			else {
				LinkedList.append(list, node1.data);
				node1 = node1.next;
				node2 = node2.next;
			}
		}

		return list;
	}
}
