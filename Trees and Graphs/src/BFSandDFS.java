
public class BFSandDFS {

	MyStack mStack = new MyStack();

	MyQueue mQueue = new MyQueue();

	public void depthFirstSearch(Node node) {
		if (node == null && !mStack.isEmpty())
			node = mStack.pop();

		System.out.println(node.value);

		if (node.left != null || node.right != null)
			mStack.push(node);

		if (node.left != null) {
			breadthFirstSearch(node.left);
		}

		if (node.right != null) {
			breadthFirstSearch(node.right);
		}
	}

	public void breadthFirstSearch(Node node) {
		if (node == null && !mQueue.isEmpty())
			node = mQueue.dequeue();

		System.out.println(node.value);

		if (node.left != null) {
			mQueue.queue(node.left);
		}
		if (node.right != null) {
			mQueue.queue(node.right);
		}
		if (!mQueue.isEmpty())
			breadthFirstSearch(mQueue.dequeue());
	}
}
