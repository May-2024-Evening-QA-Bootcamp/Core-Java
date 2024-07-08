package lec19_02_java_set;

import java.util.Set;
import java.util.TreeSet;

public class Set_03_use_of_treeSet {

	public static void main(String[] args) {
		Set<String>set1 = new TreeSet<>();
		set1.add("Bradley");
		set1.add("Jamie");
		set1.add("Katie");
		set1.add("Amy");
		set1.add("Brad");
		set1.add("Brad");
		// set1.add(null);  // null not accepted
		set1.add("amy");
		set1.add("Ryan");
		set1.add("Jamie");
		set1.add("Kevin");
		set1.add("Amy");
		set1.add("David");
		set1.add(""); // acceptable, never knew
		
		System.out.println(set1.size());
		System.out.println("set1: " + set1);
		
		// In TreeSet: they follow ascending order, duplicate not allowed
		// null is not allowed is TreeSet // important interview question
		// because treeSet allow ascending order
		
		System.out.println(set1.size());
		System.out.println("set1: " + set1);
		
		System.out.println("\n--------------- Another example -----------------");
		Set<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Jaiden");
		treeSet2.add("Joe");
		treeSet2.add("Alex");

		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n--------------------------------");
		set1.addAll(treeSet2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);

		System.out.println("\n--------------------------------");
		// remove() --> Removes the specified element from this set if it is present
		treeSet2.remove("Joe");
		System.out.println(treeSet2.size());
		System.out.println("TreeSet2: " + treeSet2);

		System.out.println("\n--------------------------------");
		set1.removeAll(treeSet2);
		System.out.println(set1.size());
		System.out.println("set1: " + set1);
		
		// Check If an Data/Item Exists
		System.out.println("\n--------------------------------");
		if (set1.contains("Luis")) {
			set1.remove("Douglas");
			System.out.println("set1: " + set1);
		} else if (!set1.contains("Luis")) {
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
