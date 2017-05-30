package binary.search.tree;

// Check if a given Binary Tree is BST or not.
public class BSTCheck {
	public final static int MIN = -1000;
	public final static int MAX = 1000;

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(3);
		bt.root.left = new Node(2);
		bt.root.right = new Node(5);
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(4);

		printBinaryTree(bt.root);
		if (checkIsBST(bt.root, MIN, MAX))
			System.out.println("its BST");
		else
			System.out.println("its not BST");
	}

	private static boolean checkIsBST(Node node, int min, int max) {
		if (node == null)
			return true;
		if (checkInRange(node.key, min, max) && checkNode(node))
			return (checkIsBST(node.left, min, node.key) && checkIsBST(node.right, node.key, max));

		return false;
	}

	private static boolean checkNode(Node node) {
		return ((node.left == null || node.left.key < node.key) && (node.right == null || node.right.key > node.key));
	}

	private static boolean checkInRange(int key, int min, int max) {
		return (key > min && key < max);
	}

	private static void printBinaryTree(Node node) {
		if (node == null)
			return;

		printBinaryTree(node.left);
		System.out.println(node.key);
		printBinaryTree(node.right);
	}
}

class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

}
