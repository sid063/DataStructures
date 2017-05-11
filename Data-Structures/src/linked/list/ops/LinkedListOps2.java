package linked.list.ops;

public class LinkedListOps2 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.pushAtFront(list, 5);
		LinkedList.pushAtFront(list, 4);
		LinkedList.pushAtFront(list, 9);
		LinkedList.pushAtFront(list, 2);
		LinkedList.pushAtFront(list, 1);

		LinkedList.printList(list);
		System.out.println();
		list.head = LinkedListOps2.reverseList(list.head);
		LinkedList.printList(list);
	}

	public static Node reverseList(Node head) {
		if(head==null)
			return head;
		
		Node curr = head;
		Node prev = null;
		Node next = null;
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}
