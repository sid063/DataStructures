package largest.subtree.bst;

//Not implemented yet.
public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(50);
		bt.root.left = new Node(30);
		bt.root.right = new Node(60);
		bt.root.left.left = new Node(5);
		bt.root.left.right = new Node(20);
		bt.root.right.left = new Node(45);
		bt.root.right.right = new Node(70);
		bt.root.right.right.left = new Node(65);
		bt.root.right.right.right = new Node(80);

		// Not implemented yet.
		// findLargestBST(bt.root);
	}

}

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}