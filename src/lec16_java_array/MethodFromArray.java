package lec16_java_array;

import java.util.Arrays;

public class MethodFromArray {

	public static void main(String[] args) {
		int [] a = {15, 34, 59, 5, 28, 12}; 
		// Que: how can you find the first member from the above array?
		System.out.println("First index value: " + a[0]);
		// Que: how can you find the last member from an array?
		System.out.println("Last index value: " + a[a.length-1]);
		// Que: how can you find the second last member from an array?
		System.out.println("Second Last index value: " + a[a.length-2]);
		// Que: how can you find the third last member from an array?
		System.out.println("Third Last index value: " + a[a.length-3]);
		
		System.out.println("\n----------------------- Use of sort() ---------------------------------");
		System.out.println("Before sort of the Array: " + Arrays.toString(a));
		Arrays.sort(a); // interview question
		// sort() method sorts the specified array of bytes into ascending [smaller to bigger] numerical order.
		System.out.println("After sort of the Array: " + Arrays.toString(a));
		
		System.out.println("\n------------------------------------------------------------------------");
		// How to find the smallest and largest number from an Array?
		// Answer: First sort the Array by Arrays.sort(a);, then a[0]=smallest, a[a.length-1]=largest
		// The interviewer don't like this answer
		Arrays.sort(a);
		System.out.println("Smallest value of Array is: " + a[0]);
		System.out.println("Largest value of Array is: " + a[a.length - 1]);
		
		System.out.println("\n------------------------------------------------------------------------");
		// A regular for loop, no relation with Array, String or ArrayList or something
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		// How can you run a for loop in an Array?
		// Printing Value of all index, one by one
		System.out.println("\n------------- Accessing the elements of the specified array by using the for loop -------------");
		// here a is the Array Object
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("\n------------- Decremental block is used when get value from last -------------");
		for(int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		// It is also possible to use while loop, do while loop
		// but for loop and for each loop is mostly used
		
		// for each loop/ enhanced for loop / advanced for loop
		// In Java, the for-each loop is used to iterate [travel] through elements of Array and collections (like ArrayList).
		// Can't be used without Array or ArrayList or LinkedList etc
		System.out.println("\n------------- Accessing the elements of the specified array by using for each loop -------------");
		// here m is the name of the for each loop, and a is the name of the array
		// Rule: first data type, then name of the for each loop, then : , then name of the array need to iterate
		
		for(int m: a) {
			System.out.println(m);
		}

	}

}
