package linked.list.ops;

public class IdenticalLists {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		LinkedList.pushAtFront(list1, 7);
		LinkedList.pushAtFront(list1, 6);
		LinkedList.pushAtFront(list1, 4);
		LinkedList.pushAtFront(list1, 3);
		LinkedList.pushAtFront(list1, 2);
		LinkedList.pushAtFront(list1, 1);

		LinkedList.pushAtFront(list2, 7);
		LinkedList.pushAtFront(list2, 6);
		LinkedList.pushAtFront(list2, 4);
		LinkedList.pushAtFront(list2, 3);
		LinkedList.pushAtFront(list2, 2);
		LinkedList.pushAtFront(list2, 1);
		
		LinkedList.printList(list1);
		LinkedList.printList(list2);
		
		System.out.println("LinkedLists are identical?: "+checkIdentical(list1.head,list2.head));
	}

	private static Boolean checkIdentical(Node node1, Node node2) {
		if(node1==null && node2==null)
			return true;
		
		if(node1.data==node2.data)
			return checkIdentical(node1.next, node2.next);
		else
			return false;
	}
}
