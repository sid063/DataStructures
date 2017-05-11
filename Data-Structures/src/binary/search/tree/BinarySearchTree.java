package binary.search.tree;

class BinarySearchTree {
	Node root;
	int maxValue;

	public BinarySearchTree() {
		root = null;
		maxValue = 0;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(20);
		bst.insert(90);
		bst.insert(10);
		bst.insert(70);
		bst.insert(60);
		bst.insert(85);
		bst.insert(80);
		bst.insert(84);
		bst.insert(79);
		bst.insert(76);
		bst.insert(73);

		bst.printBST(bst.root);
		System.out.println("\n\nPrinting elements in range: ");
		printInRange(bst.root, 50, 84);

	}

	private static void printInRange(Node node, int k1, int k2) {
		if (node == null)
			return;
		if (node.key < k1)
			printInRange(node.right, k1, k2);
		else if (node.key > k2)
			printInRange(node.left, k1, k2);
		else {
			System.out.print(node.key + " ");
			printInRange(node.left, k1, k2);
			printInRange(node.right, k1, k2);
		}
	}

	@SuppressWarnings("unused")
	private void deleteNode(int key) {
		root = deleteRecur(root, key);
	}

	private Node deleteRecur(Node root, int key) {
		if (root == null) {
			// System.err.println("Node not found.");
			return root;
		}

		if (key < root.key)
			root.left = deleteRecur(root.left, key);
		else if (key > root.key)
			root.right = deleteRecur(root.right, key);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.key = smallestRightSub(root.right);
			root.right = deleteRecur(root.right, root.key);
		}
		return root;
	}

	private int smallestRightSub(Node node) {
		int minv = node.key;

		while (node.left != null) {
			minv = node.left.key;
			node = node.left;
		}
		return minv;
	}

	private void printBST(Node node) {
		if (node == null)
			return;
		else {
			printBST(node.left);
			System.out.print(node.key + " ");
			printBST(node.right);
		}
	}

	private void insert(int item) {
		root = insertRecur(root, item);
	}

	private Node insertRecur(Node root, int item) {
		if (root == null) {
			root = new Node(item);
			return root;
		} else {
			if (item < root.key)
				root.left = insertRecur(root.left, item);
			else if (item > root.key)
				root.right = insertRecur(root.right, item);
			else
				System.out.println("Can't insert duplicates.");
			return root;
		}
	}
}

class Node {
	int key;
	Node left;
	Node right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}
