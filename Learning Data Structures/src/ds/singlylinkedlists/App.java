package ds.singlylinkedlists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singlyLinkedList myList = new singlyLinkedList(); 
		myList.insertFirst(100);
		myList.insertFirst(200); 
		myList.insertFirst(7); 
		myList.insertFirst(2); 
		
		myList.insertLast(99999);
		
		myList.display();
	}

}
