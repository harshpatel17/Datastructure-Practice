package ds.singlylinkedlists;

public class singlyLinkedList {
	private Node first; 
	
	public singlyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		
		return false;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(); 
		newNode.data = data; 
		newNode.next = first; 
		first = newNode; 
	}
	
	public Node deleteFirst() {
		Node temp = first; 
		first = first.next; 
		return temp; 
	}

	public void display() {
		System.out.println("List (first --> last) ");
		Node current = first; 
		while (current != null) {
			current.displayNode(); 
			current = current.next; 
		}
		System.out.println();
	}
	
	public void insertLast(int data) {
		Node current = first; 
		while(current.next != null) {
			current = current.next; 
		}
		Node newNode = new Node(); 
		newNode.data = data; 
		current.next = newNode; 
	}
	
}
