package lec22_02_java_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_01_use_of_hashMap {

	public static void main(String[] args) {
		// With ArrayList---> you can store either key or value
		ArrayList<String> name = new ArrayList<>();
		name.add("Jaiden");
		name.add("Jaiden"); // duplicate allowed in List
		name.add("Albert");
		name.add("Douglas");
		name.add("Luis");
		name.add("Charles");
		name.add("Joe");
		name.add(null);
		System.out.println(name);

		System.out.println("\n---------------------");
		ArrayList<Integer> age = new ArrayList<>();
		age.add(34);
		age.add(21);
		age.add(null);
		age.add(24);
		age.add(34);
		age.add(null);
		age.add(34);
		age.add(34); // duplicate allowed in List
		System.out.println(age);

		// Above we are storing single Data
		// But if you need to store a pair of data, how you can achieve this?
		
		System.out.println("\n---------------------");
		// Creating a Map ---> Here 'Key' as String and 'Value' as Integer
		// But is it fixed like below? Ans: No
		// <String, Integer>, <Integer, String>, <String, String>, <Integer, Integer>, also other data type
		// Map is an Interface, implemented by HashMap (class)
		// K represent Key, V represent Value, Map is used for key value pair.
		
		Map<String, Integer> nameAndAge = new HashMap<>();
		// it will create 16 buckets/Node, 16 is initial capacity
		// If there is 17 Entry, what will be the capacity and when it will initiated?
		// when threshold (12) exceeds,  capacity will be double --> 32 Node
		// put(K, V) --> Associates the specified value with the specified key in this map
		// Each key and value pair is known as an 'Entry'.
		nameAndAge.put("Jaiden", 34);
		// If duplicate key inserted like next line, above Entry will be replaced by the next Entry
		nameAndAge.put("Jaiden", 21); 
		// A map contains unique keys. No duplication allowed [similar like Set], but we can have identical values.
		nameAndAge.put("Albert", null);
		 // HashMap and LinkedHashMap May have one null key and multiple null values, TreeMap no null key but value can contain null
		nameAndAge.put("Douglas", 24);
		nameAndAge.put("Luis", 34);
		nameAndAge.put("Charles", null);
		nameAndAge.put("Joe", 34);
		nameAndAge.put(null, 34);
		nameAndAge.put(null, 24);
		
		System.out.println(nameAndAge);
		System.out.println("Size: " + nameAndAge.size());
		
		System.out.println("\n---------------------");
		// get(K) --> Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key. 
		System.out.println(nameAndAge.get("Luis"));
		
		System.out.println("\n---------------------");
		// keySet() --> Returns a Set view of the keys contained in this map.
		Set<String>allKeys = nameAndAge.keySet();
		System.out.println(allKeys);
		
		System.out.println("\n---------------------");
		Collection <Integer>allValues = nameAndAge.values();
		System.out.println(allValues);
		
		System.out.println("\n---------------------");
		// We can use for each loop to iterate through the keys.
		// iteration through Map is not possible by any loop or Iterator.
		// So, how can we get the value one by one
		
		// key is the name of the loop which sorted the key value from allKeys
		for(String key: allKeys) {
			System.out.println(key + " = " + nameAndAge.get(key));
		}
		
		System.out.println("\n---------- entrySet() -----------");
		Set<Map.Entry<String, Integer>> entries = nameAndAge.entrySet(); // tough, don't try to memorize, try to understand
		System.out.println(entries);
		
		System.out.println("\n---------- Iterate -----------");
		// Iterate
		for(Map.Entry<String, Integer> entryOneByOne : entries) {
			System.out.println(entryOneByOne);
		}
		
		
		// Another example of Map [Same]
		
		System.out.println("\n---------------------");
		Map<String, String> states =new HashMap<>();
		states.put("Alex", "TX");
		states.put("Alex", "NY");
		states.put("Albert", null);
		states.put("Tiffany", "FL");
		states.put("Mark", "GA");
		states.put("Chelsey", null);
		states.put("John", "NC");
		states.put(null, "CA");
		states.put(null, "NM");
		
		System.out.println(states);
		
		System.out.println(states.get("Joe"));
		
		System.out.println("\n---------------------");
		// keySet() --> Returns a Set view of the keys contained in this map.
		Set<String> statesKeys = states.keySet();
		System.out.println(statesKeys);
		
		
		System.out.println("\n---------------------");
		// We can use for each loop to iterate through the keys.
		// iteration through Map is not possible by loop or Iterator.
		// So, how can we get the value one by one
		
		// key is the name of the loop which sorted the key value from allKeys
		for (String stateName: statesKeys) {
			System.out.println(stateName + "=" + nameAndAge.get(stateName));
		}

		
		// Same example
		Map<Integer, String>map = new HashMap<>();
		map.put(21773, "Alex");
		map.put(21773, "Alexis");
		map.put(21556, "Carlos");
		map.put(99556, "Carlos");
		map.put(null, "Carlos");
		map.put(null, "Joe");
		map.put(54723, "Joe");
		map.put(14723, "Joe");
		map.put(94723, "Joe");
		
		System.out.println(map);
		System.out.println(map.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
