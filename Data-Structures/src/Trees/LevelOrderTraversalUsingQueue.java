package Trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Level order traversal of a Binary tree using queue.
public class LevelOrderTraversalUsingQueue {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.left.left = new Node(8);
		bt.root.right.right = new Node(7);

		levelOrderTraversal(bt.root);
	}

	private static void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node top = queue.remove();
			System.out.print(top.data + " ");

			if (top.left != null)
				queue.add(top.left);
			if (top.right != null)
				queue.add(top.right);
		}
	}
}
