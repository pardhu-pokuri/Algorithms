package linkedlists;

public class Node {

	Node next;
	int value;
	
	Node(int value){
		this.value = value;
		this.next = null;
	}
	
	Node(){
		
	}
	
	public void SetValue(int value){
		this.value = value;
	}
	
}
