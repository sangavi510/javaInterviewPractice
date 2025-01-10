package interview;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
	        Stack s = new Stack();
	        s.push(1);
	        s.push(2);
	        s.push(3);
	        s.push(4);
	        s.push(5);
	        s.push(6);
	        
	        System.out.println(s);
	        
	        s.pop();
	        s.pop();

	        s.pop();s.pop();
	        s.pop();
	        
	        s.pop();
	        System.out.println(s.isEmpty());
	        System.out.println(s);
	        s.peek();
	        System.out.println(s);
	        
	        System.out.println(s.search(5));
	        System.out.println(s.size());
	        
	}

}
