package adt;

public class Counter {
	
	int cntr = 0; 
	String name = null;
	
	public Counter(String name) {
		this.name = name; 
	}
	
	public void increment() {
		cntr++; 
	}
	
	public int getCurrentValue() {
		return cntr; 
	}
		
	public String toString() {
		return name + ": " + cntr;  
	}

}
