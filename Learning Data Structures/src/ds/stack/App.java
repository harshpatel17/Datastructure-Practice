package ds.stack;
import java.lang.String; 

public class App { 

	public static void main(String[] args) {
		reverseString("hello"); 
	
		
	}
	
	public static String reverseString (String str) {
		char[] cArr = str.toCharArray(); 
		int maxSize = cArr.length;
		System.out.println(maxSize);
		Stack cStack = new Stack(maxSize); 
		
		while(!cStack.isFull()) {
			cStack.push(cArr[maxSize-1]);
		}
	
		
		while(!cStack.isEmpty()) {
			System.out.println(cStack.pop());
		}
		
		
		return str; 
	}
	
}