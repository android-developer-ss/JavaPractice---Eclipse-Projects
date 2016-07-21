
public class Traversals {

	public static void main(String[] args) {
		Node head = new Node(0);
		initializeTree(head);

	}

	private static void initializeTree(Node head) {
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int i = 1; i < numArray.length - 1; i++) {
			Node nextNodeLeft = new Node(numArray[i++]);
			Node nextNodeRight = new Node(numArray[i++]);
			head.left = nextNodeLeft;
			head.right = nextNodeRight;

			if (head.left != null && head.right != null)
				head = head.left;
			else if (head.left != null && head.right == null)
				head = head.right;
		}
	}

}
