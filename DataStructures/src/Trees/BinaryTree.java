package Trees;

public class BinaryTree {
	public Node root;

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