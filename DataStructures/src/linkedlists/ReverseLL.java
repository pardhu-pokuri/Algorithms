package linkedlists;


public class ReverseLL {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(0);
		list.add(0);
		list.add(1);
		list.print();
		System.out.println();
		reverseLL(list,list.head);
		list.print();
		
	}
	
	
	
	public static void reverseLL(LinkedList list , Node head){
		
		Node p0 = null,p2;
		Node p1 = head;
		
		while( p1 != null){
			
			p2 = p1.next;
			p1.next = p0;
			
			p0 = p1;
			p1 = p2;
			
		}
		list.head = p0;
		
		
	}
	
	

}
