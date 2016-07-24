import java.util.ArrayList;

public class MyQueue {
	private ArrayList<Node> myQueue;

	public MyQueue() {
		this.myQueue = new ArrayList<>();
	}

	public void queue(Node node) {
		myQueue.add(node);
	}

	public Node dequeue() {
		if (myQueue.size() > 0)
			return myQueue.remove(0);
		else
			return null;
	}

	public boolean isEmpty() {
		if (myQueue.size() > 0)
			return false;
		else
			return true;
	}

}
