package linkedlists;

public class LinkedList {

	public Node head;

	public void add(int value) {

		if (head == null) {
			head = new Node(value);
		}else{
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(value);
		}

	}

	public void print() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}
	

}
