package lec22_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E01_UseOfSet {
	// How to write an array
	int [] age = new int [6];
	
	// This below 2 line is a very very important interview question.
	// question: difference between Set and List
	// Set doesn't allow duplicate data, but List allows
	// Set doesn't follow ordering, but List follow order
	
	// Set is a member of Collection framework, where we deal with multiple data type or generic data type
	// Why HashSet here? why not "new Set<String>()", HashSet implements Set
	Set<String> set = new HashSet<>();
	// type of variable use here, line 17 - is String
	// "set" is the name of Set object
	// Here Set is an interface, that's why it needs the help of a concrete class HashSet which implements Set to instantiate
	// Interface can't instantiate themselves [can't crate object]

}
