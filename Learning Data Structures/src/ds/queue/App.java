package ds.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue myQueue = new Queue(5); 
			myQueue.insert(2);
			myQueue.insert(4);
			myQueue.insert(6);
			myQueue.insert(8);
			myQueue.insert(10);
			myQueue.remove();
			myQueue.view(); 
	}

}
