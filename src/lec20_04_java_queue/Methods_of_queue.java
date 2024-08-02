package lec20_04_java_queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Basically the concept of Queue is FIFO(First In First Out). So accessing the
 * particular index or the element in the queue is not possible. The other way
 * is, to get a particular element you need to delete it.
 * If you need to access elements by index, you want a list, not a queue.
 * Example: when we make queue in DMV/Bank --> FIFO(First In First Out)
 */

/*
What are the applications of queues? Job scheduling, Operating systems, message queues, 
task processing, buffering, BFS, etc, are some of the applications of queues.
*/

public class Methods_of_queue {

	public static void main(String[] args) {
		// Queue is an interface, inherited by class
		Queue<String> queue = new LinkedList<>();
		// add() --> Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, 
		// returning true upon success and throwing an IllegalStateException if no space is currently available.
		queue.add("SD"); // Head: Come first
		queue.add("NC");
		queue.add("WA");
		queue.add("OR");
		queue.add("FL");
		queue.add("CA"); // Tail: Come last
		
		// size() --> Returns the number of elements in this collection
		System.out.println("The number of elements in this Queue: " + queue.size());
		System.out.println(queue);
		
		System.out.println("\n--------------------------------");
		// peek() --> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("The head of this queue retrieved by peek(): " + queue.peek());
		
		System.out.println("\n--------------------------------");
		// element() --> Retrieves, but does not remove, the head of this queue. This method differs
		// from peek only in that it throws an exception if this queue is empty.
		System.out.println("The head of this queue retrieved by element(): " + queue.element()); // Why SD? got it?
		
		System.out.println("\n--------------------------------");
		// poll() --> Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println("The head of this queue retrieved and removed: " + queue.poll());
		System.out.println(queue);
		System.out.println("The head of this queue retrieved now: " + queue.peek());
		
		
		System.out.println("\n--------------------------------");
		// contains() --> Returns true if this collection contains the specified element. Otherwise false.
		System.out.println(queue.contains("NM"));
		System.out.println(queue.contains("WA"));
		
		// remove() --> Retrieves and removes the head of this queue. This method differs from poll
		// only in that it throws an exception if this queue is empty.
		System.out.println("The head of this queue retrieved and removed: " + queue.remove());
		
		System.out.println("\n--------------------------------");
		// isEmpty() --> Returns true if this collection contains no elements
		System.out.println("Is this Queue empty? Ans: " + queue.isEmpty());
		
		System.out.println("\n--------------------------------");
		while(!queue.isEmpty()) {
			queue.poll();
			System.out.println(queue);
		}
		System.out.println("Is this Queue empty Now? Ans: " + queue.isEmpty());
		System.out.println(queue);
		
		// Queue is important for interview question: specially 3 methods: add(), peek(), poll()
		// Stack is important for interview question: specially 3 methods: push(), peek(), pop()
		

	}

}

