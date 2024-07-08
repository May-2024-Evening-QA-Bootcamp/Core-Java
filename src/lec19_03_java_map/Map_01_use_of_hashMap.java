package lec19_03_java_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		// K represent Key, V represent Value, Map is used for "key value pair".
		
		Map<String, Integer>nameAndAge = new HashMap<>();
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
		nameAndAge.put("Alex", 14);
		nameAndAge.put("Joe", 34);
		nameAndAge.put(null, 34);
		nameAndAge.put(null, 24);		
		nameAndAge.put("Alex", 19);
		
		System.out.println(nameAndAge);
		System.out.println("Size: " + nameAndAge.size());

		
		
		

	}

}
