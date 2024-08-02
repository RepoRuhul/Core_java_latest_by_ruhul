package lec22_01_java_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_04_use_of_linkedHashSet {

	public static void main(String[] args) {
		System.out.println("\n----------------------------------------");
		Set<String> set1 = new LinkedHashSet<>();

		// See the insertion order
		set1.add("Bradley");
		set1.add("Katie");
		set1.add("Brad");
		set1.add("Amy");
		set1.add("Amy"); // Duplicated
		set1.add("Ryan");
		set1.add("Jamie");
		set1.add("Kevin");
		set1.add("David");

		System.out.println("Stored Data in set1: " + set1);
		System.out.println("Size of set1: " + set1.size());

		System.out.println("\n--------------------------------");
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("Jaiden");
		set2.add("Kevin");
		set2.add("Alex");

		System.out.println(set2.size());
		System.out.println("set2: " + set2);

		System.out.println("\n--------------- addAll() -----------------");
		set1.addAll(set2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		System.out.println("\n--------------------------------");
		// remove() --> Removes the specified element from this set if it is present
		set2.remove("Joe");
		set2.add("Amy");
		set2.add("Ryan");
		System.out.println(set2.size());
		System.out.println("set2: " + set2);

		System.out.println("\n--------------------------------");
		set1.removeAll(set2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);
		
		// Check If an Data/Item Exists
		System.out.println("\n--------------------------------");
		if (set1.contains("Kevins")) {
			set1.remove("Katie");
			System.out.println("set1: " + set1);
		} else if (!set1.contains("Kevins")) {
			System.out.println("set1 is unchanged as It doesnot contain Luis");
		}

		System.out.println("\n-------------- Using clear() ------------------");
		if (set1.isEmpty()) {
			System.out.println("There is No Data inside set1");
		} else if (!set1.isEmpty()) {
			set1.clear();
			System.out.println(set1);
		}


	}

}
