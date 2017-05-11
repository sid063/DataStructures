package linked.list.ops;

public class DeleteAlternateNodes {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.append(list, 1);
		LinkedList.append(list, 2);
		LinkedList.append(list, 3);
		LinkedList.append(list, 4);
		LinkedList.append(list, 5);
		LinkedList.append(list, 6);
		LinkedList.append(list, 7);
		LinkedList.append(list, 8);

		LinkedList.printList(list);
		list.head = deleteAlternateNodes(list.head);
		LinkedList.printList(list);
	}

	private static Node deleteAlternateNodes(Node head) {
		if(head==null || head.next == null)
			return head;
		
		Node curr = head;
		curr.next = curr.next.next;
		curr.next = deleteAlternateNodes(curr.next);
		
		return curr;
	}
}
