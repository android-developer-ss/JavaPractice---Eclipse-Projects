import java.util.ArrayList;

public class MyStack {
	ArrayList<Node> myStack;

	public MyStack() {
		myStack = new ArrayList<>();
	}

	public void push(Node node) {
		myStack.add(node);
	}

	public Node pop() {
		if (!myStack.isEmpty()) {

			return myStack.remove(0);
		} else
			return null;
	}

	public boolean isEmpty() {
		if (myStack.size() > 0)
			return false;
		else
			return true;
	}
}
