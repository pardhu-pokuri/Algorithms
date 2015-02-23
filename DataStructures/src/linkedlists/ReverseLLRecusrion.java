package linkedlists;

public class ReverseLLRecusrion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(0);
		list.add(0);
		list.add(1);
		list.print();
		System.out.println();
		//reverseLL(list,list.head);
		//list.print();
		
		Node first = reverseLLRecursion(list, list.head);
		first.next = null;
		
		list.print();

	}
	

	public static Node reverseLLRecursion(LinkedList list,Node node){
		
		if(node != null){
			Node temp = reverseLLRecursion(list,node.next);
			if(temp != null){
				temp.next = node;
			}else{
				list.head = node;
			}
			return node;
		}
		return null;
		
	}

}
