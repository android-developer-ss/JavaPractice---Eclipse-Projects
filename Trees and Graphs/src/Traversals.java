
public class Traversals {

	static MyStack mStack;

	public static void main(String[] args) {
		mStack = new MyStack();
		Node head = new Node(0);
		head = initializeTree(head);

		(new BFSandDFS()).breadthFirstSearch(head);
//		preOrderTraversal(head);

	}

	private static void preOrderTraversal(Node head) {
		if (head == null)
			return;
		System.out.println(head.value);
		preOrderTraversal(head.left);
		preOrderTraversal(head.right);

	}

	private static void postOrderTraversal(Node head) {
		if (head == null)
			return;
		postOrderTraversal(head.left);
		postOrderTraversal(head.right);
		System.out.println(head.value);

	}

	private static void inOrderTraversal(Node head) {
		if (head == null)
			return;
		inOrderTraversal(head.left);
		System.out.println(head.value);
		inOrderTraversal(head.right);

	}

	private static Node initializeTree(Node head) {
		int[] numArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		mStack.push(head);

		Node headToReturn = head;
		for (int i = 1; i < numArray.length - 1;) {
			head = mStack.pop();
			if (head == null) {
				break;
			}
			if (head.left == null) {
				Node nextNodeLeft = new Node(numArray[i++]);
				head.left = nextNodeLeft;
				mStack.push(nextNodeLeft);
			}
			if (head.right == null) {
				Node nextNodeRight = new Node(numArray[i++]);
				head.right = nextNodeRight;
				mStack.push(nextNodeRight);
			}
		}
		return headToReturn;
	}

}
