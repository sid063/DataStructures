package binary.search.tree;

//Practice.
public class BST {
	Node root;

	public static void main(String[] args) {
		BST bt = new BST();
		bt.insert(5);
		bt.insert(4);
		bt.insert(6);
		bt.insert(2);
		bt.insert(3);
		bt.insert(1);

		bt.printTree(bt.root);
	}

	private void printTree(Node node) {
		if (node == null)
			return;
		else {
			printTree(node.left);
			System.out.print(node.key + " ");
			printTree(node.right);
		}
	}

	public BST() {
		root = null;
	}

	public void insert(int data) {
		root = insertRecur(root, data);
	}

	private Node insertRecur(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data < node.key)
				node.left = insertRecur(node.left, data);
			else if (data > node.key)
				node.right = insertRecur(node.right, data);
			else
				System.err.println("Can't insert duplicates.");
		}

		return node;
	}

}
