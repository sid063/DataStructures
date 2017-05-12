package level.order.traversal;

class Node {
	int key;
	Node left, right;

	Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	private void printLevelOrder(Node node) {
		int height = height(node);
		for (int i = 1; i <= height; i++) {
			System.out.println(); // To print levels line by line.
			printGivenLevel(node, i);
		}
	}
	
	private static void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1) {
			System.out.print(node.key + " ");
		} else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}
	}

	// Calculate height of the tree.
	private static int height(Node node) {
		if (node == null)
			return 0;
		else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			if (lheight > rheight)
				return lheight + 1;
			else
				return rheight + 1;
		}

	}

	public static void main(String[] args) {
		
		/*
		 * 	    1
		 *  	  /    \
		 *      2       3
		 *    /	  \   /	  \
		 *   4    5   7    8
		 *      /   \
		 *     10   11
		 *    /
		 *   12
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		tree.root.right.right = new Node(8);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(11);
		tree.root.left.right.left.left = new Node(12);

		System.out.print("Level order traversal of binary tree is ");
		tree.printLevelOrder(tree.root);
	}
}
