package linkedlists;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node(); 
		nodeA.data = 4; 
		
		Node nodeB = new Node();
		nodeB.data = 3; 
		
		Node nodeC = new Node();
		nodeC.data = 7; 
		
		Node nodeD = new Node();
		nodeD.data = 8; 

		nodeA.next = nodeB; 
		nodeB.next = nodeC; 
		nodeC.next = nodeD; 
		nodeD.next = null; 
		
		System.out.println(listLength(nodeA));

	}
	
	
	public static int listLength(Node aNode) {
		int counter = 0; 
		Node currentNode = aNode; 
		
		while(currentNode != null) {
			counter++; 
			currentNode = currentNode.next; 
		}
		
		return counter; 
	}

}
