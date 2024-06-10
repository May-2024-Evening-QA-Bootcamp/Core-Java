package lec11_02_java_array;

import java.util.Arrays;

public class KnowingArray {

	public static void main(String[] args) {
		// Generally every value is assigned to a variable name, 
		// but in Array, a set of value present under one name
		String val0 = "Joe Biden";
		String val1 = "Donald Trump";
		String val2 = "Barac Obama";
		String val3 = "Bush Jr";
		String val4 = "Bill Clinton";
		System.out.println(val1);
		System.out.println("--------------------- Regular way above ---------------------");
		
		// What is an Array?
		// An array is a collection of items of same data type stored at contiguous memory locations.
		// same data type or a cluster of data present
		// How to write an Array? You must know
		// first data type, then [], 'square bracket' is called container, the 'president' (OBJECT) is the name of Array, 
		// [5] represent total 5 data is present
		// Array is static [fixed number of data], [interview question]
		
		String [] president = new String [5]; 
		president [0] = "Joe Biden";
		president [1] = "Donald Trump";
		president [2] = "Barak Obama";
		
		president [4] = "Bill Clinton";
		
		System.out.println(president.length);
		System.out.println(president[0]);
		System.out.println(president[2]);
		System.out.println(president[3]);
		// System.out.println(president[5]); //  java.lang.ArrayIndexOutOfBoundsException
		
		// important interview question 100%: length () vs length property
		// or how can you get the size of a String and an Array?
		// 'length' preserve the size of an array, 'length' is not a method or field or variable,
		// rather length is a parameter/properties
		// length() is a method of String to know the size of a String
		
		// or we can write this way, called "literal representation" of an Array
		System.out.println("\n------------------------------------------------------------------------");
		String [] presidents = new String [] {"Joe Biden", "Donald Trump", "Barak Obama", "", "Bill Clinton"};
		
		System.out.println(presidents.length);
		System.out.println(presidents[1]);
		System.out.println(presidents[4]);
		
		//or	without  new String [] 
		// This is mostly used, 99%
		// here allPresident is called 'Array Name' or 'Array Object'
		System.out.println("\n------------------------------------------------------------------------");
		String [] allPresident = {"Joe Biden", "Donald Trump", "Barak Obama", "", "Bill Clinton"};
		System.out.println(allPresident[2]);
		System.out.println(allPresident.length);
		
		// How to print an Array?
		// What will happen if you directly print by Array name or array object? Ans: you will get the "Array ID"
		System.out.println(allPresident);
		
		// next line, important interview question: How can you print all the data's from an Array
		// Array vs Arrays, 
		// Array is a collection of same data type
		// Arrays is a class which is used to manipulate the Array
		
		// very very important -->  toString(object) method
		// no need to memorize below definition: Just memorize: they surrounded by [], inside data separated by coma
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		System.out.println(Arrays.toString(allPresident));
		
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] gender = {'F', 'F', 'F', 'M', 'F', 'M'};
		System.out.println(Arrays.toString(gender));
		
		System.out.println("\n------------------------------------------------------------------------");
		// int type
		int [] age = {21, 56, 78, 81, 23, 56};
		System.out.println(age.length);
		System.out.println(age[3]);
		System.out.println(age[0]);
		// System.out.println(age[8]);
		// System.out.println(age[-1]);
		// interview question: What is the exception you got if Array is out of range?
		// Ans: ArrayIndexOutOfBoundsException
		
		System.out.println("\n------------------------------------------------------------------------");
		// boolean type
		boolean [] fullTimeStudent = {true, true, false, true, false};
		System.out.println(fullTimeStudent[3]);
		
		
		/*
		 Summary:
		 
		 What is an Array?
		 -- Array is a collection of same data type
		
		 How to write an Array?
		 int [] age = {21, 56, 78, 81, 23, 56};
		
		 what is length properties? what is size of an Array?
		 'length' preserve the size of an array
		 
		 How to print an Array?
		  System.out.println(Arrays.toString(array Name));
		 
		 */
		
		
	}

}
