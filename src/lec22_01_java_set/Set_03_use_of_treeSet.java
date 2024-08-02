package lec22_01_java_set;

import java.util.TreeSet;

public class Set_03_use_of_treeSet {

	public static void main(String[] args) {
		// Not important
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Jaiden");
		treeSet.add("Jaiden");
		treeSet.add("Albert");
		treeSet.add("Luis");
		treeSet.add("Luis");
		treeSet.add("Charlie");
		treeSet.add("Douglas");
		// treeSet.add(null); // null is not allowed is TreeSet

		System.out.println(treeSet.size());
		System.out.println("TreeSet: " + treeSet);

		System.out.println("First Sorted Element: " + treeSet.first());
		System.out.println("Last Sorted Element: " + treeSet.last());

		// higher() --> Returns the least element in this set strictly greater than the
		// given element,
		System.out.println("Higher Sorted Element: " + treeSet.higher("Douglas"));
		// lower() --> Returns the least element in this set strictly less than the
		// given element,
		System.out.println("Lower Sorted Element: " + treeSet.lower("Charlie"));

		// headSet() --> Returns a view of the portion of this set whose elements are
		// strictly less than to Element.
		System.out.println(treeSet.headSet("Douglas"));
		// tailSet() --> Returns a view of the portion of this set whose elements are
		// greater than or equal to from Element.
		// That's why Jaiden is included
		System.out.println(treeSet.tailSet("Jaiden"));

	}

}
