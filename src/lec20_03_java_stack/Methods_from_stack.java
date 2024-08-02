package lec20_03_java_stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Methods_from_stack {
/*
 When we use Stack in real time scenario?
 Web browsers use stacks to manage browsing history and forward/backward navigation. 
 In text editors, stacks can be used for undo and redo operations. 
 */
	public static void main(String[] args) {
		// The Stack class represents a last-in-first-out (LIFO) stack of objects
		Stack<String>stack = new Stack<>();
		// add() --> Appends the specified element to the end [Bottom] of this Vector.
		stack.add("NY"); // Bottom: We put it First
		stack.add("CT");
		// push() --> Pushes an item onto the top of this stack. This has exactly the same effect as: addElement(item)
		stack.push("MA");
		stack.push("NC");
		stack.push("UT");
		stack.push("MD");
		// addElement() -->  Adds the specified component to the end(TOP) of this vector, increasing its size by one. 
		stack.addElement("TX");
		stack.addElement("GA");
		
		System.out.println(stack);
		System.out.println("Total Elements: " + stack.size());
		// The capacity of this vector is increased if its size becomes greater than its capacity.
		System.out.println("Capacity: " + stack.capacity());
		
		System.out.println("\n--------------------------------");
		stack.add("FL");
		stack.addElement("NM");
		stack.push("PA");  // Top: Put last	
		
		System.out.println(stack);
		System.out.println("Total Elements: " + stack.size());
		// The capacity of this vector is increased if its size becomes greater than its capacity.
		// Stack increments by 100% capacity
		System.out.println("Capacity: " + stack.capacity());
		
		System.out.println("\n--------------------------------");
		System.out.println(stack.contains("NM"));
		
		System.out.println("\n--------------------------------");
		// In other places the method is indexOf()
		// search()--> Returns the 1-based position where an object is on this stack. If the object o occurs as an item in this stack,
		// this method returns the distance from the top of the stack of the occurrence nearest the top of the stack; 
		// the topmost item on the stack is considered to be at distance 1. 		
		System.out.println("The position of NY is: " + stack.search("NY"));
		System.out.println("The position of PA is: " + stack.search("PA"));
		System.out.println("The position of CT is: " + stack.search("CT"));
		System.out.println("The position of WA is: " + stack.search("WA")); //if Absent, shows -1 in console

		// very very important interview question: push() vs peek() vs pop()
		System.out.println("\n--------------------------------");
		// peek() --> Looks/Find at the object at the top of this stack without removing it from the stack. [LIFO]
		System.out.println("Find the element using peek() method: " + stack.peek());
		
		System.out.println("\n--------------------------------");
		// pop() --> Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println("The 1st pop: " + stack.pop());
		System.out.println("After pop(): "+stack);
		System.out.println("Find the element using peek() method after pop(): " + stack.peek());
		
		// question: pop() vs remove(5)
		// Removes the element at the specified position in this Vector.
		System.out.println("\n--------------------------------");
		System.out.println("Who is removed from stack? Ans: "+stack.remove(0));
		System.out.println("Who is removed from stack? Ans: "+stack.remove(3));
		System.out.println(stack);
		
		System.out.println("\n--------------------------------");
		// empty() --> Tests if this stack is empty.
		System.out.println("Is this stack empty? Ans: " + stack.empty());
		
		System.out.println("\n--------------------------------");
		// not empty
		while(!stack.empty()) {
			stack.pop();
			// System.out.println(stack); // to show/understand we used this line
		}
		System.out.println("Is this stack empty Now? Ans: " + stack.empty());
		System.out.println(stack);
		
		System.out.println("\n--------------------------------");
		// pushing element again in the stack
		stack.push("CA"); // Bottom
		stack.push("MN");
		stack.push("NJ"); 
		stack.push("MN"); // Duplicate allowed
		
		System.out.println(stack);
		
		if(stack.peek().equalsIgnoreCase("mN")) {
			System.out.println("Who is popping? Ans: " + stack.pop());
		}
		
		System.out.println(stack);
		
		System.out.println("\n------------- Accessing the elements of the specified Stack by using Iterator -------------");
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n------------- Accessing the elements of the specified Stack by using ListIterator -------------");
		
		ListIterator<String>listIterator = stack.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());			
		}
		
		System.out.println("\n------------- Using other method of ListIterator -------------");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		// Stack is important for interview question: specially 3 methods: push(), peek(), pop(), remove()
	
		
		
		
		
		
		
		
		
		
	}

}
