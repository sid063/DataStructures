package Trees;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}
	
	public static void printTree(Node root) {
		if (root == null)
			return;
		else {
			printTree(root.left);
			System.out.print(root.data + " ");
			printTree(root.right);
		}
	}
}