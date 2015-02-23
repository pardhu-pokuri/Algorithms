package linkedlists;

public class ReverseLLBySize {

	/**
	 * @param args
	 */
	
	public static int k = 3;
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.print();
		System.out.println();
		
		Node reverseLLBySize = reverseLLBySize(list.head);
		list.head = reverseLLBySize;
		
		list.print();

	}
	
	public static Node reverseLLBySize(Node node){
		
		Node prev = null,next = null;
		Node curr = node;
		int count = 0;
		while(curr != null && count < k){
			
			next = curr.next;
			curr.next = prev;
			
			count++;
			prev = curr;
			curr = next;
		}
		
		if(next != null){
			Node temp = reverseLLBySize(next);
			node.next = temp;
		}
		
		return prev;
	}

}
