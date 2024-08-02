package lec22_01_java_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_05_hashSet_linkedHashSet_treeSet {
	// Important to understand and for interview
	public static void main(String[] args) {
		/*
		 * A Set is a generic set of values with no duplicate elements. Set is a parent
		 * interface of all set classes like TreeSet, HashSet, etc. means: TreeSet,
		 * HashSet etc implements Set
		 * 
		 * A HashSet is a set where the elements are not sorted or ordered. Follow
		 * hashing. It is faster than a TreeSet.
		 * 
		 * A TreeSet is a set where the elements are sorted. ascending to descending
		 * order
		 * 
		 * The LinkedHashSet is an ordered version of HashSet that maintains a
		 * doubly-linked List across all elements. When the iteration order is needed to
		 * be maintained this class is used.
		 * 
		 * When iterating through a HashSet the order is unpredictable, while a
		 * LinkedHashSet lets us iterate through the elements in the order in which they
		 * were inserted.
		 * 
		 * When cycling through LinkedHashSet using an iterator, the elements will be
		 * returned in the order in which they were inserted.
		 */

		System.out.println("\n----------------- Generic <String> type -----------------------");
		// HashSet class implements Set Interface
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Bradley");
		hashSet.add("Katie");
		hashSet.add("Brad");
		hashSet.add("Amy");
		hashSet.add("Ryan");
		hashSet.add("Jamie");
		hashSet.add("Kevin");
		hashSet.add("David");
		System.out.println("HashSet = " + hashSet);

		// TreeSet class implements Set Interface
		Set<String> ts = new TreeSet<>(hashSet);
		System.out.println("TreeSet = " + ts);
		// We can see Treeset is sorted alphabetically [ascending order]

		// LinkedHashSet class implements Set Interface
		Set<String> linkedHashSet1 = new LinkedHashSet<>();
		// See the insertion order
		linkedHashSet1.add("Bradley");
		linkedHashSet1.add("Katie");
		linkedHashSet1.add("Brad");
		linkedHashSet1.add("Amy");
		linkedHashSet1.add("Amy"); // Duplicated
		linkedHashSet1.add("Ryan");
		linkedHashSet1.add("Jamie");
		linkedHashSet1.add("Kevin");
		linkedHashSet1.add("David");

		System.out.println("LinkedHashSet = " + linkedHashSet1);

		// TreeSet class implements Set Interface
		Set<String> treeSet = new TreeSet<>(linkedHashSet1);
		System.out.println("TreeSet = " + treeSet);

		System.out.println("\n----------------- Generic <Integer> type -----------------------");
		// Another example of HashSet, LinkedHashSet and TreeSet

		// This is an Array, container also can stay after array name
		int a[] = { 77, 23, 4, 66, 99, 112, 45, 56, 39, 89 };

		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(a[i]); // Getting data from Array
			}
			System.out.println("HashSet is not Sorted:  " + set);

			TreeSet<Integer> ts1 = new TreeSet<Integer>(set);
			System.out.println("TreeSet is Sorted:  " + ts1);
		} catch (Exception e) {
		}

		Set<Integer> linkedHasSet2 = new LinkedHashSet<Integer>();
		try {
			for (int i = 3; i < 8; i++) {
				linkedHasSet2.add(a[i]); // Getting data from Array
			}
			System.out.println("LinkedHashSet is in inserted ordered:  " + linkedHasSet2);

			TreeSet<Integer> ts2 = new TreeSet<Integer>(linkedHasSet2);
			System.out.println("TreeSet is Sorted:  " + ts2);
		} catch (Exception e) {

		}

	}

}
