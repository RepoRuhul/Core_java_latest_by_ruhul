package lec17_java_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Use_of_arrayList_02 {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Georgia");
		// add(int index, E element) --> Inserts the specified element at the specified position in this list. 
		// Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
		list.add(0, "New York");
		list.add("Montana");
		list.add(2, "California"); // We assigned ''California" in index 2
		list.add(4, "Alabama"); // We assigned ''Alabama" in index 4
		list.add(4, "Maine");
		list.add(4, "Delaware"); // Who will come to the index 4?
		list.add(null);
		list.add(null);
		// https://learn.saylor.org/mod/book/view.php?id=26829&chapterid=3027#:~:text=An%20ArrayList%20element%20can%20be,contain%20a%20null%20with%20null%20.&text=The%20cells%20that%20contain%20null,the%20size%20of%20the%20list.
			
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// New
		// To print all data, we can use any kind of loop, Iterator or ListIterator
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using ListIterator -------------");
		ListIterator<String>listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("\n--------------------------------");
		// Use of indexOf(), Returns the index of the first occurrence of the specified element in this list, 
		// or -1 if this list does not contain the element. 
		System.out.println(list.indexOf("Montana"));
		System.out.println(list.indexOf("montana")); // Case sensitive
		
		System.out.println("\n--------------------------------");
		// Use of addAll()
		ArrayList <String> arrayList = new ArrayList<>();
		arrayList.add("Hawaii");
		arrayList.add("Alaska");
		arrayList.add("Washington");
		
		// How can we get the content of one ArrayList inside Another one
		// addAll() --> Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
		// 'list' object from line 11
		list.addAll(arrayList);
		// applied addAll() in list []-->now list object have the content of the arrrayList object
		System.out.println(list.size());
		System.out.println("After using addAll method the new Array List: \n" + list);
		
		System.out.println("\n--------------------------------");
		// addAll(int index, Collection c) --> Inserts all of the elements in the specified collection into this list at the specified position (optional operation). Shifts theelement currently at that position (if any) and any subsequentelements to the right (increases their indices). 
		list.addAll(3, arrayList);
		System.out.println(list.size());
		System.out.println("After using addAll method the new Array List: \n" + list);
		
		System.out.println("\n--------------------------------");
		// use of removeAll() method
		// removeAll(Collection c) --> Removes from this list all of its elements that are contained in the specified collection.
		// something new: any element is common with both list is also removed
		list.removeAll(arrayList);
		System.out.println(list.size());
		System.out.println("After using removeAll method the new Array List: \n" + list);
		
		// list.removeAll(list); // not possible
		
		System.out.println("\n--------------------------------");
		// set(int index, E element) --> Replaces the element at the specified position in this list with the specified element.
		list.set(1, "New Jersey"); // important interview question
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\n--------------------------------");
		list.add(1, "Nevada");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("\n--------------------------------");
		// remove() --> Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
		list.remove(2); // Remove the index number 2
		list.remove(5); // we made mistake
		System.out.println(list);
		
		System.out.println("\n--------------------------------");
		// contains() --> Returns true if this list contains the specified element. 
		// More formally, returns true if and only if this list contains at least one element
		System.out.println(list.contains("Cauliflower"));
		System.out.println(list.contains("California"));
		
		// We can use if else condition too		
		if (list.contains("California")) {
			list.set(3, "Texas");
			System.out.println(list);
		} else {
			System.out.println("Keep same");
		}
		
		System.out.println("\n--------------------------------");
		list.set(5, "Connecticut");
		list.set(6, "Virginia");
		list.set(4, null);
		System.out.println(list);
		
		System.out.println("\n--------------- To reverse the ArrayList -----------------");
		System.out.println("Original list: " + list); 
		Collections.reverse(list); // important
		System.out.println("Reversed list: " + list); 
		
		System.out.println("\n--------------------------------");
		// use of retainAll()--> only keeps common value between two ArrayList obj
		ArrayList<String> al = new ArrayList<>(); // creating new ArrayList
		al.add("New York"); // -------this is common
		al.add("Nevada");
		al.add("california"); // Case sensitive
		al.add("Hawaii"); 
		al.add("Texas"); 
		al.add("Connecticut"); 
		System.out.println(al);
		
		System.out.println("\n--------------------------------");
		// applying retainAll() below, which will keep the common from the list
		// Retains only the elements in this list that are contained in the specified collection. In other words, removes from this list all of its elements that are not contained in the specified collection.
		list.retainAll(al);	
		System.out.println(list.size());
		System.out.println("After using retainAll method the new Array List: \n" + list);
		
		System.out.println("\n------------- Use of sort() -------------");
		// list.add(null); // if null is present, sorting not possible, if you need to sort, avoid null
		// Collections.sort(List<String> list) -->
        // Sorts the specified list into ascending order, according to the natural ordering of its elements. 
		System.out.println("Before sort: " + list);
		// Sorting ArrayList in ascending Order 
        // using Collection.sort() method 
        Collections.sort(list); // Arrays.sort() for sorting Array, important interview question
        // Print the sorted ArrayList 
        System.out.println("Sorted ArrayList in Ascending order : " + list); 
        
        System.out.println("\n--------------- new and tough and not important-----------------");
        // Printed in descending Order
        Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted list in descending order: " + list);
		
		System.out.println("\n------------- Use of clear() -------------");
		System.out.println("Before : " + list);
		// clear() --> Removes all of the elements from this list. The list will be empty after this call returns.
		list.clear();
		System.out.println("After : " + list);
		// Interview question: clear() vs removeAll();
		// clear() is more faster
		
		System.out.println("\n------------- Use of isEmpty() -------------");
		// isEmpty() --> Returns true if this list contains no elements.
		if(!(list.isEmpty())) {
			// used for each loop
			for(String s: list) {
				System.out.println(s);
			}
		} else if (list.isEmpty()) {
			System.out.println("List is Empty! No Element there!!");
		}
		
		
		// add(1, "abc"), set (1, "def"), Collections.sort(), remove(3), clear() you get from here
		
	}

}
