package linked.list.ops;

public class PairWiseSwap {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.pushAtFront(list, 3);
		LinkedList.pushAtFront(list, 5);
		LinkedList.pushAtFront(list, 2);
		LinkedList.pushAtFront(list, 1);
		LinkedList.pushAtFront(list, 6);
		
		LinkedList.printList(list);
		list.head = pairWiseSwap(list.head);
		LinkedList.printList(list);
	}

	private static Node pairWiseSwap(Node node) {
		if(node==null || node.next==null)
			return node;
		
		node.next.next = pairWiseSwap(node.next.next);
		int item = node.data;
		node.data = node.next.data;
		node.next.data = item;
		return node;
	}

}
