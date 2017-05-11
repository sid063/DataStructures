package linked.list.ops;

public class LinkedList {

	Node head;

	public LinkedList() {
		head = null;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Inserting at head.");
		pushAtFront(list, 5);
		pushAtFront(list, 4);

		printList(list);
		append(list, 3);
		append(list, 2);
		append(list, 1);

		System.out.println();
		printList(list);

		insertAfterNode(list, 6, list.head.next.next);
		insertAfterNode(list, 7, list.head.next.next);
		System.out.println();
		printList(list);

		deleteNode(list, 4);
		System.out.println();
		printList(list);

		deletAtPosition(list, 0);
		System.out.println();
		printList(list);
	}

	// Delete at a particular position.
	public static void deletAtPosition(LinkedList list, int position) {
		int curr = 0;
		Node currNode = list.head;
		Node prev = null;
		if (curr == position) {
			list.head = list.head.next;
			return;
		}
		while (curr != position) {
			curr++;
			prev = currNode;
			currNode = currNode.next;
			if (currNode == null) {
				System.out.println("\nPosition does not exist.");
				return;
			}
		}

		prev.next = currNode.next;
	}

	public static void deleteNode(LinkedList list, int data) {
		Node temp = list.head;

		if (temp != null && temp.data == data) {
			list.head = list.head.next;
			return;
		}

		while (temp.next.data != data) {
			temp = temp.next;
			if (temp.next == null) {
				System.err.println("\nFor delete node operation, node does not exist");
				return;
			}
		}

		temp.next = temp.next.next;
	}

	public static void insertAfterNode(LinkedList list, int data, Node nextNode) {
		Node newNode = new Node(data);
		Node afterNode = list.head;
		while (afterNode != nextNode) {
			afterNode = afterNode.next;
			if (afterNode == null) {
				System.out.println("For insertAfterNode operation, Node does not exist.");
				return;
			}
		}
		Node temp = afterNode.next;
		afterNode.next = newNode;
		newNode.next = temp;

	}

	public static void append(LinkedList list, int data) {
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public static void pushAtFront(LinkedList list, int data) {
		Node newNode = new Node(data);
		if (list.head == null) {
			list.head = newNode;
		} else {
			newNode.next = list.head;
			list.head = newNode;
		}
	}

	public static void printList(LinkedList linkList) {
		Node node = linkList.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static int getLength(LinkedList list) {
		int count = 0;
		Node head = list.head;
		while (head != null) {
			count++;
			head = head.next;
		}
		
		return count;
	}
}

class Node {
	int data;
	Node next;

	public Node(int item) {
		data = item;
		next = null;
	}
}