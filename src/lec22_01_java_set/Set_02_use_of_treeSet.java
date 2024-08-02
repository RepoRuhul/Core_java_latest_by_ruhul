package lec22_01_java_set;

import java.util.Set;
import java.util.TreeSet;

public class Set_02_use_of_treeSet {

	public static void main(String[] args) {
		// creating TreeSet--generic<String>
		Set<String>treeSet1 = new TreeSet<>();
		treeSet1.add("Jaiden");
		treeSet1.add("Jaiden");
		treeSet1.add("Albert");
		treeSet1.add("Luis");
		treeSet1.add("Luis");
		treeSet1.add("Charlie");
		treeSet1.add("Douglas");
		// treeSet1.add(null); // null is not allowed is TreeSet // interview question
		// because treeSet allow ascending order

		System.out.println(treeSet1.size());
		System.out.println("TreeSet1: " + treeSet1);
		
		System.out.println("\n--------------- Another example -----------------");
		Set<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Jaiden");
		treeSet2.add("Joe");
		treeSet2.add("Alex");

		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n--------------------------------");
		treeSet1.addAll(treeSet2);
		System.out.println(treeSet1.size());
		System.out.println("TreeSet1: " + treeSet1);

		System.out.println("\n--------------------------------");
		// remove() --> Removes the specified element from this set if it is present
		treeSet2.remove("Joe");
		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n--------------------------------");
		treeSet1.removeAll(treeSet2);
		System.out.println(treeSet1.size());
		System.out.println("TreeSet1: " + treeSet1);
		
		// Check If an Data/Item Exists
		System.out.println("\n--------------------------------");
		if (treeSet1.contains("Luis")) {
			treeSet1.remove("Douglas");
			System.out.println("TreeSet1: " + treeSet1);
		} else if (!treeSet1.contains("Luis")) {
			System.out.println("treeSet1 is unchanged as It doesnot contain Luis");
		}

		System.out.println("\n-------------- Using clear() ------------------");
		if (treeSet1.isEmpty()) {
			System.out.println("There is No Data inside treeSet1");
		} else if (!treeSet1.isEmpty()) {
			treeSet1.clear();
			System.out.println(treeSet1);
		}



	}

}
