package linked.list.ops;

/* Problem statement: Continuously delete alternate numbers until only one element is left.  
 * Set of numbers: 1 2 3 4 5 6 7 8 9 10 
 * Output:
 * 1 3 5 7 9 
 * 1 5 9 
 * 1 9
 * 1
 */
public class ContinuouslyDeleteAlternateNodes {
	public static void main(String[] args) throws InterruptedException {
		LinkedList ll = new LinkedList();
		for (int i = 1; i <= 100; i++)
			LinkedList.append(ll, i);

		LinkedList.printList(ll);

		printAlternateNodes(ll);
	}

	public static void printAlternateNodes(LinkedList ll) throws InterruptedException {
		Node node;
		node = ll.head;
		while (true) {
			System.out.print(node.data + " ");
			if (node.data == 1 && node.next == null) {
				break;
			}
			if (node.next == null) {
				node = ll.head;
				System.out.println();
			} else if (node.next.next == null) {
				LinkedList.deleteNode(ll, node.next.data);
				node = ll.head;
				System.out.println();
			} else {
				LinkedList.deleteNode(ll, node.next.data);
				node = node.next;
			}
		}
	}
}
