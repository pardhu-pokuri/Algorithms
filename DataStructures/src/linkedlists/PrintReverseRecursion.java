package linkedlists;

public class PrintReverseRecursion {

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
		printReverse(list.head);
		
	}

	public static void printReverse(Node node){
		
		if(node == null){
			return ;
		}
		printReverse(node.next);
		System.out.print(node.value + " ");
	}
	
}
