package linked.list.ops;

public class MoveLastToFront {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.pushAtFront(list, 3);
		LinkedList.pushAtFront(list, 5);
		LinkedList.pushAtFront(list, 2);
		LinkedList.pushAtFront(list, 1);
		LinkedList.pushAtFront(list, 6);
		LinkedList.pushAtFront(list, 7);
		
		LinkedList.printList(list);
		list = moveLastToFront(list);
		LinkedList.printList(list);
	}

	private static LinkedList moveLastToFront(LinkedList list) {
		Node head = list.head;
		Node last = list.head;
		Node prev = null;
		while(last.next!=null)
		{
			prev = last;
			last = last.next;
		}

		prev.next = null;
		last.next = head;
		list.head = last;
		return list;
	}
}
