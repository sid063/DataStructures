package linked.list.ops;

public class MergeSortForLL {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.pushAtFront(list, 8);
		LinkedList.pushAtFront(list, 7);
		LinkedList.pushAtFront(list, 2);
		LinkedList.pushAtFront(list, 5);
		LinkedList.pushAtFront(list, 9);
		LinkedList.pushAtFront(list, 1);
		LinkedList.pushAtFront(list, 4);
		LinkedList.pushAtFront(list, 10);
		LinkedList.pushAtFront(list, 3);
		LinkedList.pushAtFront(list, 6);

		LinkedList.printList(list);
		list.head = mergeSort(list, 0, length(list.head) - 1);
		LinkedList.printList(list);
	}

	private static Node mergeSort(LinkedList list, int low, int high) {
		if (low < high) {
			int mid = (high + low) / 2;
			mergeSort(list, low, mid);
			mergeSort(list, mid + 1, high);
			merge(list, low, mid, high);
		}
		return list.head;
	}

	private static void merge(LinkedList list, int low, int mid, int high) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		Node head = list.head;
		while (low < mid) {
			LinkedList.pushAtFront(list1, head.data);
			head = head.next;
			low++;
		}

		while (mid < high) {
			LinkedList.pushAtFront(list2, head.data);
			head = head.next;
			mid++;
		}

		Node head1 = list1.head;
		Node head2 = list2.head;

		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				LinkedList.pushAtFront(list, head1.data);
				head1 = head1.next;
			} else {
				LinkedList.pushAtFront(list, head2.data);
				head2 = head2.next;
			}
		}

		while (head1 != null) {
			LinkedList.pushAtFront(list, head1.data);
			head1 = head1.next;
		}

		while (head2 != null) {
			LinkedList.pushAtFront(list, head2.data);
			head2 = head2.next;
		}

	}

	private static int length(Node head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}

}
