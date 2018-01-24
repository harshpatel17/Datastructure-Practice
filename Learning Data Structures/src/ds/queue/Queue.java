package ds.queue;

public class Queue {

	private int maxSize; //set number of slots
	private long queArray[]; //slots to maintain data
	private int front; //index position of the front 
	private int rear; //index position of the back 
	private int nItems; //counter to maintain number of items in array
	
	public Queue(int size) {
		this.maxSize = size; 
		this.queArray = new long[size]; 
		front = 0; //index position of first slot of array 
		rear = -1; 
		nItems = 0; 
	}
	
	public void remove() {
		queArray[front] = (Long) null;
		front--; 
		nItems--; 
	}
	
	public void insert(long j) {
		rear++; 
		queArray[rear] = j;
		nItems++; 
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
	
}
