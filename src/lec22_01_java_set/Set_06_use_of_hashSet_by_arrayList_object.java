package lec22_01_java_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set_06_use_of_hashSet_by_arrayList_object {
	// Not necessary
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(15);
		list1.add(25);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(50);
		list2.add(150);
		list2.add(250);

		// Set<ArrayList> s=new TreeSet<>(); // java.lang.ClassCastException
		Set<ArrayList> s = new HashSet<>();
		s.add(list1);
		s.add(list2);
		System.out.println("Size: " + s.size());

		// so we have only one ArrayList Object
		for (ArrayList single : s) {
			for (int i = 0; i < single.size(); i++) {
				System.out.println(single.get(i));
			}
			// System.out.println(single);

		}

	}
}
