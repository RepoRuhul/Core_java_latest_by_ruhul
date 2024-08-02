package lec22_02_java_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_03_use_of_TreeMap {

	public static void main(String[] args) {
		// Map is an Interface, implemented by TreeMap (class)
		// K represent Key, V represent Value
		Map<String, Integer> nameAndAge = new TreeMap<>(); // it will create 16 buckets/Node, 16 is initial capacity
		// If there is 17 Entry, what will be the capacity and when it will initiated?
		// when threshold (12) exceeds, capacity will be double --> 32 Node
		// put(K, V) --> Associates the specified value with the specified key in this
		// map
		// Each key and value pair is known as an 'Entry'.
		nameAndAge.put("Jaiden", 34);
		// If duplicate key inserted like next line, above Entry will be replaced by the
		// next Entry
		nameAndAge.put("Jaiden", 21);
		// A map contains unique keys. No duplication allowed [similar like Set], but we
		// can have identical values.
		nameAndAge.put("Albert", null);
		// HashMap and LinkedHashMap May have one null key and multiple null values,
		// TreeMap no null key or value
		nameAndAge.put("Douglas", 24);
		nameAndAge.put("Luis", 34);
		nameAndAge.put("Charles", null);
		nameAndAge.put("Joe", 34);
		// nameAndAge.put(null, 34); // null not allowed

		System.out.println(nameAndAge);

		System.out.println("\n---------------------");
		System.out.println("Size: " + nameAndAge.size());

		System.out.println("\n---------------------");
		// get(K) --> Returns the value to which the specified key is mapped,or null if
		// this map contains no mapping for the key.
		System.out.println(nameAndAge.get("Luis"));

		System.out.println("\n---------------------");
		// keySet() --> Returns a Set view of the keys contained in this map.
		Set<String> allKeys = nameAndAge.keySet();
		System.out.println(allKeys);

		System.out.println("\n---------------------");
		// We can use for each loop to iterate through the keys.
		// iteration through Map is not possible by loop or Iterator.
		// So, how can we get the value one by one

		// key is the name of the loop which sorted the key value from allKeys
		for (String key : allKeys) {
			System.out.println(key + "=" + nameAndAge.get(key));
		}

		System.out.println("\n---------- entrySet() -----------");
		Set<Map.Entry<String, Integer>> entries = nameAndAge.entrySet(); // tough, don't try to memorize, try to
																			// understand
		System.out.println(entries);

		System.out.println("\n---------- Iterate -----------");
		// Iterate
		for (Map.Entry<String, Integer> entryOneByOnEntry : entries) {
			System.out.println(entryOneByOnEntry);
		}
	}

}
