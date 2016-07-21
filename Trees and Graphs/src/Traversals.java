
public class Traversals {

	public static void main(String[] args) {
		Node head = new Node(0);
		initializeTree(head);

		//preOrderTraversal(head);
		inOrderTraversal(head);
	}

	private static void preOrderTraversal(Node head) {
		if (head == null)
			return;
		System.out.println(head.value);
		preOrderTraversal(head.left);
		preOrderTraversal(head.right);
	}

	private static void postOrderTraversal(Node head) {

	}

	private static void inOrderTraversal(Node head) {
		if (head == null)
			return;
		inOrderTraversal(head.left);
		System.out.println(head.value);
		inOrderTraversal(head.right);

	}

	private static void initializeTree(Node head) {
		int[] numArray = { 0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int i = 0; i < numArray.length - 1;) {
			head =  new Node(i++);
			Node nextNodeLeft = new Node(numArray[i++]);
			Node nextNodeRight = new Node(numArray[i++]);
			head.left = nextNodeLeft;
			head.right = nextNodeRight;

			if (head.left == null && head.right == null)
				head = head.left;
			else if (head.left != null && head.right == null)
				head = head.right;
		}
	}

}
