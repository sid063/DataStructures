package depth.first.traversals;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);

		System.out.print("Inorder: ");
		printInOrder(bt.root);
		System.out.print("\nPreOrder: ");
		printPreOrder(bt.root);
		System.out.print("\nPostOrder: ");
		printPostOrder(bt.root);

	}

	private static void printPostOrder(Node node) {
		if (node == null)
			return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}

	private static void printPreOrder(Node node) {
		if (node == null)
			return;

		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	private static void printInOrder(Node node) {
		if (node == null)
			return;
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}
}
