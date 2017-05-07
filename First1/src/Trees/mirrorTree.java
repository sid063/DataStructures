package Trees;

public class mirrorTree {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(5);
		bt.root.left = new Node(4);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(2);
		bt.root.left.right = new Node(1);

		printTree(bt.root);
		mirror(bt.root);
		System.out.println();
		printTree(bt.root);
	}

	private static Node mirror(Node node) {
		if (node == null)
			return node;

		Node left = mirror(node.left);
		Node right = mirror(node.right);
		node.left = right;
		node.right = left;

		return node;
	}

	private static void printTree(Node root) {
		if (root == null)
			return;
		else {
			printTree(root.left);
			System.out.print(root.data + " ");
			printTree(root.right);
		}
	}
}
