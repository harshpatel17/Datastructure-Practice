package ds.circularLinkedList;

public class CircularLinkedList {

	private Node first; 
	private Node last; 
	
	public CircularLinkedList() {
		Node first = null;
		Node last = null; 
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(); 
		newNode.data = data; 
		
		if(isEmpty()) {
			last = newNode; 
		}
		newNode.next = first; 
		first  = newNode; 
	}
	
	private boolean isEmpty() {
		return first == null; 
	}
	
}
