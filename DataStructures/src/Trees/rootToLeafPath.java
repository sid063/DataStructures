package Trees;

public class rootToLeafPath {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(5);
		bt.root.left = new Node(4);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(2);
		bt.root.left.right = new Node(1);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);

		BinaryTree.printTree(bt.root);
		System.out.println();

		printRootToLeaf(bt.root);
	}

	private static void printRootToLeaf(Node root) {
		int[] path = new int[10];
		int pathlen = 0;

		printPaths(root, path, pathlen);
	}

	private static void printPaths(Node root, int[] path, int pathlen) {
		if (root == null)
			return;

		path[pathlen] = root.data;
		pathlen++;

		if (root.left == null && root.right == null) {
			for (int i = 0; i < pathlen; i++)
				System.out.print(path[i] + " ");
			System.out.println();
		} else {
			printPaths(root.left, path, pathlen);
			printPaths(root.right, path, pathlen);
		}
	}
}
