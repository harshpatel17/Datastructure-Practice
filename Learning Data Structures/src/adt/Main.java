package adt;

public class Main {

	public static void main(String []args) {
		
		Counter counterOne = new Counter("counterOne"); 
		counterOne.increment(); 
		counterOne.increment(); 
		counterOne.increment(); 
		System.out.println(counterOne.getCurrentValue());
		
	}
	
}

