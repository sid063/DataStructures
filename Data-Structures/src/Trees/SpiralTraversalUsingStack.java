package Trees;

import java.util.Stack;

// Level order traversal of a Binary Tree in spiral form.
public class SpiralTraversalUsingStack {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.left.left = new Node(9);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		bt.root.right.right.right = new Node(8);

		spiralTraversal(bt.root);
	}

	private static void spiralTraversal(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {

			while (!s1.isEmpty()) {
				Node top = s1.pop();
				System.out.print(top.data + " ");
				if (top.right != null)
					s2.push(top.right);
				if (top.left != null)
					s2.push(top.left);

			}

			while (!s2.isEmpty()) {
				Node top = s2.pop();
				System.out.print(top.data + " ");
				if (top.left != null)
					s1.push(top.left);
				if (top.right != null)
					s1.push(top.right);
			}
		}
	}
}
