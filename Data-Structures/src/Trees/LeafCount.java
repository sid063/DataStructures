package Trees;

public class LeafCount {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(5);
		bt.root.left = new Node(4);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(2);
		bt.root.left.right = new Node(1);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);

		System.out.println("Leaf count: " + countLeaves(bt.root));
	}

	private static int countLeaves(Node root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else
			return countLeaves(root.left) + countLeaves(root.right);
	}
}
