package practice.stackqueues;

public class Stack {

	private Node top;

	public void push(int item) {
		Node t = new Node(item);
		t.next = top;
		top = t;
	}

	public Node pop() {
		Node temp = null;
		if (top != null) {
			temp = top;
			top = top.next;
		}
		return temp;
	}

	public boolean isEmpty() {
		return top == null;
	}

}
